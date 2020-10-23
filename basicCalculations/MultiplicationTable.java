public class MultiplicationTable{
  public static void printMultiplicationTable(int num, int limit){
    for(int mulWith = 1; mulWith <= limit; mulWith++){
      System.out.println(num + " x " + mulWith + " = " + num * mulWith);
    }
  }
  
  public static void main(String [] args){
    if(args.length < 2){
      System.out.println("Insuffiecient arguments");
    }

    int num = Integer.parseInt(args[0]);
    int limit = Integer.parseInt(args[1]);
    printMultiplicationTable(num, limit);
  }
}