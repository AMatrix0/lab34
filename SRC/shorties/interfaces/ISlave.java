package shorties.interfaces;

import enums.Task;
import exceptions.NotPermittedTaskException;

public interface ISlave{
    void unlockNextAction();
    boolean startDoThing(Task task, boolean include_location, String reason) throws NotPermittedTaskException;
    boolean finishDoThing(Task task, boolean include_location, String reason) throws NotPermittedTaskException;
    boolean justDoThing(Task task, boolean include_location, String reason) throws NotPermittedTaskException;

    default boolean startDoThing(Task task, boolean include_location) throws NotPermittedTaskException {return startDoThing(task, include_location, "");};
    default boolean finishDoThing(Task task, boolean include_location) throws NotPermittedTaskException {return finishDoThing(task, include_location, "");};
    default boolean justDoThing(Task task, boolean include_location) throws NotPermittedTaskException {return justDoThing(task, include_location, "");};
}
