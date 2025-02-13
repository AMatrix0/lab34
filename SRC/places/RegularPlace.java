package places;

public class RegularPlace extends AbstractPlace{

    public RegularPlace(String name) {
        super(name);
    }


    public String getName() {
        return this.getPlaceName();
    }
    
}
