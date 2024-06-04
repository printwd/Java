
public class Student {

	String name;
	public void printStu1() {
		int age = 24;
		String hak = "2020840374";
		String add = "청주";
		String num = "010-5461-6391";
		
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + hak);
		System.out.println("주소 : " + add);
		System.out.println("전화번호 :  " + num);
		
	}
	public void printStu2() {
		int age = 22;
		String hak ="2021011915";
		String add ="서울";
		String num = "010-9234-3438";
		
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + hak);
		System.out.println("주소 : " + add);
		System.out.println("전화번호 :  " + num);
	}
	public void printStu3() {
		int age = 21;
		String hak = "2023740303";
		String add = "대전";
		String num = "010-2356-0959";
		
		System.out.println("나이 : " + age);
		System.out.println("학번 : " + hak);
		System.out.println("주소 : " + add);
		System.out.println("전화번호 :  " + num);
		
	}
	public static void main(String[] args)
	{
		Student st1 = new Student();
		st1.printStu1();
		st1.printStu2();
		st1.printStu3();
		
	}
}