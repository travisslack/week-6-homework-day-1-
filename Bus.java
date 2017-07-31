class Bus {
  private String name;
  private int weight;
  private int capacity;
  private Passenger[] size;


  public Bus(String name, int weight, int capacity) {
    this.name = name;
    this.weight = weight;
    this.capacity = capacity;
    this.size = new Passenger[5];
  }

  public String getName() {
    return this.name;
  }

  public int getWeight() {
    return this.weight;
  }

  public int getCapacity() {
    return this.capacity;
  }

  public boolean readyToGo() {
    if (this.capacity <= 66) {
      return true;
    }
    return false;
  }

  public int passengerCount(){

    int count = 0;
    for( Passenger passenger : this.size ){
      if(passenger != null) {
        count++;
      }
    }
    return count;
  }

 public void takeIn(Passenger passenger) {
  if ( busIsFull() ) {
    return;
  }
  int passengerCount = passengerCount();
  size[passengerCount] = passenger;
 }

 public boolean busIsFull() {
  return passengerCount() == bus.capacity;
 }

}