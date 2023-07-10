package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("sayi giriniz: ");
        int i = scan.nextInt();
        int sonuc = 1;
        while (i > 0) {

            sonuc = sonuc * i;

            i--;

        }
        System.out.println("sonuc  : " + sonuc);

    }

}
