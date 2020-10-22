public class Fibonacci{

  public static void printFibonacci(int limit){
    int currentTerm = 0;
    int nextTerm = 1;

    for(int term=0; term<limit; term++){
      System.out.println(currentTerm);
      nextTerm = currentTerm + nextTerm;;
      currentTerm = nextTerm - currentTerm;
    }
  }

  public static void main(String [] args){
    if(args.length == 0){
      System.out.println("Please provide a valid input");
      return;
    }

    int limit = Integer.parseInt(args[0]);
    printFibonacci(limit);
  }
}