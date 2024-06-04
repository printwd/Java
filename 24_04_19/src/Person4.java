import javax.swing.JOptionPane;

public class Person4 {
	
	public static void main(String[] args) {
		
		String age1 = JOptionPane.showInputDialog(null, "나이를 입력하세요.");
		int age = 0;
		try {
			age = Integer.parseInt(age1);
		}catch(NumberFormatException ex) {
			JOptionPane.showConfirmDialog(null, "숫자를 입력해야 합니다.");
		}
		
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.");
		
		
		String out1 = "나이는 " + age + " 입니다";
		String out2 = "이름은 " + name + " 입니다";
		
		JOptionPane.showMessageDialog(null, out1);
		JOptionPane.showMessageDialog(null, out2);
	}
		
}
