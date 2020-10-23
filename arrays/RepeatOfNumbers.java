public class RepeatOfNumbers {

  public static void displayList(int[] list) {
    for (int element : list) {
      System.out.println(element);
    }
  }

  public static int[] repeat(int noOfTimes, int term) {
    int[] repeatedList = new int[noOfTimes];

    for (int index = 0; index <= repeatedList.length - 1; index++) {
      repeatedList[index] = term;
    }
    return repeatedList;
  }

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("Insufficient arguments");
      return;
    }

    int numOfTimes = Integer.parseInt(args[0]);
    int term = Integer.parseInt(args[1]);
    int[] repeatedList = repeat(numOfTimes, term);

    displayList(repeatedList);
  }
}
