public class RemoveZeroes {

  public static void displayList(int[] list) {
    for (int element : list) {
      System.out.println(element);
    }
  }

  public static void copy(int[] source, int[] destination, int start, int end) {
    for (int index = 0; index <= end; index++) {
      destination[start + index] = source[index];
    }
  }

  public static int[] removeZeroesFrom(int[] numbers) {
    int[] numbersWithoutZeroes = new int[numbers.length];
    int countOfNonZeroes = 0;

    for (int index = 0; index <= numbers.length - 1; index++) {
      if (numbers[index] != 0) {
        numbersWithoutZeroes[countOfNonZeroes] = numbers[index];
        countOfNonZeroes++;
      }
    }

    int[] resultedArray = new int[countOfNonZeroes];
    copy(numbersWithoutZeroes, resultedArray, 0, resultedArray.length - 1);

    return resultedArray;
  }

  public static void main(String[] args) {
    int[] numbers = { 1, 0, 3, 4, 5, 0, 7, 0, 9 };
    int[] numbersWithoutZeroes = removeZeroesFrom(numbers);
    displayList(numbersWithoutZeroes);
  }
}
