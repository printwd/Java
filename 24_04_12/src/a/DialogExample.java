package a;

import javax.swing.JOptionPane;

public class DialogExample {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.");
		
		System.out.println("입력값 : " + name);
		
		JOptionPane.showMessageDialog(null, "입력한이름 : " + name);
	}
}
