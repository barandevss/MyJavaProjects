package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        
        int km , age , type;
        double kmprice,yasindirimi,tipindirimi;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Enter the km : "  );
        km = scan.nextInt();
        
        System.out.println("Enter the age : "  );
        age = scan.nextInt();
       
       System.out.println("Enter the type ( 1 = One way , 2 = Two way) : "  );
        type = scan.nextInt();
        
        
        
        if(age > 0 && km > 0 && (type == 1 || type == 2)){
               kmprice =  km * 0.10; 
               if(age < 12 ){
                    yasindirimi = kmprice * 0.50;
                   kmprice = kmprice - yasindirimi;
               }
               else if(age>=12 && age<=24){
                   yasindirimi = kmprice *0.10;
                   kmprice = kmprice - yasindirimi;
 
               }     
               
               else if(age >= 65){
                   yasindirimi = kmprice * 0.30;
                   kmprice = kmprice - yasindirimi;
               }
               else{
                   yasindirimi = 0;
               }
               
               
               if(type == 2 ){
                   tipindirimi = kmprice * 0.20;
                   kmprice = (kmprice - tipindirimi) * 2;
               }
               System.out.println("Bilet tutari : " + kmprice);
        }
        else {
            System.out.println("Girdiler yanlis");
        }
        
        
        
        
        
    }

}


