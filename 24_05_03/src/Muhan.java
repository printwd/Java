import javax.swing.JOptionPane;

public class Muhan {

	public static void main(String[] args) {
		
		while( true ) {
			String menu = JOptionPane.showInputDialog(null, "메뉴 입력\n1:등록, 0:종료");
			
			if (menu == null) {
				JOptionPane.showMessageDialog(null, "취소를 누르셨군요.");
				continue;
			}
			
			if (menu.equals("0")) {
				System.exit(0);
			} else if(menu.equals("1")) {
				
				String stName = JOptionPane.showInputDialog(null, "학생이름입력");
				String korScore = JOptionPane.showInputDialog(null, "국어성적입력");
				String engScore = JOptionPane.showInputDialog(null, "영어성적입력");
				String mathScore = JOptionPane.showInputDialog(null, "수학성적입력");
				
				int korScoreint = 0;
				int engScoreint = 0;
				int mathScoreint = 0;
				
				try {
					korScoreint = Integer.parseInt(korScore);
					engScoreint = Integer.parseInt(engScore);
					mathScoreint = Integer.parseInt(mathScore);
				}catch (NumberFormatException e) {
					
				}
				
				int total = korScoreint + engScoreint + mathScoreint;
				int avg = total /3;
				String grade = "A";
				if (avg >=90 ) {grade = "A";
				}else if (avg >= 80) {grade = "B";
				}else if (avg >= 70) {grade = "C";
				}else if (avg >= 60) {grade = "D";
				}else if (avg >= 50) {grade = "E";
				}else{grade="F";}
			
			JOptionPane.showMessageDialog(null, stName+"의 총점 : " +total + ", 평균" + (total/3) +", 학점:" + grade );
			}else {
				JOptionPane.showConfirmDialog(null, "메뉴는\n1:등록, 0:종료만 허용됩니다.");
			}
		}
	}
	
}
