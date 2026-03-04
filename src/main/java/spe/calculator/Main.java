package spe.calculator;
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println();
            System.out.println("Enter 1 :Square Root (√n) ");
            System.out.println("Enter 2 : Factorial (n!)");
            System.out.println("Enter 3 : Natural log (ln(n))");
            System.out.println("Enter 4 : Power Function (n^a)");
            System.out.println("Enter 0 : Exit");
            System.out.println("Enter Your Choice");
            double n;
            char ch=sc.next().charAt(0);
            if(ch=='0')
                break;
            switch(ch){
                case '1': 
                    System.out.println(".....Calculating Square Root......");
                    System.out.println("Enter a number");
                    n=sc.nextDouble();
                   try{
                    System.out.println(Calci.squareRoot(n));
                   }
                   catch(IllegalArgumentException e){
                    System.out.println("Error: "+ e.getMessage());
                   }
                    
                    break;

                case '2': 
                    System.out.println(".....Calculating Factorial......");
                    System.out.println("Enter a number");
                   int n1=sc.nextInt();
                    try{
                  System.out.println( Calci.factorial(n1));
                   
                    }
                    catch(Exception e){
                    System.out.println("Error:"+e.getMessage());
                    }
                    break;

                case '3':
                    System.out.println("....Printing Natural Log....");
                   n=sc.nextInt();
                   try{
               
                    System.out.println(Calci.naturalLog(n));
                 
                   }
                   catch(Exception e){
                    System.out.println("Input must be positive and greater than 0  ");
                    break;
                   }

                case '4':
                    System.out.println(".....Calculating power of a function.....");
                    System.out.println("Enter base");
                    n=sc.nextDouble();
                    System.out.println("Enter Exponent");
                    double a=sc.nextDouble();
                try{
                    System.out.println(Calci.power(n,a));
                }
                catch(Exception e){
                    System.out.println("Error: "+e.getMessage());
                }
                    break;
                default:
                    System.out.println("Invalid!!..Enter correct choice...");


            }

            try{
                Thread.sleep(500);

            }catch(InterruptedException e){
            }

        }while(true);
        sc.close();
    }
}


