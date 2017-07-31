import static org.junit.Assert.assertEquals;
import org.junit.*;
// Why do we use the .*

public class BusTest {
  
  Bus bus;
  Passenger passenger;

  @Before

  public void before() {
    bus = new Bus("Ocean Terminal", 11000, 66);
    passenger = new Passenger();
  }

  @Test
  public void hasName() {
    assertEquals( "Ocean Terminal", bus.getName() );
  }

  @Test
  public void hasWeight() {
    assertEquals(11000, bus.getWeight());
  }

  @Test
  public void hasCapacity() {
    assertEquals(66, bus.getCapacity());
  }

  @Test
  public void readyToGoIfLessThan66() {
    assertEquals(true, bus.readyToGo());
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.passengerCount() );
  }

  @Test
  public void canTakeInPassenger() {
    bus.takeIn( passenger );
    assertEquals( 1, bus.passengerCount );
  }

  @Test

public void cannotAddPassengersWhenFull() {
  for( int i = 0; i < 66; i++) {
    bus.takeIn(passenger);
  }

  assertEquals(66, bus.passengerCount() );
}







  
}