public class SimpleInterest{
  public static double getSimpleInterest(int principle, int rate, int period){
    return (principle * rate * period) / 100.00;
  }

  public static void main(String [] args){
    if(args.length < 3){
      System.out.println("Insufficient arguments");
      return;
    }

    int principle = Integer.parseInt(args[0]);
    int rate = Integer.parseInt(args[1]);
    int period = Integer.parseInt(args[2]);
    String message = "Simple Interest of principle:" + principle + ", rate:" + rate + ", period:" + period + " is ";
    System.out.println(message + getSimpleInterest(principle, rate, period));
  }
}