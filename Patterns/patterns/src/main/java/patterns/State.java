package patterns;

/*
 *           ██████  ██████  ██████  ██████  ██████
 *           ██        ██    ██  ██    ██    ██
 *           ██████    ██    ██████    ██    ██████
 *               ██    ██    ██  ██    ██    ██
 *           ██████    ██    ██  ██    ██    ██████
 * 
 *          Allows object to change its state(class)
 *                  (Behavioral pattern)
 *   When to use:
 *   - For easier adding of new states
 *   - For programs with large amount of states
 *   - For programs with complex conditional logic
 */
public class State {
    public static void main(String[] args) {
        // Defining new student class
        Student student = new Student(new ChillingStudent());
        // Student started to study
        student.doFinal();
        System.out.println("Chilling => Final: " + student.getState());
        // Student go to 108
        student.do108();
        System.out.println("Final => Chilling: " + student.getState());
        // This will kill Student
        student.doDSA();
        System.out.println("Chilling => DSA:   " + student.getState());
        student.doDSA();
        System.out.println("DSA => DSA:        " + student.getState());
    }
}
// Student class with transitions
class Student {
    // Current state of the Student
    public StudentState state;
    // Getter and Setter for state
    public void setState(StudentState state) {
        this.state = state;
    }

    public StudentState getState() {
        return this.state;
    }

    Student(StudentState state) {
        this.state = state;
    }
    // Implementation of State pattern
    // Transition functions
    public void doDSA() {
        this.state.DSA(this);
    }

    public void doFinal() {
        this.state.finals(this);
    }

    public void do108() {
        this.state.weekends(this);
    }

}
// Possible states of Students
class DeadStudent implements StudentState {
    @Override
    public void finals(Student student) {
        student.state = new DeadStudent();
    }

    @Override
    public void weekends(Student student) {
        student.state = new ChillingStudent();
    }

    @Override
    public void DSA(Student student) {
        student.state = new DeadStudent();
    }
}

class StudingStudent implements StudentState {
    @Override
    public void finals(Student student) {
        student.state = new DeadStudent();
    }

    @Override
    public void weekends(Student student) {
        student.state = new ChillingStudent();
    }

    @Override
    public void DSA(Student student) {
        student.state = new DeadStudent();
    }
}

class ChillingStudent implements StudentState {
    @Override
    public void finals(Student student) {
        student.state = new StudingStudent();
    }

    @Override
    public void weekends(Student student) {
        student.state = new ChillingStudent();
    }

    @Override
    public void DSA(Student student) {
        student.state = new StudingStudent();
    }
}
// Interface for student states
interface StudentState {
    void finals(Student student);

    void weekends(Student student);

    void DSA(Student student);
}