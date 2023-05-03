package org.example;

public class Main {

    public static void main(String[] args) {
        BinOps bins = new BinOps();
        System.out.println(bins.mult("1011","1011"));
        System.out.println(bins.sum("10101","10000001"));
        System.out.println(bins.sum("1011","10101"));
    }
}