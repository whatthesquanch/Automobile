import java.util.Scanner;

class Automobile {
	 private String make;
	 private String model;
	 private String color;
	 private int year;
	 private int mileage;
	 
	
	// Default constructor
		public Automobile() {
		}

	
	// Parameterized constructor
	public Automobile(String make, String model, String color, int year, int mileage) {
		 this.make = make;
		 this.model = model;
		 this.color = color;
		 this.year = year;
		 this.mileage = mileage;
	 }
	 
	 // Method to add a new vehicle
	 public String addVehicle(String make, String model, String color, int year, int mileage) {
		 try { 
			 this.make = make;
			 this.model = model;
			 this.color = color;
			 this.year = year;
			 this.mileage = mileage;
			 return "Vehicle added successfully.";
		 } catch (Exception e) {
			 return "Failed to add vehicle. Error: " + e.getMessage();
		 }
	 }
	 
	 // Method to list vehicle information
	 
	 public String[] listVehicleInformation() {
		 try {
			 String[] info = {make, model, color, String.valueOf(year), String.valueOf(mileage)};
			 return info;
		 } catch (Exception e) {
			 return new String[]{"Failed to retrieve vehicle information. Error: " + e.getMessage()};
		 }
	 }
	 
	 // Method to remove a vehicle
	 public String removeVehicle() {
		 try {
			 make = "";
			 model = "";
			 color = "";
			 year = 0;
			 mileage = 0;
			 return "Vehicle removed successfully.";
		 } catch (Exception e) {
			 return "Failed to remove vehicle. Error: " + e.getMessage();
		 }
	 }
	 
	 // Method to update vehicle attributes
	 public String updateVehicleAttributes(String make, String model, String color, int year, int mileage) {
		 try {
			 this.make = make;
			 this.model = model;
			 this.color = color;
			 this.year = year;
			 this.mileage = mileage;
			 return "Vehicle attributes updated successfully.";
		 } catch (Exception e) {
			 return "Failed to update vehicle attributes. Error: " + e.getMessage();
			 
		 }
	 }
		 public static void main(String[] args) {
			 try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Enter vehicle details: ");
				 System.out.print("Make: ");
				 String make = scanner.nextLine();
				 
				 System.out.print("Model: ");
				 String model = scanner.nextLine();
				 
				 System.out.print("Color: ");
				 String color = scanner.nextLine();
				 
				 System.out.print("Year: ");
				 int year = scanner.nextInt();
				 
				 System.out.print("Mileage: ");
				 int mileage = scanner.nextInt();
				 
				 Automobile auto = new Automobile();
				 
				 System.out.println(auto.addVehicle(make, model, color, year, mileage));
				 System.out.println("Vehicle Information: ");
				 String[] vehicleInfo = auto.listVehicleInformation();
				 for (String info : vehicleInfo) {
					 System.out.println(info);
				 }
				 
				 System.out.println(auto.removeVehicle());
				 System.out.println(auto.updateVehicleAttributes(make, model, color, year, mileage));
			}

	 }
}
		