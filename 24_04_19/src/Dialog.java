import javax.swing.JOptionPane;

public class Dialog {
	public static void main(String[] args) {
		 
		String hak = JOptionPane.showInputDialog(null, "학번을 입력하세요.");
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.");
		
		String out = "학번은 '" + hak + "' 입니다.\n" + "이름은 '" + name + "' 입니다.";
		
		JOptionPane.showMessageDialog(null, out);
		
		
		
	}

}
