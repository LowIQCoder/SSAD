package patterns;

/*                                                                      
 *   ██████  ██  ██  ██  ██████  ██      ██████  ██████  ██████  ██  ██  
 *   ██      ██  ██  ██  ██      ██      ██        ██    ██  ██  ██  ██
 *   ██████  ██  ███ ██  ██      ██      ██████    ██    ██  ██  ███ ██
 *       ██  ██  ██ ███  ██  ██  ██      ██        ██    ██  ██  ██ ███
 *   ██████  ██  ██  ██  ██████  ██████  ██████    ██    ██████  ██  ██
 * 
 *             Only ONE instance of the class is allowed 
 *                      (Creational pattern)
 *   When to use:
 *   - We need exactly ONE instance of the object
 *   - For logging, caching, database connectors
 */
public class Singleton {
    // Static reference to singleton object
    static Singleton instance;
    // Privite constructor, so it can be used only in class itself
    private Singleton() {}
    // getInstance() method will create new instance at first call and return same one each other calls
    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

class Demonstration {
    public static void main(String[] args) {
        // Creating differnt Singleton objects
        Singleton firstInstance = Singleton.getInstance();
        Singleton secondInstance = Singleton.getInstance();
        // Printing the references of objects
        // Since we have got only 1 object, adresses are the same
        System.out.println("Address of first instance:  " + firstInstance.toString());
        System.out.println("Address of second instance: " + secondInstance.toString());
    }
}    
