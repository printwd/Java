import java.util.Random;

import javax.swing.JOptionPane;

public class UpDownGame {

	public static void main(String[] args) {
		int num = new Random().nextInt(101);
		System.out.println("생성된 난수" + num );
		for( ; ; ) {
			String InputNum = JOptionPane.showInputDialog(null, "Up Down Game\n1에서 100사이의 숫자를 입력하세요.");
			
			int myInputNum = 0;
			try {
				myInputNum = Integer.parseInt(InputNum);
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "숫자를 입력하세요.");
				continue;
			}
			
			
			if (myInputNum == num) {
				JOptionPane.showConfirmDialog(null, "축하합니다.");
				break;
			}else if (myInputNum > num) {
				JOptionPane.showConfirmDialog(null, "Down");
			}else if (myInputNum < num) {
				JOptionPane.showConfirmDialog(null, "Up");
			}
			
				
		}
		
	}
	
	
	
}
