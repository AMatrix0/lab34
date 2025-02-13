import enums.Item;
import enums.Task;
import exceptions.NotPermittedTaskException;
import places.FilledPlace;
import places.RegularPlace;
import shorties.MasterShorty;
import shorties.RegularShortly;
import shorties.SlaveShorty;

public class App {
    public static void main(String[] args) {
        FilledPlace street = new FilledPlace("улицы города");
        FilledPlace homes = new FilledPlace("дома");
        RegularShortly shorties = new RegularShortly("Коротышки", "они", street);
        shorties.finishDoThing(Task.DO_ALL_THIS, false);
        shorties.selectSecondName();
        if (shorties.startDoThing(Task.MAKE_LIGHTING, true)) street.addItem(Item.LIGHTING);
        if (shorties.justDoThing(Task.MAKE_PHONE, false, "чтобы можно было разговаривать, не выходя из " + homes.getName())) homes.addItem(Item.PHONE);

        MasterShorty knower = new MasterShorty("Знайка", homes, Task.MAKE_TV);
        SlaveShorty vintik = new SlaveShorty("Винтик", homes, knower);
        // vintik.unlockNextAction();
        SlaveShorty shpuntik = new SlaveShorty("Шпунтик", homes, knower);
        try {
            // if (vintik.justDoThing(Task.MAKE_LIGHTING, false, "чтобы смотреть дома кинокартины и театральные представления") &&
            if (vintik.justDoThing(Task.MAKE_TV, false, "чтобы смотреть дома кинокартины и театральные представления") &&
            shpuntik.justDoThing(Task.MAKE_TV, false, "чтобы смотреть дома кинокартины и театральные представления")) homes.addItem(Item.TV);
        }
        catch (NotPermittedTaskException e) {
            System.out.println("Произошла ошибка при попытке создать телевизор: " + e);
        }

        FilledPlace head = new FilledPlace("голова незнайки");
        RegularShortly stupid = new RegularShortly("Незнайка", "он", "герой", homes);
        stupid.justDoThing(Task.GOT_SMARTER, false);
        stupid.selectSecondName();
        stupid.startDoThing(Task.LEARN, false);
        stupid.selectThirdName();
        if (stupid.finishDoThing(Task.READ_GRAMMAR_AND_ALGEBRA, false)) head.addItem(Item.GRAMMAR_AND_ALGEBRA);
        stupid.selectSecondName();
        if (stupid.startDoThing(Task.TASKS, false)) head.addItem(Item.TASKS);
        stupid.startDoThing(Task.WANT_LEARN_PHYSICS, false, "которую называл физикой-мизикой");
        stupid.selectFirstName();
        stupid.finishDoThing(Task.WANT_LEARN, false);

        shorties.selectFirstName();
        RegularPlace country = new RegularPlace("страна коротышек");
        shorties.setLocation(country);
        shorties.finishDoThing(Task.WANT_LEARN, true, "часто");
        
        FilledPlace new_head = new FilledPlace("голова коротышки");
        RegularShortly another = new RegularShortly("иной коротышка", "он", country);
        if (another.justDoThing(Task.PROMISE, false)) new_head.addItem(Item.PROMISES);
        another.justDoThing(Task.THAT_AND_MOUNTAINS, false);
        another.selectSecondName();
        another.justDoThing(Task.WORK_FULLY, false, "несколько дней");
        another.finishDoThing(Task.WORK_FULLY, false, "понемножку");

    }
}
