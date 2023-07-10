package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     
   double turkce , mat , fen , sosyal , beden , ortalama;
   
        
        
        Scanner scan = new Scanner (System.in);
      
        System.out.print("Turkce : ");
        turkce = scan.nextDouble();
        
         System.out.print("Matematik : ");
        mat = scan.nextDouble();
        
         System.out.print("Fen : ");
        fen = scan.nextDouble();
        
         System.out.print("Sosyal : ");
        sosyal = scan.nextDouble();
        
         System.out.print("Beden : ");
        beden = scan.nextDouble();
        
        ortalama = (turkce + fen + mat + sosyal + beden) / 5;
        
        if(ortalama >= 50){
            System.out.println("Gectiniz " +  ortalama);
            
        }
        else{
            System.out.println("gecemediniz " + ortalama);
        }
        
    }

}


