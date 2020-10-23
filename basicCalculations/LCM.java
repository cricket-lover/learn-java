public class LCM {
  public static int getLcm(int num1, int num2){
    int greater = Math.max(num1, num2);
    int smaller = Math.min(num1, num2);
    int lcm = greater;

    while(lcm % smaller > 0){
      lcm += greater;
    }
    return lcm;
  }

  public static void main(String[] args){
    if(args.length < 2){
      System.out.println("Insufficient arguments");
      return;
    }

    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    System.out.println("LCM of " + num1 + "," + num2 + " is " + getLcm(num1, num2));
  }
}