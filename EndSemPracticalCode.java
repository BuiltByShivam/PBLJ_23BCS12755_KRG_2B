class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); 
    }
}

public class UserDefined {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You are not eligible to vote. Age must be 18 or above.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }

    public static void main(String[] args) {
        try {
            checkAge(16); 
        } catch (InvalidAgeException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
