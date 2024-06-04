public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 24;
		p1.name = "어윤규";
		p1.address = "청주시";
		p1.man =false;
		
		Car car1 = new Car();
		car1.makeyear = 2022;
		car1.carname = "그랜져";
		
		p1.myCar = car1;
		p1.printname();
		p1.printage();
		p1.printaddress();
		p1.printman();
		p1.myCar.printMakeYear();
		p1.myCar.printCarName();
		
		System.out.println("=============");
		
		Person p2 = new Person();
		p2.age = 26;
		p2.name = "최지혜";
		p2.address = "춘천시";
		p2.man =false;
		
		Car car2 = new Car();
		car2.makeyear = 2023;
		car2.carname = "제네시스";
		
		p2.myCar = car2;
		p2.printname();
		p2.printage();
		p2.printaddress();
		p2.printman();
		p2.myCar.printMakeYear();
		p2.myCar.printCarName();
	}
}
