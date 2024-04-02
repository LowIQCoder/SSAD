package patterns;

/*
 *          ██████  ██████  ██████  ██████  ████    ██████
 *          ██      ██  ██  ██      ██  ██  ██  ██  ██
 *          ██████  ██████  ██      ██████  ██  ██  ██████
 *          ██      ██  ██  ██      ██  ██  ██  ██  ██
 *          ██      ██  ██  ██████  ██  ██  ████    ██████
 * 
 *        Allows to hide complex implementation of the object
 *                    (Structural pattern)
 *   When to use:
 *   - We need limited interface to a complex object
 *   - We wand to structure system by layers
 */
public class Facade {
    public static void main(String[] args) {
        // To use our classes just use Facede
        FacadeClass facade = new FacadeClass();
        facade.printFoo();
    }
}
// Facade class that makes work with objects easier
class FacadeClass {
    SuperHardClass classInstance;
    OnemoreConnectedClass anotherInstance;
    public void printFoo() {
        classInstance = new SuperHardClass();
        anotherInstance = new OnemoreConnectedClass();
        classInstance.someNum = 10;
        anotherInstance.foo(classInstance.someNum);
    }
}
// Some classes with hard structure
class AnotherSuperHardClass extends SuperHardClass {
    public void AnotherHardFunction() {
        System.out.println(firstFunction());
    }
}
class SuperHardClass {
    public int someNum = 18;
    public int firstFunction() {
        secondOne();
        return 42;
    }
    public void secondOne() {
        System.out.println("Toooo hard");
    }
}
class OnemoreConnectedClass{
    SuperHardClass classObject;
    public int foo(int a) {
        classObject = new SuperHardClass();
        AnotherSuperHardClass classsssss = new AnotherSuperHardClass();
        classsssss.AnotherHardFunction();
        return 2*classObject.someNum;
    }
}
