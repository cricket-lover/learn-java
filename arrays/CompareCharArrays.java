public class CompareCharArrays {

  public static boolean compareArrays(char[] charArray1, char[] charArray2) {
    if (charArray1.length != charArray2.length) {
      return false;
    }

    boolean areArraysEqual = true;

    for (int index = 0; index <= charArray1.length - 1; index++) {
      if (!areArraysEqual) {
        return areArraysEqual;
      }

      areArraysEqual = charArray1[index] == charArray2[index];
    }
    return areArraysEqual;
  }

  public static void main(String[] args) {
    char[] charArray1 = { 'p', 'h', 'a', 'n', 'i' };
    char[] charArray2 = { 'p', 'h', 'a', 'n', 'i' };

    boolean areArraysEqual = compareArrays(charArray1, charArray2);
    System.out.println(areArraysEqual);
  }
}
