package objectoriented;

import java.util.Objects;

public class Personnel {
    // final means attribute value cannot be changed after object creation
    private final String name;
    private final int personnelId;

    public Personnel(String name, int personnelId) {
        this.name = name;
        this.personnelId = personnelId;
    }

    public String getName() {
        return name;
    }

    public int getPersonnelId() {
        return personnelId;
    }

    @Override
    public String toString() {
        return "Personnel{" +
                "name='" + name + '\'' +
                ", personnelId=" + personnelId +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personnel personnel = (Personnel) o;
        return personnelId == personnel.personnelId && Objects.equals(name, personnel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, personnelId);
    }
}
