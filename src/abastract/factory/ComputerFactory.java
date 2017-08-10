package abastract.factory;

import factory.method.Computer;

public class ComputerFactory {

	public static Computer getComputer(AbstractComputerFactory abstractComputerFactory) {
		return abstractComputerFactory.createComputer();
	}
}
