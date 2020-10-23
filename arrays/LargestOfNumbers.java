public class LargestOfNumbers {

  public static int getLargestNumber(int[] listOfNumbers) {
    int largest = 0;

    for (int index = 0; index <= listOfNumbers.length - 1; index++) {
      largest = Math.max(largest, listOfNumbers[index]);
    }
    return largest;
  }

  public static void main(String[] args) {
    int[] listOfNumbers = { 5, 2, 3, 1, 0, 19, 4 };
    int largest = getLargestNumber(listOfNumbers);
    System.out.println("Largest number among the list is " + largest);
  }
}
