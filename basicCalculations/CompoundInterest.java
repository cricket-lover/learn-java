public class CompoundInterest{
  public static double getCompoundInterest(int principle, double rate, int period){
    double totalAmount = principle;

    for(int count = 0; count < period; count++){
      totalAmount = totalAmount * (1+rate);
    }
    return totalAmount - principle;
  }

  public static void main(String [] args){
    if(args.length < 3){
      System.out.println("Insufficient arguments");
      return;
    }

    int principle = Integer.parseInt(args[0]);
    double rate = Integer.parseInt(args[1])/100.00;
    int period = Integer.parseInt(args[2]);
    double compoundInterest = getCompoundInterest(principle, rate, period);
    System.out.println("Compound Interest of principle:" + principle + ", rate:" + rate + ", period:" + period + " is " + compoundInterest);
  }
}