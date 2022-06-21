package applications;
import other.PrimitiveDataTypes;

public class PrimitiveDataTypesApplication {
    public static void main(String[] args){

        PrimitiveDataTypes primitiveDataTypes = new PrimitiveDataTypes();
        byte numericByte = 126;
        byte charByte = 'C';
        primitiveDataTypes.setMyByte(numericByte);
        System.out.println("myByte: " + String.valueOf(primitiveDataTypes.getMyByte()));
        primitiveDataTypes.setMyByte(charByte);
        System.out.println("myByte: " + String.valueOf(primitiveDataTypes.getMyByte()));

        short myShort = 32767;
        primitiveDataTypes.setMyShort(myShort);
        System.out.println("myShort: " + String.valueOf(primitiveDataTypes.getMyShort()));

        // minimum value that int can store
        int myInt = -2147483648;
        primitiveDataTypes.setMyInt(myInt);
        System.out.println("myInt: " + String.valueOf(primitiveDataTypes.getMyInt()));

        long myLong = 1147483649;
        primitiveDataTypes.setMyLong(myLong);
        System.out.println("myLong: " + String.valueOf(primitiveDataTypes.getMyLong()));

        float myFloat = 0.000006f;
        primitiveDataTypes.setMyFloat(myFloat);
        System.out.println("myFloat: " + String.valueOf(primitiveDataTypes.getMyFloat()));

        double myDouble = 1.55454;
        primitiveDataTypes.setMyDouble(myDouble);
        System.out.println("myDouble: " + String.valueOf(primitiveDataTypes.getMyDouble()));

        boolean flag = true;
        primitiveDataTypes.setFlag(flag);
        System.out.println("flag: " + String.valueOf(primitiveDataTypes.isFlag()));

        char myChar = 'A';
        primitiveDataTypes.setMyChar(myChar);
        System.out.println("myChar: " + primitiveDataTypes.getMyChar());
    }
}
