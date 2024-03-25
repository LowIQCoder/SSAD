package princepess;
// Based on https://www.youtube.com/watch?v=TxZwqVTaCmA and Tut. #7
public class SOLID {
    public static void main(String[] args) {
        System.out.println("ABOBA");
    }
}
/*=================================================================================================================================================================
 *
 *      ██████    ██████    ██        ██    ████
 *      ██        ██  ██    ██        ██    ██  ██
 *      ██████    ██  ██    ██        ██    ██  ██
 *          ██    ██  ██    ██        ██    ██  ██
 *      ██████    ██████    ██████    ██    ████
 *                                                by Robert Martin
 *      - Set of the set of practices for building
 *        flexible and adaptive software
 */

/*=================================================================================================================================================================
        ██████
        ██
        ██████
            ██
        ██████ ingle Responsibility Principe - A class should have only one reason for changing
                                               (One Class - One Task)
        aka SRP
*/
// Person class without S-princepe
class NoSPerson {
    // Usual methids for all persons
    public void run() {
        System.out.println("Person is running");
    }
    public void alive() {
        System.out.println("Person is alive");
    }
    // Usually person do not need to do this
    public void log() {
        System.out.println("Some info about person");
    }
    public void send() {
        System.out.println("Sending info somthere");
    }
}
// It is better to bring outh the log() and send() methods
// Person class with S-principe
class SPerson {
    // Usual methids for all persons
    public void run() {
        System.out.println("Person is running");
    }
    public void alive() {
        System.out.println("Person is alive");
    }
}
// Classes for logging and sending
class logPerson {
    public void log() {
        System.out.println("Some info about person");
    }
}
class sendPerson {
    public void send() {
        System.out.println("Sending info somthere");
    }
}
/*=================================================================================================================================================================
        ██████
        ██  ██
        ██  ██
        ██  ██
        ██████ pen\Closed Principe - Components should be closed for changing but open for extension
                                     (Possible to add new functions but not to change the old ones)
        aka OCP
*/
// Povar class without O-principe
class NoOPovar {
    public void beAlive() {
        System.out.println("Povar is allive");
    }
    // Povar can cook some Kartoshka
    public void makeKartoshka() {
        System.out.println("Povar is making kartoshka");
    }
}
// But what if we beed to Povar kan also make Grechka? In this situation we need to revrite class and add new method
// Povar classes with O-principe
// We can inheirt Povar class and add new functional in child
class BetterOPovar extends NoOPovar {
    public void makeGrechka() {
        System.out.println("Povar is making grechka");
    }
}
// But better solution is to make Povar more generic
class OPovar {
    public void beAlive() {
        System.out.println("Povar is allive");
    }
    // Now Povar can cook various types of food
    public void makeFood(Food food) {
        System.out.println("Povar is making " + food.name);
    }
}
// Class for food
class Food {
    public String name;
    Food(String name) {
        this.name = name;
    }
}
/*=================================================================================================================================================================
        ██    (by Barbara Liskov)
        ██  
        ██  
        ██  
        ██████ iskov Substitution Principle - A variable of a given type may be assigned avalue of any subtype of that type
                                              A method of a parameter of a given type may be invoked with an argument of any subtype of that type.
                                              (Children class should ADD but not CHANGE functional to parent class)
        aka LSP
*/
// Classes without L-principe
class NoLCharacter {
    public String name;
    NoLCharacter(String name) {
        this.name = name;
    }
    public void beAlive() {
        System.out.println(this.name + " is allive");
    }
    public void attack() {
        System.out.println(this.name + " is attacking");
    }
}
// Some Character classes
class Warior extends NoLCharacter {
    Warior(String name) {
        super(name);
    }
    @Override
    public void attack() {
        System.out.println(this.name + " is fighting");
    }
}
// But here attack methods will not work. Healler just do not need this
class NoLHealler extends NoLCharacter {
    NoLHealler(String name) {
        super(name);
    }
    @Override
    public void attack() {
        return;
    }
}
// Because of this, Healler class can not be used in some situations there attack() method is called
// We can make new Character class without 'specilised' methods
// Character class with L-principe
class LCharacter {
    public String name;
    LCharacter(String name) {
        this.name = name;
    }
    public void beAlive() {
        System.out.println(this.name + " is allive");
    }
}
/*=================================================================================================================================================================
        ██
        ██  
        ██  
        ██  
        ██ nterface Segregation Principle - Clients shouldn’t depend on methods they don’t use
                                            (Devide BIG interfase on SMALLER ones)
        aka ISP
*/
// Interface without I-principe
interface NoIInterface {
    public void swim();
    public void walk();
    public void fly();
}
// For Duck class we need all methods
class NoIDuck implements NoIInterface {
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
// But Bear cannot fly (usually)
class NoIBear implements NoIInterface {
    @Override
    public void swim() {
        System.out.println("Bear is swimming");
    }
    @Override
    public void walk() {
        System.out.println("Bear is walking");
    }
    // U really should not do theese
    @Override
    public void fly() {
        return;
    }
}
// Better solution is to add new interfaces
// Interfaces with I-principe
interface ISwim {
    public void swim();
}
interface IWalk {
    public void walk();
}
interface IFly {
    public void fly();
}
// Using theese interfaces we can follow the I-principe.(Honestly, interfaces were created for such tasks)
class IDuck implements IFly, IWalk, ISwim {
    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
    @Override
    public void walk() {
        System.out.println("Duck is walking");
    }
    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }
}
class IBear implements IWalk, ISwim {
    @Override
    public void swim() {
        System.out.println("Bear is swimming");
    }
    @Override
    public void walk() {
        System.out.println("Bear is walking");
    }
}
/*=================================================================================================================================================================
        ████
        ██  ██
        ██  ██
        ██  ██ 
        ████  ependency Inversion Principle - Higher-level components shouldn’t depend on lower-level components. Both should depend on abstractions.
                                              Abstractions shouldn’t depend on details: details should depend on abstractions.
                                              (Classes should rely on abstractions but not on other classes)
        aka DIP
*/
// Here programm will work only on ARM architecture processors
// Classes without D-principe
class x86Architecture {
    public String name;
    public void workOnx86Processor() {
        System.out.println(name + " is working on x86 proccessor");
    }
}
class ARMArchitecture {
    public String name;
    public void workOnARMProcessor() {
        System.out.println(name + " is working on ARM proccessor");
    }
}
// Programm works only with ARM
class NoDProgramm {
    public String code;
    public void work() {
        ARMArchitecture arch = new ARMArchitecture();
        arch.name = "M3";
        arch.workOnARMProcessor();
    }
}
// But what if we need program to work on x86?
// Here we can add Compiler and archetecture classes - new level of abstraction
// Classes with D-principe
class Archetecture {
    public String name;
    public String type;
}
class Compiler {
    public Archetecture arch;
    public void work() {
        System.out.println("Programm is working on " + arch.type + " archetecture " + arch.name);
    }
}
// Now programm depends not on processor type but on the compiler
class DProgramm {
    public Compiler gcc;
    public void work() {
        gcc.arch.name = "M3";
        gcc.arch.type = "ARM";
        gcc.work();
    }
}
//=================================================================================================================================================================
