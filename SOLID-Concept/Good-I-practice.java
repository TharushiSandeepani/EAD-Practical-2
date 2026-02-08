// this code demonstrates how to correctly design classes to follow the Interface Segregation Principle (ISP)
// which states that clients should not be forced to depend on interfaces they do not use.
// In this example, we have separated the functionalities of printing, scanning, and faxing into different interfaces,
// allowing classes to implement only the interfaces that are relevant to their functionality, thus adhering to the ISP.

interface Printer {
	void print();
}

interface Scanner {
	void scan();
}

interface FaxMachine {
	void fax();
}

class SimplePrinter implements Printer {
	@Override
	public void print() {
		// Print the document
	}
}

class Photocopier implements Printer, Scanner, FaxMachine {
	@Override
	public void print() {
		// Print the document
	}

	@Override
	public void scan() {
		// Scan the document
	}

	@Override
	public void fax() {
		// Fax the document
	}
}