public class LCM{
  public static void main(String[] args){
    if(args.length != 0){
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int greater = num1 > num2?num1:num2;
      int smaller = num1 < num2?num1:num2;
      int i = greater;
      while(i % smaller > 0){
        i+=greater;
      }
      System.out.println("LCM of " + num1 + "," + num2 + " is " + i);
      
    }
  }
}