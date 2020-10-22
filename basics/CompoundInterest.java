public class CompoundInterest{
  public static void main(String [] args){
    if(args.length >= 3){
      int principle = Integer.parseInt(args[0]);
      double rate = Integer.parseInt(args[1])/100.00;
      int period = Integer.parseInt(args[2]);

      double compoundPrinciple = principle;
      int count = 0;
      while(count<period){
        compoundPrinciple = compoundPrinciple * (1+rate);
        count++; 
      }
      double compoundInterest = compoundPrinciple - principle;
      System.out.println("Compound Interest of principle:" + principle + ", rate:" + rate + ", period:" + period + " is " + compoundInterest);
    }
  }
}