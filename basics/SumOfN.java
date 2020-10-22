public class SumOfN{
  public static void main(String [] args){
    if(args.length != 0){
      int num = Integer.parseInt(args[0]);
      int result = 0;
      
      for(int i=1;i<=num;i++){
        result = result + i;
      }
      System.out.println(result);
      
    }
  }
}