package patterns;

/*
 *     ██████  ██████  ██████  ██████  ██████  ██████  ██████  ██  ██
 *     ██        ██    ██  ██  ██  ██    ██    ██      ██      ██  ██
 *     ██████    ██    ██████  ██████    ██    ██████  ██        ██
 *         ██    ██    ████    ██  ██    ██    ██      ██  ██    ██
 *     ██████    ██    ██  ██  ██  ██    ██    ██████  ██████    ██
 * 
 *       Allows the object to change its strategy(implementation)
 *                      (Behavioral pattern)
 *  When to use:
 *  - Same object can have different implementation depending on its state
 *  - Some classes differ only by behavour 
 *  - Objects have not unique algorithms, but their variations
 */
public class Strategy {
    // Variable that contains choosen strategy
    static MoveStrategy strategy = new MoveByLegs();
    public static void main(String[] args) {
        // Calling method
        strategy.move();
        // And choosing another strategy
        strategy = new MoveByCar();
        strategy.move();
        strategy = new MoveByVelosiped();
        strategy.move();
    }
}
// Interface for MoveStrategy
interface MoveStrategy {
    public void move();
}
// Move by car Strategy
class MoveByCar implements MoveStrategy {
    public void move() {
        System.out.println("Car is edet");
    }
}
// Move by legs Strategy
class MoveByLegs implements MoveStrategy {
    public void move() {
        System.out.println("Nogi idut");
    }
}
// Move by velosiped Strategy
class MoveByVelosiped implements MoveStrategy {
    public void move() {
        System.out.println("Velosiped edet");
    }
}