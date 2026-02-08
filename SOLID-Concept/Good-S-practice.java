// this code demostrate how correctly classes should be designed to follow the Single Responsibility Principle (SRP
// this should be done at the design phase of the software development process, to ensure that each class has a clear 
// fatal: not a git repository (or any of the parent directories): .gitand focused responsibility, making the code easier to maintain and extend in the future.

class CustomerDataStorage {
	public void saveToDatabase(Customer customer) {
		// Code to save customer data to the database
	}
}

class EmailSender {
	public void sendEmailNotification(Customer customer) {
		// Code to send email notification to the customer
	}
}

class Customer {
	private String name;
	private String email;

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}
}