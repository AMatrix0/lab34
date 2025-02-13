package shorties;

import java.util.Random;

import enums.Task;
import exceptions.NotPermittedTaskException;
import places.AbstractPlace;
import shorties.interfaces.ISlave;

public class SlaveShorty extends AbstractShorty implements ISlave{
    private MasterShorty master;
    private boolean unlocked = false;
    private Random rng = new Random();


    public SlaveShorty(String name_1, String name_2, String name_3, AbstractPlace location, MasterShorty master) {
        super(name_1, name_2, name_3, location);
        this.master = master;
    }

    public SlaveShorty(String name, AbstractPlace location, MasterShorty master) {
        this(name, name, name, location, master);
    }

    public SlaveShorty(String name_1, String name_2, AbstractPlace location, MasterShorty master) {
        this(name_1, name_2, name_2, location, master);
    }


    @Override
    public void unlockNextAction() {
        this.unlocked = true;
    }

    @Override
    public boolean startDoThing(Task task, boolean include_location, String reason) throws NotPermittedTaskException{
        if (this.master.getTask() != task) {
            if (!this.unlocked){
                throw new NotPermittedTaskException("Выбранная задача не совпадает с целью мастера.");
            }
            if (rng.nextBoolean()) {
                System.out.println(getName() + " не смог начать делать " + task.getText() + ", его заметил мастер.");
                return false;
            }
        }
        System.out.println(getName() + " начал делать " + task.getText() + (include_location ? " в " + getLocation().getName() : "" ) + " под надзором " + master.getName() + " " + reason);
        return true;
    }

    @Override
    public boolean finishDoThing(Task task, boolean include_location, String reason) throws NotPermittedTaskException{
        if (this.master.getTask() != task) {
            if (!this.unlocked){
                throw new NotPermittedTaskException("Выбранная задача не совпадает с целью мастера.");
            }
            if (rng.nextBoolean()) {
                System.out.println(getName() + " не смог начать закончить " + task.getText() + ", его заметил мастер.");
                return false;
            }
        }
        System.out.println(getName() + " закончил делать " + task.getText() + (include_location ? " в " + getLocation().getName() : "" ) + " под надзором " + master.getName() + " " + reason);
        return true;
    }

    @Override
    public boolean justDoThing(Task task, boolean include_location, String reason) throws NotPermittedTaskException{
        if (this.master.getTask() != task) {
            if (!this.unlocked){
                throw new NotPermittedTaskException("Выбранная задача не совпадает с целью мастера.");
            }
            if (rng.nextBoolean()) {
                System.out.println(getName() + " не смог сделать " + task.getText() + ", его заметил мастер.");
                return false;
            }
        }
        System.out.println(getName() + " сделал " + task.getText() + (include_location ? " в " + getLocation().getName() : "" ) + " под надзором " + master.getName() + " " + reason);
        return true;
    }
}
