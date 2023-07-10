package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
 
         
         System.out.println("sayi giriniz: ");
         int i = scan.nextInt();
           
         int k = 1;
         while( k <= i){
             System.out.println(k);
             k = k * 2;
         }
                
        

       
    }

}
