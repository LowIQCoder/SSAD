package patterns;

/*
 *   ██████  ██████  ██████  ██████  ██████  ██████  ██  ██  ██████  ██████
 *   ██  ██  ██  ██  ██  ██    ██    ██  ██    ██    ██  ██  ██  ██  ██
 *   ██████  ██████  ██  ██    ██    ██  ██    ██      ██    ██████  ██████
 *   ██      ████    ██  ██    ██    ██  ██    ██      ██    ██      ██
 *   ██      ██  ██  ██████    ██    ██████    ██      ██    ██      ██████
 * 
 *       Dynamically creates object based on existing ones (Clonning)
 *                         (Creational pattern)
 *   When to use:
 *   - When the type of object should be determined dynamically
 *   - If clonning is simpler that creation of new object
 */
public class Prototype {
    public static void main(String[] args) {
        // Creating two original objects
        Car lamba = new Lamba(5000);
        Car bus = new Bus(30);
        lamba.drive();
        bus.drive();
        // Creating clones of the objects
        Car newLamba = lamba.Clone();
        Car newBus = bus.Clone();
        newLamba.drive();
        newBus.drive();
    }
}
// Interface for prototype pattern
interface Car {
    public Car Clone();

    public void drive();
}
// Classes implementing the interface
class Bus implements Car {
    private int seats;

    Bus(int seats) {
        this.seats = seats;
    }

    @Override
    public Car Clone() {
        return new Bus(this.seats);
    }

    @Override
    public void drive() {
        System.out.println(Integer.toString(this.seats) + " seats Bus is driving");
    }

    
}
class Lamba implements Car {
    private int price;

    Lamba(int price) {
        this.price = price;
    }

    @Override
    public Car Clone() {
        return new Lamba(this.price);
    }

    @Override
    public void drive() {
        System.out.println(Integer.toString(this.price) + " $ Lamba is driving");
    }

}
