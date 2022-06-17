package sourcepackage;

public class PrimitiveDataTypes {
    // one byte is 8 bits. A bit can be 0 or 1.
    // it can store a number (-128 to 127).
    // it can store characters. If you need characters, use char data type instead of byte because of limited size of byte.
    private byte myByte;

    // size of short is 2 bytes (16 bits)
    // short stores numbers. Not decimals.
    // Stores whole numbers from -32,768 to 32,767
    private short myShort;

    // size of int is 4 bytes (32 bits)
    // int stores numbers. Not decimals.
    // Stores whole numbers from -2,147,483,648 to 2,147,483,647
    private int myInt;

    // size of long is 8 bytes (64 bits)
    // long stores numbers. Not decimals.
    // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
    private long myLong;

    // size of float is 4 bytes (32 bits)
    // Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
    private float myFloat;

    // size of double is 8 bytes (64 bits)
    // Stores fractional numbers. Sufficient for storing 15 decimal digits
    private double myDouble;

    // size of boolean is 1 bit
    // Stores true or false values
    private boolean flag;

    // size of char is 2 bytes (16 bits)
    // Stores a single character/letter or ASCII values
    private char myChar;

    public PrimitiveDataTypes() {
    }

    public byte getMyByte() {
        return myByte;
    }

    public void setMyByte(byte myByte) {
        this.myByte = myByte;
    }

    public short getMyShort() {
        return myShort;
    }

    public void setMyShort(short myShort) {
        this.myShort = myShort;
    }

    public int getMyInt() {
        return myInt;
    }

    public void setMyInt(int myInt) {
        this.myInt = myInt;
    }

    public long getMyLong() {
        return myLong;
    }

    public void setMyLong(long myLong) {
        this.myLong = myLong;
    }

    public float getMyFloat() {
        return myFloat;
    }

    public void setMyFloat(float myFloat) {
        this.myFloat = myFloat;
    }

    public double getMyDouble() {
        return myDouble;
    }

    public void setMyDouble(double myDouble) {
        this.myDouble = myDouble;
    }


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public char getMyChar() {
        return myChar;
    }

    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }
}
