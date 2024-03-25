package patterns;

/*
 *   ██████  ██  ██  ██  ██      ████    ██████  ██████
 *   ██  ██  ██  ██  ██  ██      ██  ██  ██      ██  ██
 *   ████    ██  ██  ██  ██      ██  ██  ██████  ██████
 *   ██  ██  ██  ██  ██  ██      ██  ██  ██      ████
 *   ██████  ██████  ██  ██████  ████    ██████  ██  ██
 * 
 *          Easier creation of complex objects
 *                (Creational pattern)
 *   When to use:
 *   - Whet we need object with constant state (Enforces Immutability)
 *   - When we need more flexible creation of object
 *   - When we need more readable code
 */
public class Builder {
    public static void main(String[] args) {
        // Using CourceBuilder to create Cources
        Cource MA = Cource.CoucreBuilder.newInstance()
                                        .setID(0)
                                        .setName("Mathan")
                                        .setRetake(15)
                                        .build();
        Cource DSA = Cource.CoucreBuilder.newInstance()
                                        .setID(2)
                                        .setName("DSA")
                                        .setRetake(1500)
                                        .build();
        // Displaying info about Cources
        MA.getInfo();
        DSA.getInfo();
    }
}
// Cource class
class Cource {
    private int ID;
    private String name;
    private int retakeStudents;
    // Constructor inmpementing the Builder pattern
    Cource(CoucreBuilder builder) {
        this.ID = builder.ID;
        this.name = builder.name;
        this.retakeStudents = builder.retakeStudents;
    }
    // Builder class
    public static class CoucreBuilder {
        private int ID;
        private String name;
        private int retakeStudents;
        // For creating new object
        public static CoucreBuilder newInstance() {
            return new CoucreBuilder();
        }

        private CoucreBuilder() {}
        // Setters for parameters
        public CoucreBuilder setID(int ID) {
            this.ID = ID;
            return this;
        }

        public CoucreBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CoucreBuilder setRetake(int retakeStudents) {
            this.retakeStudents = retakeStudents;
            return this;
        }
        // Function to convert from CuorceBuilder to Cource
        public Cource build() {
            return new Cource(this);
        }
    }
    // For demonstration
    public void getInfo() {
        System.out.println("Cource name: " + this.name +
                "\nCource ID: " + Integer.toString(ID) +
                "\nNumber of retakes: " + Integer.toString(retakeStudents));
    }
}
