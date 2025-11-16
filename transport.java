
public class transport {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.move();
        bus.carryPassengers();
        
        Truck truck = new Truck();
        truck.move();
        truck.carryGoods();
    }
}
class vehicle {
    void move() {
        System.out.println("Transport is moving");
    }
}

class Bus extends vehicle {
    void carryPassengers() {
        System.out.println("Bus is carrying passengers");
    }
}

class Truck extends vehicle {
    void carryGoods() {
        System.out.println("Truck is carrying goods");
    }
}