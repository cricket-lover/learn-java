public class Factorial{
  public static void main(String [] args){
    if(args.length != 0){
      int num = Integer.parseInt(args[0]);
      int result = 1;
      while(num>=1){
        result = result * num;
        num--;
      }
      System.out.println(result);
    }
  }
}