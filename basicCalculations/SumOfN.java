public class SumOfN{
  public static int getSumOfN(int num){
    int sum = 0;

    for(int count = 1; count <= num; count++){
      sum += count;
    }
    return sum;
  }
  
  public static void main(String [] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
    }
      
    int num = Integer.parseInt(args[0]);
    System.out.println("Sum of natural numbers upto " + num + " is " + getSumOfN(num));
  }
}