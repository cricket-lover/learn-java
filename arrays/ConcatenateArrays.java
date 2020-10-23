public class ConcatenateArrays {

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

  public static int[] concat(int[] first, int[] second) {
    int[] resultedArray = new int[first.length + second.length];

    copy(first, resultedArray, 0, first.length - 1);
    copy(second, resultedArray, first.length, second.length - 1);

    return resultedArray;
  }

  public static void main(String[] args) {
    int[] first = { 1, 2, 3 };
    int[] second = { 4, 5 };

    int[] concatenatedArray = concat(first, second);
    displayList(concatenatedArray);
  }
}
