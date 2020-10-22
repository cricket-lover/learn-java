public class GreatestOfThree{
  public static void main(String[] args){
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    int greaterOfTwo = num1 > num2 ? num1 : num2;
    int greatestOfThree = num3 > greaterOfTwo ? num3 : greaterOfTwo;
    System.out.println("Greatest of " + num1 + "," + num2 + "," + num3 + " is " + greatestOfThree);
  }
}