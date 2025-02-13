package places;

import java.util.Objects;

public abstract class AbstractPlace {
    private String name;


    protected AbstractPlace(String name) {
        super();
        this.name = name;
    }


    protected String getPlaceName() {
        return this.name;
    }

    
    abstract public String getName();


    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;
        if (otherObject == null) return false;
        if (!otherObject.getClass().equals(this.getClass())) return false;

        AbstractPlace other = (AbstractPlace) otherObject;
        return name.equals(other.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name=" + this.name + "]";
    }
}
