public class MultiplicationTable{
  public static void main(String [] args){
    if(args.length != 0){
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      int i = 1;
      while(i<=num2){
        System.out.println(num1 + " x " + i + " = " + num1*i);
        i++;
      }
    }
  }
}