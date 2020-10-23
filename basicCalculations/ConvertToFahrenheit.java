public class ConvertToFahrenheit{
  public static double getFahrenheit(double centigrade){
    return (centigrade * 9/5.00) + 32;
  }

  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
      return;
    }
    
    double centigrade = Double.parseDouble(args[0]);
    String message = "Temperature of " + centigrade + " degrees centigrade in fahrenheit is ";
    System.out.println(message + getFahrenheit(centigrade));
  }
}