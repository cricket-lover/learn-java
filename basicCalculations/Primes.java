public class Primes {

  public static int getNumOfFactors(int num){
    int numOfFactors = 1;
    
    for(int currNumber = 1; currNumber <= num/2; currNumber++){
      if(num % currNumber == 0){
        numOfFactors++;
      }
    }
    return numOfFactors;
  }

  public static boolean isPrime(int num){
    int numOfFactors = getNumOfFactors(num);
    return numOfFactors <= 2 ;
  }

  public static void printPrimesInRange(int start, int end){
    for(int count = start; count <= end; count++){
      if(isPrime(count)){
        System.out.println(count);
      }
    }
  }

  public static void main(String[] args){
    if(args.length < 2){
      System.out.println("Insufficient arguments");
      return;
    }
    
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int start = Math.min(num1, num2);
    int end = Math.max(num1, num2);
    printPrimesInRange(start, end);
  }
  
}