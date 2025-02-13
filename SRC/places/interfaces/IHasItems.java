package places.interfaces;

import enums.Item;

public interface IHasItems {
    void addItem(Item item);
    Item getItem(int id);
}
