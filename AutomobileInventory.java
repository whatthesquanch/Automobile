import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AutomobileInventory {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 Automobile automobile = new Automobile();
		 
		 // Call automobile class with parameterized constructor
		 System.out.println("Enter make, model, color, year, and mileage:");
		 String make = scanner.next();
		 String model = scanner.next();
		 String color = scanner.next();
		 int year = scanner.nextInt();
		 int mileage = scanner.nextInt();
		 automobile.addVehicle(make, model, color, year, mileage);
		 
		 // Call the method to list the values
		 String [] vehicleInfo = automobile.listVehicleInformation();
		 for (String info : vehicleInfo) {
			 System.out.println(info);
		 }
		 
		 // Call the remove vehicle method to clear the variables
		 System.out.println(automobile.removeVehicle());
		 
		 // Add a new vehicle
		 System.out.println("Enter make, model, color, year, and mileage for new vehicle:");
		 make = scanner.next();
		 model = scanner.next();
		 color = scanner.next();
		 year = scanner.nextInt();
		 mileage = scanner.nextInt();
		 System.out.println(automobile.addVehicle(make, model, color, year, mileage));
		 
		 // Call the list method and print the new vehicle information
		 vehicleInfo = automobile.listVehicleInformation();
		 for (String info : vehicleInfo) {
			 System.out.println(info);
		 }
			 
		 // Update the vehicle
		 System.out.println("Enter make, model, color, year and mileage to update the vehicle:");
		 make = scanner.next();
		 model = scanner.next();
		 color = scanner.next();
		 year = scanner.nextInt();
		 mileage = scanner.nextInt();
		 System.out.println(automobile.updateVehicleAttributes(make, model, color, year, mileage));
		 
		 // Call the listing method and print the information
		 vehicleInfo = automobile.listVehicleInformation();
		 for (String info : vehicleInfo) {
			 System.out.println(info);
		 }
			 
		// Ask the user if they want to print the information to a file
			 System.out.println("Do you want to print the information to a file? (Y/N)");
			 String response = scanner.next().toUpperCase();
			 
			 if (response.equals("Y")) {
				 printToFile(vehicleInfo);
			 } else if (response.equals("N")) {
				 // If the user chooses not to print to a file
				 System.out.println("A file will not be printed.");
			 } else {
				 // If the user enters an invalid response
				 System.out.println("Invalid response. Please enter 'Y' or 'N' .");
			 }
			 scanner.close();
		 }
		 // Method to print information to a file
		 public static void printToFile(String[] vehicleInfo) {
			 try {
				 FileWriter writer = new FileWriter("C:\\Temp\\Autos.txt");
				 for (String info : vehicleInfo) {
					 writer.write(info + "\n");
				 }
				 writer.close();
				 System.out.println("File printed successfully at: C:\\Temp\\Autos.txt");
				 
			 } catch (IOException e) {
				 // Handle any IOException
				 System.out.println("An error occured while printing to the file: " + e.getMessage());
			 }
			 

	}

}
