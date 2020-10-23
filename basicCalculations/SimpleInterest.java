public class SimpleInterest{
  public static double getSimpleInterest(int principle, int rate, int period){
    return (principle * rate * period) / 100.00;
  }

  public static void main(String [] args){
    if(args.length < 3){
      System.out.println("Insufficient arguments");
    }

    int principle = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    System.out.println("Simple Interest of principle:" + principle + ", rate:" + rate + ", period:" + period + " is " + getSimpleInterest(principle, rate, period));
  }
}