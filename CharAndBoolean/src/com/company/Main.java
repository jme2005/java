package com.company;

public class Main {

    public static void main(String[] args) {
        int ctr = 0;
        for (int i = 1; i < 10000; i++) {
            if (isPrime(i)) {
                System.out.println(i + " is prime.");
                ctr += 1;
            }
            if (ctr > 500) {
                break;
            }
        }
        System.out.println(factorial(6));
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static int factorial(int n){

        if(n==1){
            return 1;
        }else{
            n *= factorial(n-1);
        }
        return n;
    }
}


