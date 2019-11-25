package com.csp.test3111;

public class Main {
    public static void main(String[] args) {
        String lock = new String("");
        ThreadP threadP = new ThreadP(new P(lock));
        ThreadC threadC = new ThreadC(new C(lock));
        threadP.start();
        threadC.start();
    }
}
