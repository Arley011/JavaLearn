import com.sun.javafx.scene.layout.region.Margins;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.print.DocFlavor;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static Document getPage() throws IOException {
        String url = "https://weather.com/weather/5day/l/1cbface97a9a11e2907a69007f5646d2de5a7b042c2055ef0751998d354a0e5a";
        Document page = Jsoup.parse(new URL(url), 3000);
        return page;
    }

    private static Pattern pattern2 = Pattern.compile("\\d{2}$|\\d{1}$");

   private static String getDateFromString2(String stringDate) throws Exception{
       Matcher matcher = pattern2.matcher(stringDate);
       if(matcher.find()){
           return matcher.group();
       }
        throw new Exception("Can't extract date from string!");
    }
    private static Pattern pattern1= Pattern.compile("^\\d{2}|^\\d{1}");

    private static String getDateFromString1(String stringDate) throws Exception{
        Matcher matcher = pattern1.matcher(stringDate);
        if(matcher.find()){
            return matcher.group();
        }
        throw new Exception("Can't extract date from string2!");
    }

    private static String MineConverter(Element name) throws Exception {
        String temp = name.select("td[class=temp]").text();
        temp = temp.replaceAll("°","");
        String temp1,temp2;

        if(temp.contains("--")){
            temp1 = "--";
            temp2 = String.valueOf(((((Integer.valueOf(getDateFromString2(temp)))-32)*5)/9));
        }
        else{
            temp1 = String.valueOf(((((Integer.valueOf(getDateFromString1(temp)))-32)*5)/9));
            temp2 = String.valueOf(((((Integer.valueOf(getDateFromString2(temp)))-32)*5)/9));
        }
        return temp1+"/"+temp2;
    }


    public static void main(String[] args) throws Exception {
        Document page = getPage();
        Element tableWth = page.select("div[id=main-DailyForecast-1c4c02b8-a3fd-4069-b54e-93db18c89c1b]").first();
        Elements names = tableWth.select("tr[class=clickable closed]");
        for (Element name: names) {
            String date = name.select("span[class=day-detail clearfix]").text();
            System.out.format("%-10s %-30s %-10s %-10s %-20s %-10s\n",date,"Description","High/Low","Precip","Wind","Humidity");

            System.out.format(
                    "%-42s %-10s %-8s %-23s %-10s\n",
                    name.select("td[class=description]").text(),
                    MineConverter(name),
                    name.select("td[class=precip]").text(),
                    name.select("td[class=wind]").text(),
                    name.select("td[class=humidity]").text()
            );
        }
    }
}
