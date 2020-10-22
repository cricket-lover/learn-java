public class ConvertToCentigrade {
  public static double getCentigrade(double fahrenheit){
    return (fahrenheit - 32) * 5/9;
  }

  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
      return;
    }

    double fahrenheit = Float.parseFloat(args[0]);
    System.out.println("Temperature of " + fahrenheit + " degrees fahrenheit in centigrade is " +  getCentigrade(fahrenheit));
  }
}