package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        int a , b , c;
    
        Scanner scan = new Scanner (System.in);
         System.out.println("ilk sayiyi giriniz: ");
         a = scan.nextInt();
         
         System.out.println("ikinci sayiyi giriniz: ");
         b = scan.nextInt();
         
         System.out.println("ucuncu sayiyi giriniz: ");
         c = scan.nextInt();
         
         if(a > b &&  a > c){
             if(b > c){
                 System.out.println("a > b > c " );
      
             }else {
                 System.out.println("a > c > b");
             }
             
         }
         else if(b > a && b > c){
             if(a > c){
                 System.out.println("b > a > c");
             }else{
                 System.out.println("b > c > a");
             }
         }
         
         else if(c > a && c > b){
             if(a > b){
                 System.out.println("c > a > b");
             }else{
                 System.out.println("c > b > a");
             }
             
         }else{
             System.out.println("gecerli degerler giriniz!!!!1");
         }
         
        
        
        
    }

}


