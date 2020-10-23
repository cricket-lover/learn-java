public class CollatzSequence {
  public static boolean isEven(int num){
    return num % 2 == 0;
  }

  public static void printCollatzSequence(int start){
    int end = start;
    
    while(end > 1){
      System.out.println(end);
      end = isEven(end) ? end/2 : (3 * end) + 1;
    }
    System.out.println(end);
  }

  public static void main(String[] args){
    if(args.length == 0){
      System.out.println("Insufficient arguments");
      return;
    }

    int start = Integer.parseInt(args[0]);
    printCollatzSequence(start);
  }
}