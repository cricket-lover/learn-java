public class PrimitiveDataTypes {
  public static void main(String[] args) {
    byte byteValue = 127;          // 1 byte range -128 -127
    short shortValue = 32767;      // 2 bytes range -32768 -32767 
    int intValue = -2147483648;    // 4 bytes range -2147483648 -2147483647
    long longValue = 2147483648L;  // 8 bytes
    float floatValue = 1.5F;       // 4 bytes
    double doubleValue = 12.34;    // 8 bytes
    char charValue = 's';          // 2 bytes
    boolean booleanValue = true;   // 1 bit


    System.out.println("Byte value : " + byteValue);
    System.out.println("Short value : " + shortValue);
    System.out.println("Int value : " + intValue);
    System.out.println("Long value : " + longValue);
    System.out.println("Float value : " + floatValue);
    System.out.println("Double value : " + doubleValue);
    System.out.println("Char value : " + charValue);
    System.out.println("Boolean value : " + booleanValue);
  }
}