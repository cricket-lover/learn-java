public class Fibonacci{
  public static void main(String [] args){
    if(args.length != 0){
      int num = Integer.parseInt(args[0]);
      int prev = 0;
      int curr = 1;
      for(int i=0;i<=num;i++){
      if(i == 1){
        System.out.println(prev);
      }
      if(i == 2){
        System.out.println(curr);
      }
      if(i>2){
        int next = prev+curr;
        System.out.println(next);
          prev = curr;
          curr = next;
        }
      }
    }
  }
}