
public class ArrTest2 {

	public static void main(String[] args) {
		
		int[] eng_grade = new int[5];
		eng_grade[0] = 100;
		eng_grade[1] = 90;
		eng_grade[2] = 80;
		eng_grade[3] = 70;
		eng_grade[4] = 60;
		
		for(int i=0;i<eng_grade.length; i++) {
			System.out.println((i+1)+"번 학생의 영어 점수 : "+eng_grade[i]);
		}
		
	}
	
}
