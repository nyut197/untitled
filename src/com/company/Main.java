package com.company;

public class Main {

    public static void main(String[] args) {
//        int n0 = 1;
//        int n1 = 1;
//        int n2;
//        System.out.print(n0+" "+n1+" ");
//        for(int i = 3; i <= 19; i++) {
//            n2 = n0 + n1;
//            System.out.print(n2 + " ");
//            n0 = n1;
//            n1 = n2;
//        }
//        double b;
//        for (int i = 1; i <= 20; i++) {
//            b = i * 2.54;
//            System.out.println(i + "=" + b + "см");
//        }
        int a = 17;
        for (int i = 2; i < a; i++) {
            if (a % i== 0) {
                System.out.print("Составное");
                break;
            } else {
                System.out.print("Простое");
                break;
            }
        }
    }
}
