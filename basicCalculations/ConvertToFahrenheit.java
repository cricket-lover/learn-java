public class ConvertToFahrenheit{
  public static double getFahrenheit(double centigrade){
    return (centigrade * 9/5.00) + 32;
  }

  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
      return;
    }
    
    double centigrade = Float.parseFloat(args[0]);
    System.out.println("Temperature of " + centigrade + " degrees centigrade in fahrenheit is " + getFahrenheit(centigrade));
  }
}