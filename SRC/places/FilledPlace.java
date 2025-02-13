package places;

import java.util.ArrayList;

import enums.Item;
import places.interfaces.IHasItems;

public class FilledPlace extends AbstractPlace implements IHasItems{
    
    private ArrayList<Item> items = new ArrayList<Item>();


    public FilledPlace(String name) {
        super(name);
    }


    @Override
    public void addItem(Item item) {
        System.out.println("в " + getName() + " появилось " + item.getText());
        items.add(item);
    }

    @Override
    public Item getItem(int id) {
        try {
            return items.get(id);
        }
        catch (IndexOutOfBoundsException e) {
            return null;
        }
    }


    public String getName() {
        String s = this.getPlaceName() + "[";
        for (Item item : items) {
            s += item.getText() + ", ";
        }
        return s + "]";
    }

}
