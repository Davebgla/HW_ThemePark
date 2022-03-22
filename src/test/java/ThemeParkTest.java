import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    TobaccoStall tobaccoStall;

    @Before
    public void before() {
        themePark = new ThemePark("Death Rides", attractions, stalls);
        dodgems = new Dodgems("smash", 7);
        park = new Park("haunted park", 8);
        playground = new Playground("kids park", 5);
        rollerCoaster = new RollerCoaster("Oblivion", 9);
        candyflossStall = new CandyflossStall("flossy", "chris", ParkingSpot.A1);
        iceCreamStall = new IceCreamStall("icey", "sarah", ParkingSpot.A2);
        tobaccoStall = new TobaccoStall("smokey joe's", "joe", ParkingSpot.A4);
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(dodgems);
        themePark.addAttraction(park);
        themePark.addAttraction(playground);
    }

    @Test
    public void canGetAllReviewed(){
        assertEquals(4, themePark.getAllReviewed().size());
    }


}
