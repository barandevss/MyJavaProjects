package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
       Scanner scan = new Scanner (System.in);
    
        int toplam = 0;
        int input;
       
        while(true){
            System.out.println("sayi giriniz : ");
            input = scan.nextInt();
            
            if (input < 0){
                System.out.println("negatif girdiniz , program bitti");
                System.out.println("girilen tek sayilar toplam : " + toplam);
                break;
            }
            
            if(input % 2 == 1){
                toplam = toplam + input;
            }
        }
        
        
        
        
        
        
        
        
        
        
        
        
        

    }

}


