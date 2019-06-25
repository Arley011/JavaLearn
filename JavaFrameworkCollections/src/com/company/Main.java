package com.company;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	    List<Integer> arrayList = new ArrayList<>();//Java 7+ dont need to write type in second '<>'. Possible to use only referenced types(classes?)
	    for(int i = 0; i<10; i++)
        {
            arrayList.add(i); //Adding element
        }
        System.out.println(arrayList);

        System.out.println(arrayList.get(1));
        //System.out.println(arrayList.get(99));//GET

        System.out.println(arrayList.size());// SIZE

        arrayList.remove(5);//not effective to remove sth from beginning or mid cuz [1,2,3,4,5] => [1,2, ,4,5] => [1,2, ,<-4,<-5] => [1,2,4,5]
        System.out.println(arrayList);

        String str = new String("ss");
        Scanner s = new Scanner(System.in);
        System.out.println("Input sth");
        int s1 = s.nextInt();
        System.out.println(s1);
    }
}
