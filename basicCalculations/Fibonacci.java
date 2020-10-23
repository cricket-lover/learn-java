public class Fibonacci {

  public static void printFibonacci(int noOfTerms){
    int currentTerm = 0;
    int nextTerm = 1;

    for(int term = 0; term < noOfTerms; term++){
      System.out.println(currentTerm);
      nextTerm = currentTerm + nextTerm;;
      currentTerm = nextTerm - currentTerm;
    }
  }

  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
      return;
    }

    int noOfTerms = Integer.parseInt(args[0]);
    printFibonacci(noOfTerms);
  }
  
}  