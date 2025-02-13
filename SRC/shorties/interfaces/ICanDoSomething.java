package shorties.interfaces;

import enums.Task;

public interface ICanDoSomething {
    boolean startDoThing(Task task, boolean include_location, String reason);
    boolean finishDoThing(Task task, boolean include_location, String reason);
    boolean justDoThing(Task task, boolean include_location, String reason);

    default boolean startDoThing(Task task, boolean include_location) {return startDoThing(task, include_location, "");};
    default boolean finishDoThing(Task task, boolean include_location) {return finishDoThing(task, include_location, "");};
    default boolean justDoThing(Task task, boolean include_location) {return justDoThing(task, include_location, "");};

}
