
public class Student2 {
	int age = 20;
	String name = "홍길동";
	String address = "청주시";
	boolean man = true;
	
	public void printAge(int paramAge) {
		age = paramAge;
		System.out.println("나이 : " + age);
	}
	public void printName( String paramName) {
		name = paramName;
		System.out.println("이름 : " + name);
	}
	public void printAddress(String paramAddress) {
		address = paramAddress;
		System.out.println("주소 : " + address);
	}
	public void printMan(boolean paramMan) {
		man = paramMan;
		if(man) {
			System.out.println("성별 : 남자입니다");
		} else {
				System.out.println("성별 : 여자입니다.");
		}
	
	}
	public void getAllValues(int pAge, String pName, String pAddress, boolean pMan) {
		age = pAge;
		name = pName;
		address = pAddress;
		man = pMan;
		System.out.println("나이:" + age);
		System.out.println("이름:" + name);
		System.out.println("주소:" + address);
		if(man) {
			System.out.println("성별 : 남자입니다");
		} else {
				System.out.println("성별 : 여자입니다.");
		}
	}
}
