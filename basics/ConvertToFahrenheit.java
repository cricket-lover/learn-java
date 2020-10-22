public class ConvertToFahrenheit{
  public static void main(String[] args){
    int centigrade = Integer.parseInt(args[0]);
    double fahrenheit = (centigrade * 9/5.00) + 32;
    System.out.println("Temperature of " + centigrade + " degrees centigrade in fahrenheit is " +  fahrenheit);
  }
}