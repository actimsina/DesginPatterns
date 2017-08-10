package abastract.factory;

import factory.method.Computer;

public class AFClient {

	public static void main(String[] args) {
		// Computer c = new PCFactory("2GB", "3GB", "4GB").createComputer();
		Computer pc = ComputerFactory.getComputer(new PCFactory("2GB", "256GB", "i3"));
	}
}
