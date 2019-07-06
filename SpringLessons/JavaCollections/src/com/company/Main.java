package com.company;

import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        NavigableSet<Integer> set = new TreeSet<>();
        for(int i=1;i<=10;i++){
            set.add(i);
        }
        System.out.println(set);
        getNext(set,10);


    }

    public static void getNext(NavigableSet<Integer> set, Integer e){
        System.out.println(set.headSet(e));
    }
}
