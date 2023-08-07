package Practice.CarDriver;

public class Driver extends Car {

	public void drive() {
		this.setGas(getGas() - 1);
		if (this.getGas() == 0) {
			System.out.println("GameOver");
		} else {
			System.out.println("your Car Gas is: " + this.getGas());
		}
	}

	public void boost() {

		if (this.getGas() < 3) {
			System.out.println("Your Car Gas less than 3");
		} else {
			
				this.setGas(getGas() - 3);
				if (this.getGas() == 0) {
					System.out.println("GameOver Your Car Gas 0");
				} else {
					System.out.println("your Car Gas is: " + this.getGas());
				}
			
		}
		
	}

	public void refuel() {
		if (this.getGas() > 8) {
			System.out.println("Your Car Gas Full");
		} else {

			this.setGas(getGas() + 2);
			System.out.println("your Car Gas is: " + this.getGas());
		}
	}

}