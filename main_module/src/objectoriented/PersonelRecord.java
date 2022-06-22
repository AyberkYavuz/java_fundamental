package objectoriented;

/*
JDK 14 introduces records, which are a new kind of type declaration.

If you have JDK below 14, you cannot use Records.

Records are a special type of Classes like Enum.

Records objects are immutable.
You cannot change the value of Record object attribute. So, Records don't have setters.

Records help programmers to store data with less code (Take a look at Personnel.java).

Records have Constructors by default. You don't have to write constructors.
Records have getters by default. You don't have to write getters.
Records have toString() by default. You don't have to write toString().

You cannot define instance fields (attributes of Class). It is not allowed.

All Record classes extend Record class. So, Records cannot extend any other class.
(Multiple inheritance is not allowed in Java)

You can implement interfaces in Records.
 */

// I am working with JDK 8. Therefore, the code is commented.
/*
public record PersonelRecord(String name, int personnelId) {
    // You can define static final attributes.
    public static final double MAX_PERSONNEL_SALARY = 1000000.0;

    // You can override Constructors and other Record methods.
    public PersonelRecord(String name, int personnelId){
        if(personnelId < 0){
            throw new IllegalArgumentException("Personel Id cannot be less than 0.");
        }
        this.name = name;
        this.personnelId = personnelId;
    }

    // You can write your own methods.
    public String nameInUpperCase(){
        return name.toUpperCase();
    }

    public static void print(){
        System.out.println("PersonelRecord");
    }
}
*/
