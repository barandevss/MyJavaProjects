package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a, b, c;

        Scanner scan = new Scanner(System.in);

        System.out.println("sayilari giriniz : ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

      if(a > b && a > c){
          if(b > c){
              System.out.println("a > b > c");
          }else {
              System.out.println("a > c > b");
          }
      }        
        
        
        
    }

}
