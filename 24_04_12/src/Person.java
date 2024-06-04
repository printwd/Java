public class Person {
	int age = 10;
	String name = "홍길동";
	String address ="충북 청주시";
	boolean man = true;
	
	Car myCar;
	
	public void printname() {
		System.out.println("사람의 이름은" + name + "입니다.");
	}
	public void printage() {
		System.out.println(name + "의 나이는" + age + "입니다.");
	}
	public void printaddress() {
		System.out.println(name + "의 주소는" + address + "입니다.");
	}
	public void printman() {
		if(man == true) {
			System.out.println(name + "의 성별은 남자입니다.");
		}else {
			System.out.println(name + "의 성별은 여자입니다.");
		}
	}
	
	
}