public class ConvertToCentigrade {
  public static double getCentigrade(double fahrenheit){
    return (fahrenheit - 32) * 5/9;
  }

  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
      return;
    }

    double fahrenheit = Double.parseDouble(args[0]);
    String message = "Temperature of " + fahrenheit + " degrees fahrenheit in centigrade is ";
    System.out.println(message +  getCentigrade(fahrenheit));
  }
}