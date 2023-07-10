package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        double kdvprice , kdv , price , newprice;
        kdv = 0.18;
        
        Scanner scan = new Scanner (System.in);
        System.out.print("Urunun fiyatini giriniz : ");
        price = scan.nextInt();
        
        
        kdvprice = price * kdv;
        newprice = price + kdvprice;
        
        System.out.println("kdv ucreti : " + kdvprice);
        System.out.println("urunun kdv li ucreti : " + newprice);
        
        
        
        
        
        
        
        
        
        

    }

}


