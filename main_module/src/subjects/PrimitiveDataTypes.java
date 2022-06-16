package subjects;

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
}
