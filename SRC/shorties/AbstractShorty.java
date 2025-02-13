package shorties;

import java.util.Objects;

import enums.NamesRecord;
import places.AbstractPlace;

public abstract class AbstractShorty {
    private NamesRecord name;
    private AbstractPlace location;
    private int current_name = 1;


    public AbstractShorty(String name_1, String name_2, String name_3, AbstractPlace location) {
        super();
        this.name = new NamesRecord(name_1, name_2, name_3);
        this.location = location;
    }

    public AbstractShorty(String name, AbstractPlace location) {
        this(name, name, name, location);
    }

    public AbstractShorty(String name_1, String name_2, AbstractPlace location) {
        this(name_1, name_2, name_2, location);
    }


    public void selectFirstName() {
        current_name = 1;
    }

    public void selectSecondName() {
        current_name = 2;
    }
    
    public void selectThirdName() {
        current_name = 3;
    }

    public AbstractPlace getLocation() {
        return location;
    }

    public void setLocation(AbstractPlace location) {
        this.location = location;
    }

    public String getName() {
        if (current_name == 1) return name.name_1();
        if (current_name == 2) return name.name_2();
        if (current_name == 3) return name.name_3();
        return "";
    }

    public void printName() {
        System.out.print(this.getName() + " ");
    }


    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!otherObject.getClass().equals(this.getClass())) return false;

        AbstractShorty other = (AbstractShorty) otherObject;
        return name.equals(other.name) && location.equals(other.location);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, location);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name=" + this.name
                + ",location=" + this.location + "]";
    }
}
