
public class StudentManager {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.name = "홍길동";
		st1.age = 24;
		st1.address = "청주시 상당구";
		st1.num = "010-5461-6391";
		
		Student st2 = new Student();
		st2.name = "세종대왕";
		st2.age = 21;
		st2.address = "청주시 서원구";
		st2.num = "010-9234-3438";
		
		Student st3 = new Student();
		st3.name = "이순신";
		st3.age = 22;
		st3.address = "청주시 청원구";
		st3.num = "010-2346-0959";
		
		//////////////// 학생의 정보를 출력한다. ////////////////
		st1.prinName();
		st1.printAge();
		st1.printAddress();
		st1.prinNum();
		
		st2.prinName();
		st2.printAge();
		st2.printAddress();
		st2.prinNum();
		
		st3.prinName();
		st3.printAge();
		st3.printAddress();
		st3.prinNum();
	}
}
