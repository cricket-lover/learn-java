public class ConcatenateArrays {

  public static void displayList(int[] list) {
    for (int element : list) {
      System.out.println(element);
    }
  }

  public static void copy(int[] source, int[] destination, int startIndex) {
    for (int index = 0; index <= source.length - 1; index++) {
      destination[startIndex + index] = source[index];
    }
  }

  public static int[] concat(int[] first, int[] second) {
    int[] resultedArray = new int[first.length + second.length];

    copy(first, resultedArray, 0);
    copy(second, resultedArray, first.length);

    return resultedArray;
  }

  public static void main(String[] args) {
    int[] first = { 1, 6, 8, 0, 9 };
    int[] second = { 4, 5 };

    int[] concatenatedArray = concat(first, second);
    displayList(concatenatedArray);
  }
}
