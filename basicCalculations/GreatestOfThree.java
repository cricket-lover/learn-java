public class GreatestOfThree{
  public static int getGreatestOfThree(int num1, int num2, int num3){
    int greaterOfTwo = Math.max(num1, num2);
    return Math.max(greaterOfTwo, num3);
  }

  public static void main(String[] args){
    if(args.length < 3){
      System.out.println("Insufficient arguments");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    String message = "Greatest of " + num1 + "," + num2 + "," + num3 + " is ";
    System.out.println(message + getGreatestOfThree(num1, num2, num3));
  }
}