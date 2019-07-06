package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        Thread.sleep(1000);
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
        Thread thread = new Thread(new Runner());
        thread.start();

    }
}

class Runner implements Runnable{//is better

    @Override
    public void run() {
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my thread!"+i);
        }
    }
}

class MyThread extends Thread{
    public void run(){
        for(int i=0;i<1000;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello from my thread!"+i);
        }
    }
}
