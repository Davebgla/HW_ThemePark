package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(),0);
    }

    @Test
    public void hasPriceFor(){
        Visitor tallPerson = new Visitor(22, 220, 100.00);
        assertEquals(16.80, rollerCoaster.priceFor(tallPerson), 0);
    }

    @Test
    public void canRideRollercoaster(){
        Visitor perfectPerson = new Visitor(35, 190, 700);
        assertEquals(true, rollerCoaster.canRide(perfectPerson));
    }


}
