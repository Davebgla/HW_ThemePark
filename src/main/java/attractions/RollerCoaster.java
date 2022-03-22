package attractions;

import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed{

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200){
            return 16.80;
        }
        return 8.40;
    }


    public boolean canRide(Visitor visitor) {
        if (visitor.getHeight() > 145 && visitor.getAge() > 12){
            return true;
        }
        return false;
    }
}
