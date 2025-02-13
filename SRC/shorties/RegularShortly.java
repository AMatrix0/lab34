package shorties;

import enums.Task;
import places.AbstractPlace;
import shorties.interfaces.ICanDoSomething;

public class RegularShortly extends AbstractShorty implements ICanDoSomething{

    public RegularShortly(String name_1, String name_2, String name_3, AbstractPlace location) {
        super(name_1, name_2, name_3, location);
    }

    public RegularShortly(String name, AbstractPlace location) {
        this(name, name, name, location);
    }

    public RegularShortly(String name_1, String name_2, AbstractPlace location) {
        this(name_1, name_2, name_2, location);
    }


    @Override
    public boolean startDoThing(Task task, boolean include_location, String reason){
        System.out.println(getName() + " начал делать " + task.getText() + (include_location ? " в " + getLocation().getName() : "" ) + " " + reason);
        return true;
    }

    @Override
    public boolean finishDoThing(Task task, boolean include_location, String reason){
        System.out.println(getName() + " закончил делать " + task.getText() + (include_location ? " в " + getLocation().getName() : "" ) + " " + reason);
        return true;
    }

    @Override
    public boolean justDoThing(Task task, boolean include_location, String reason){
        System.out.println(getName() + " сделал " + task.getText() + (include_location ? " в " + getLocation().getName() : "" ) + " " + reason);
        return true;
    }
}
