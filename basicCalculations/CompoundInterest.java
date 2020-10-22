public class CompoundInterest{
  public static void main(String [] args){
    if(args.length >= 3){
      int principle = Integer.parseInt(args[0]);
      double rate = Integer.parseInt(args[1])/100.00;
      int period = Integer.parseInt(args[2]);
      double totalAmount = principle;
      int count = 0;
      while(count<period){
        totalAmount = totalAmount * (1+rate);
        count++; 
      }
      double compoundInterest = totalAmount - principle;
      System.out.println("Compound Interest of principle:" + principle + ", rate:" + rate + ", period:" + period + " is " + compoundInterest);
    }else{
      System.out.println("Please provide a valid input");
    }
  }
}