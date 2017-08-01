package factory.method;

public class Client {
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("pc", "2GB", "256GB", "Core-i5");

		System.out.println(pc.getRAM() + " " + pc.getHDD() + " " + pc.getCPU());
	}
}
