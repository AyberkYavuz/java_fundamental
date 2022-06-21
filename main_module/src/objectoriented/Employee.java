package objectoriented;

public class Employee {
    private String name;
    private String surname;
    private String title;

    public Employee(String name, String surname, String title) {
        this.name = name;
        this.surname = surname;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
