public class Average {

  public static int getSum(int[] listOfNumbers) {
    int sum = 0;

    for (int index = 0; index <= listOfNumbers.length - 1; index++) {
      sum += listOfNumbers[index];
    }
    return sum;
  }

  public static double getAverage(int[] listOfNumbers) {
    int sum = getSum(listOfNumbers);
    return sum / (double) listOfNumbers.length;
  }

  public static void main(String[] args) {
    int[] listOfNumbers = { 2, 2, 3, 4, 5 };
    double average = getAverage(listOfNumbers);
    System.out.println("Average of the list is " + average);
  }
}
