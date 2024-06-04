package a;

public class CarMain {
	public static void main(String[] args) {
		car c1 = new car();
		c1.setCarMakers("기아");
		c1.setMakeYear(2020);
		c1.setWheelInch(18);
		c1.setLightStatue(false);
		
		c1.printCarMakers();
		c1.printMakeYear();
		c1.printWheelInch();
		c1.printLightStatue();
		
		System.out.println("=============");
		
		car c2 = new car();
		c2.setCarMakers("현대");
		c2.setMakeYear(2023);
		c2.setWheelInch(21);
		c2.setLightStatue(true);
		
		c2.printCarMakers();
		c2.printMakeYear();
		c2.printWheelInch();
		c2.printLightStatue();
	}
}
