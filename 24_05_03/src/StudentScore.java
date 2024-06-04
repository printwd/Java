import javax.swing.JOptionPane;

public class StudentScore {

	public static void main(String[] args) {
		String stName = JOptionPane.showInputDialog(null, "이름을 입력하세요.");
		String stScore = JOptionPane.showInputDialog(null, "학점을 입력하세요.");
		
		int stScoreInt = 0;
		
		try {
			stScoreInt = Integer.parseInt(stScore);	
		}catch(NumberFormatException ex){
			JOptionPane.showMessageDialog(null, "학점은 숫자만 압력하세요.");
		}
	
	if( stScoreInt>=90 ) {
		JOptionPane.showMessageDialog(null, stName + "학생의 학점은 'A' 입니다.");
	}else if( stScoreInt >=80 ) {
		JOptionPane.showMessageDialog(null, stName + "학생의 학점은 'B' 입니다.");
	}else if( stScoreInt >=70 ) {
		JOptionPane.showMessageDialog(null, stName + "학생의 학점은 'C' 입니다.");
	}else if( stScoreInt >=60 ) {
		JOptionPane.showMessageDialog(null, stName + "학생의 학점은 'D' 입니다.");
	}else if( stScoreInt >=50 ) {
		JOptionPane.showMessageDialog(null, stName + "학생의 학점은 'E' 입니다.");
	}else if( stScoreInt >=80 ) {
		JOptionPane.showMessageDialog(null, stName + "학생의 학점은 'F' 입니다.");
	}
	
	}

}