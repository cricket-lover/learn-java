public class CompareCharArrays {

  public static boolean compareArrays(char[] first, char[] second) {
    if (first.length != second.length) {
      return false;
    }

    boolean areArraysEqual = true;

    for (int index = 0; index <= first.length - 1; index++) {
      if (!areArraysEqual) {
        return areArraysEqual;
      }

      areArraysEqual = first[index] == second[index];
    }
    return areArraysEqual;
  }

  public static void main(String[] args) {
    char[] first = { 'p', 'h', 'a', 'n', 'i' };
    char[] second = { 'p', 'h', 'a', 'n', 'i' };

    boolean areArraysEqual = compareArrays(first, second);
    System.out.println(areArraysEqual);
  }
}
