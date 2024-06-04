package a;

public class car {
	String carmakers = "현대";
	int makeyear = 2024;
	int wheelinch = 20;
	boolean lightstatue = true;
	
	public void setCarMakers(String tmpCarMakers) {
		carmakers = tmpCarMakers;
	}
	public void setMakeYear(int tmpMakeYear) {
		makeyear = tmpMakeYear;
	}
	public void setWheelInch(int tmpWheelInch) {
		wheelinch = tmpWheelInch;
	}
	public void setLightStatue(boolean tmpLightStatue) {
		lightstatue = tmpLightStatue;
	}
	
	public void printCarMakers() {
		System.out.println("제조사 : " + carmakers);
	}
	public void printMakeYear() {
		System.out.println("연식 : " + makeyear);
	}
	public void printWheelInch() {
		System.out.println("휠 사이즈 : " + wheelinch);
	}
	public void printLightStatue() {
		if(lightstatue) {
			System.out.println("전조등 on");
		}else{
			System.out.println("전조등 off");
		}
	}
	
}
