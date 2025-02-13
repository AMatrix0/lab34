package shorties;

import enums.Task;
import places.AbstractPlace;
import shorties.interfaces.ICanSetTask;

public class MasterShorty extends AbstractShorty implements ICanSetTask{
    private Task task;


    public MasterShorty(String name_1, String name_2, String name_3, AbstractPlace location, Task task) {
        super(name_1, name_2, name_3, location);
        this.task = task;
    }

    public MasterShorty(String name, AbstractPlace location, Task task) {
        this(name, name, name, location, task);
    }

    public MasterShorty(String name_1, String name_2, AbstractPlace location, Task task) {
        this(name_1, name_2, name_2, location, task);
    }


    @Override
    public void setTask(Task task) {
        this.task = task;
    }

    @Override
    public Task getTask() {
        return this.task;
    }
}
