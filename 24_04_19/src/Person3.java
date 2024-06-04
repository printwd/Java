import javax.swing.JOptionPane;

public class Person3 {
	
	public static void main(String[] args) {
		
		boolean isgirl = true;
		
		String age1 = JOptionPane.showInputDialog(null, "나이를 입력하세요.");
		int age = Integer.parseInt(age1);
		
		String name = JOptionPane.showInputDialog(null, "이름을 입력하세요.");
		
		String isman = JOptionPane.showInputDialog(null, "성별 입력.\n남자 : 0, 여자 : 1");
			if(isman.equals("0")) {
				isgirl = true;
		}else if(isman.equals("1")) {
				isgirl = false;
		}
		
		
		String out1 = "나이는 " + age + " 입니다\n"+"이름은 " + name + " 입니다\n"+"성별은 " + ((isgirl)?"남자입니다":"여자입니다");

		JOptionPane.showMessageDialog(null, out1);
	}
		
}
