import javax.swing.JOptionPane;

public class StudentMain {

	public static void main(String[] args) {
		Student arr[] = new Student[5];
		
		for (int i=0; i<arr.length; i++) {
			String name = JOptionPane.showInputDialog(null, "이름 입력");
			String strScore = JOptionPane.showInputDialog(null, "점수 입력");
			int tmpScore = 0;
			try {
				tmpScore = Integer.parseInt(strScore);
				} catch (NumberFormatException ex) {}
				Student tmpStudent = new Student();
				tmpStudent.setName(name);
				tmpStudent.setScore(tmpScore);
				arr[i] = tmpStudent; // 배열 n 번째에 학생을 넣어준다.
			}
		
			int max_score_arr_no = 0;
			int max_score = Integer.MIN_VALUE;
			
			float summary = 0;
			float average = 0;
			for(int i=0; i<arr.length ; i++) {
				summary += arr[i].getScore(); // 합계를 구한다.
				
				if(max_score < arr[i].getScore()) {
					max_score = arr[i].getScore();
					max_score_arr_no = i;
				}
		}
			average = summary / arr.length; // 평균을 구한다.
			
			JOptionPane.showMessageDialog(null, "평균값은=" + average + "이고, 1등 학생의 점수는"
			+ arr[max_score_arr_no].getScore() + "이고, 이름은 " + arr[max_score_arr_no].getName() + "입니다.");
	}
}
