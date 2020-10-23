public class HCF{
  public static int getHcf(int num1, int num2){
    int divisor = num1;
    int dividend = num2;
    int remainder;

    while(divisor > 0){
      remainder = dividend % divisor;
      dividend = divisor;
      divisor = remainder;
    }
    return dividend;
  }

  public static void main(String [] args){
    if(args.length < 2){
      System.out.println("Insufficient arguments");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]); 
    System.out.println("GCD of " + num1 + "," + num2 + " is " + getHcf(num1, num2));
  }
}