package Abstraction;

// Pure abstraction Via Interface
public interface Drivable {
    // Abstract method (Must be implemented)
    void drive();

    // Default method ---- optional shared behavior
    default void honk() {
        System.out.println("Beep beep! Honking from Drivable interface.");
    }

    // Static method (utility)
    static void printSafetyTips() {
        System.out.println("Always wear seatbelt. Follow traffic rules.");
    }
    
}
