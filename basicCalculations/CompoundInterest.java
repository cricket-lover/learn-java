public class CompoundInterest {
  
  public static double getCompoundInterest(int principle, int rate, int period){
    double totalAmount = principle;

    for(int count = 1; count <= period; count++){
      totalAmount = totalAmount * (1 + rate/100.00);
    }
    return totalAmount - principle;
  }

  public static void main(String [] args){
    if(args.length < 3){
      System.out.println("Insufficient arguments");
      return;
    }

    int principle = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    double compoundInterest = getCompoundInterest(principle, rate, period);
    String message = "C.I of principle:" + principle + ", rate:" + rate + ", period:" + period + " is "; 
    System.out.println(message + compoundInterest);
  }
  
}