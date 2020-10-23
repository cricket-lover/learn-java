public class Factorial{
  public static int getFactorial(int num){
    int result = 1;
    for(int count = num; count >= 1; count--){
      result = result * count;
    }
    
    return result;
  }

  public static void main(String [] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
      return;
    }

    int num = Integer.parseInt(args[0]);   
    System.out.println("Factorial of " + num + " is " + getFactorial(num));
  }
}