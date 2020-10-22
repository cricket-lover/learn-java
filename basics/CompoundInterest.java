public class CompoundInterest{
  public static void main(String [] args){
    if(args.length != 0){
      int principle = Integer.parseInt(args[0]);
      int rate = Integer.parseInt(args[1]);
      int period = Integer.parseInt(args[2]);

    double compoundPrinciple = principle;
    int i = 0;
    while(i<period){
      compoundPrinciple = compoundPrinciple * (1+rate);
      i++; 
    }
    // for(int i=t; t>0; t--) {
    //   a = a *(1+r);
    // }

    double compoundInterest = compoundPrinciple - principle;
    System.out.println("Compound Interest of principle:" + principle + ", rate:" + rate + ", period:" + period + " is " + compoundInterest);
    }
  }
}