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

    }
}
