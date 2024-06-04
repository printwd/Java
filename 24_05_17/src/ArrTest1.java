
public class ArrTest1 {

	public static void main(String[] args) {
		
		int[] eng_grade = new int[] {100,90,95};
		int[] math_grade = new int[] {99,95,80};
		
		for(int i=0; i<eng_grade.length; i++) {
			System.out.println((i+1)+"번 학생의 영어점수 :"+eng_grade[i]);
		}
		for(int i=0; i<math_grade.length; i++) {
			System.out.println((i+1)+"번 학생의 수학점수 :"+math_grade[i]);
		}
	
	}
}
