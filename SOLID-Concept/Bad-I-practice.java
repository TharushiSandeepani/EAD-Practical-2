// this code demonstrate the bad practice of interface segregation principle (ISP)
// where the classes are forced to implement methods that they do not use, which can lead to
// issues when we need to use the classes, as they may not have the same behavior or functionality.
// in this example, the SimplePrinter class is forced to implement the scan and fax methods,
//  which are not applicable to its functionality, violating the ISP.

interface Document {
	void print();
	void scan();
	void fax();
}

class SimplePrinter implements Document {
	@Override
	public void print() {
		// Print the document
	}

	@Override
	public void scan() {
		// Not applicable for SimplePrinter
	}

	@Override
	public void fax() {
		// Not applicable for SimplePrinter
	}
}

class Photocopier implements Document {
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
