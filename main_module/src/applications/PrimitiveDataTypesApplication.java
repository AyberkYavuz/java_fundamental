package applications;
import subjects.PrimitiveDataTypes;

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

        int myInt = -2147483648;
        primitiveDataTypes.setMyInt(myInt);
        System.out.println("myInt: " + String.valueOf(primitiveDataTypes.getMyInt()));


    }
}
