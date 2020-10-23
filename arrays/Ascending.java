public class Ascending {

  public static boolean isAscending(int[] numbers) {
    boolean isStrictlyAscending = true;

    for (int index = 0; (index < numbers.length - 1); index++) {
      if (!isStrictlyAscending) {
        return isStrictlyAscending;
      }

      isStrictlyAscending = numbers[index] < numbers[index + 1];
    }

    return isStrictlyAscending;
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 2, 3, 3 };
    System.out.println(isAscending(numbers));
  }
}
