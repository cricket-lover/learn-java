public class ConvertToFahrenheit{
  public static void main(String[] args){
    if(args.length != 0){
      double centigrade = Float.parseFloat(args[0]);
      double fahrenheit = (centigrade * 9/5.00) + 32;
      System.out.println("Temperature of " + centigrade + " degrees centigrade in fahrenheit is " +  fahrenheit);
    }
  }
}