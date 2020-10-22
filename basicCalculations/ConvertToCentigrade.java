public class ConvertToCentigrade {
  public static void main(String[] args){
    if(args.length != 0){
      double fahrenheit = Float.parseFloat(args[0]);
      double centigrade = (fahrenheit - 32) * 5/9;
      System.out.println("Temperature of " + fahrenheit + " degrees fahrenheit in centigrade is " +  centigrade);
    }
  }
}