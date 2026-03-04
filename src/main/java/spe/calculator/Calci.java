package spe.calculator;
public class Calci{
   public static double squareRoot(double n){
    if(n<0){
        throw new IllegalArgumentException("Invalid input negative number");

    }
    return Math.sqrt(n);
   }

   public static long factorial(int n)
   {
    if(n<0 || n>20){
        throw new IllegalArgumentException("Number can't be negative and should be less than 20");
      }
     int fact=1;
    for(int i=1;i<=n;i++){
    fact*=i;
   }
    return fact;
 }
 public static double naturalLog(double n){
    if(n<=0){
        throw new IllegalArgumentException("Input must be > 0");
    }
    return Math.log(n);
 }

 public static double power(double base,double exp){
    return Math.pow(base,exp);
 }
}