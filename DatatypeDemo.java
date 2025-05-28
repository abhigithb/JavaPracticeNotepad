import java.util.Scanner; // Import Scanner for user input

public class DataTypeDemo {
    public static void main(String[] args) {
        // Check if correct number of arguments is passed
        if (args.length < 4) {
            System.out.println("Please enter required details: java DataTypeDemo <FirstName> <LastName> <Age> <City>");
            return;
        }

        // Assigning command-line arguments to variables
        String firstName = args[0];
        String lastName = args[1];
        int age;
        String city = args[3];

        // Handling potential input errors
        try {
            age = Integer.parseInt(args[2]); // Convert age from String to int
        } catch (NumberFormatException e) {
            System.out.println("Error: Age must be a valid number.");
            return;
        }

		System.out.println("Details:");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
		System.out.println("City: " + city);
    }
}
