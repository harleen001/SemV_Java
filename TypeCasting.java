public class TypeCasting {
    public static void main(String[] args) {
        int intValue = 100;
        double doubleValue = intValue;

        System.out.println("Implicit Typecasting:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Converted to double: " + doubleValue);

        double anotherDoubleValue = 123.45;
        int anotherIntValue = (int) anotherDoubleValue;

        System.out.println("Explicit Typecasting:");
        System.out.println("Double value: " + anotherDoubleValue);
        System.out.println("Converted to integer: " + anotherIntValue);

        byte byteValue = 10;
        short shortValue = byteValue;
        System.out.println("Byte value: " + byteValue);
        System.out.println("Converted to short: " + shortValue);

        double largeDoubleValue = 9.99;
        int roundedIntValue = (int) largeDoubleValue;
        System.out.println("Large double value: " + largeDoubleValue);
        System.out.println("Converted to integer (truncated): " + roundedIntValue);

        Integer wrapperIntValue = 50;
        int primitiveIntValue = wrapperIntValue;
        System.out.println("Wrapper Integer value: " + wrapperIntValue);
        System.out.println("Unboxed to primitive int: " + primitiveIntValue);
    }
}
