package main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double num1, num2, sum, subtract, multi , division;
        int process;
        
   
        Scanner scan = new Scanner (System.in);
      
        System.out.print("Enter the first number : ");
        num1 = scan.nextDouble();
        
        System.out.print("Enter the second number : ");
        num2 = scan.nextDouble();
        
        System.out.print("Enter the process number: ");
        process = scan.nextInt();
        
        switch (process){
            case 1:
                sum = num1 + num2;
                System.out.println("Sum : " + sum);
                break;
                
            case 2:
                if(num1 > num2){
                    subtract = num1 - num2;
                }
                
                else{
                    subtract = num2 - num1;
                }
                System.out.println("Subtraction : " + subtract);
                break;
                
            case 3:
                multi = num1 * num2;
                System.out.println("Multiplication : " + multi);
                break;
                
            case 4:
                division = num1 / num2;
                System.out.println("Division : " + division);
                break;
                
        }
        
        
        
        
    }

}


