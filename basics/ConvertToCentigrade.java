public class ConvertToCentigrade {
  public static void main(String[] args){
    int fahrenheit = Integer.parseInt(args[0]);
    double centigrade = (fahrenheit - 32) * 5/9;
    System.out.println("Temperature of " + fahrenheit + " degrees fahrenheit in centigrade is " +  centigrade);
  }
}