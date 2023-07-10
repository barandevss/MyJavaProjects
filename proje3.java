package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
       double pi, r , alan , cevre;
       pi = 3.14;
        

        Scanner scan = new Scanner (System.in);
        
        System.out.print("Yaricap degerini giriniz: ");
        r = scan.nextDouble();
        
        alan = pi * r * r;
        cevre = 2 * pi * r;
        
        System.out.println("Dairenin alani : " + alan);
        
        System.out.println("Dairenin cevresi : " + cevre);
        
        
        
        
        
        

    }

}


