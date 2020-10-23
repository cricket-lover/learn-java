public class Primes{
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

  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
      return;
    }
    
    int num = Integer.parseInt(args[0]);
    String message = num + " is " + (isPrime(num)? "a prime number" : "not a prime number");
    System.out.println(message);
  }
}