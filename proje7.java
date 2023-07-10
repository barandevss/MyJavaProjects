package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
     
       double hava;
        Scanner scan = new Scanner (System.in);
       
        System.out.print("hava sicakligi kac derece : ");
        hava = scan.nextDouble();
        
        if(hava >= 30 ){
            System.out.println("Yuzme etkinligi oneriyorum");
        }
        else if(hava >= 5 && hava < 30){
            System.out.println("Sinema etkinligi oneriyorum");
        }
        else{
            System.out.println("Kayak etkinligi oneriyorum");
        }
        
        
    }

}


