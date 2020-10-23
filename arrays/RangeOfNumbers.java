public class RangeOfNumbers {

  public static void displayRangeOfNum(int[] numbers) {
    for (int currentNumber : numbers) {
      System.out.println(currentNumber);
    }
  }

  public static int[] range(int from, int to, int step) {
    int[] rangeOfNum = new int[((Math.abs(to - from) + 1) / Math.abs(step))];

    for (int index = 0; index <= rangeOfNum.length - 1; index++) {
      rangeOfNum[index] = (index * step) + from;
    }
    return rangeOfNum;
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }

    int from = Integer.parseInt(args[0]);
    int to = Integer.parseInt(args[1]);
    int step = args.length == 3 ? Integer.parseInt(args[2]) : 1;
    int[] rangeOfNum = range(from, to, step);

    displayRangeOfNum(rangeOfNum);
  }
}
