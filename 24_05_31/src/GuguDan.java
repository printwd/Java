import javax.swing.JOptionPane;

public class GuguDan {

	public static void main(String[] args) {
		String dan = JOptionPane.showInputDialog(null, "단을 입력하세요.");
		
		int danNum = 0;
		int sum = 0;
		
		try {
			danNum = Integer.parseInt(dan);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "단은 숫자만 입력 가능합니다.");
		}
		for(int i=1 ; i<=9 ; i++) {
			int tmpNum = danNum*i;
			sum+=tmpNum;
			
			System.out.println(dan + "*" + i + "=" + tmpNum + "      sum = " + sum);
		}
		
		JOptionPane.showMessageDialog(null, dan + "의 합은" + sum + " 입니다.");
	}
}
