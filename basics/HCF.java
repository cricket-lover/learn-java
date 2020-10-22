public class HCF{
  public static void main(String [] args){
    if(args.length != 0){
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int divisor = num1;
      int dividend = num2;
      int remainder;
      while(divisor > 0)
      {
        remainder = dividend%divisor;
        dividend = divisor;
        divisor = remainder;
      }
      System.out.println("GCD of " + num1 + "," + num2 + " is " + dividend);
    }
  }
}