import javax.swing.JOptionPane;

public class GuGudan {
	
	public static void main(String[] args) {
	String dan = JOptionPane.showInputDialog(null,"합계를 구할 단을 입력하세요.");
	
	int intDan=1;
	
	try {
		intDan = Integer.parseInt(dan);
		int summary=0;
		int i=0;
		while( i<10 ) {
			
			summary = summary + (i*intDan);
			System.out.println(intDan + "X" + i + " = "+(i*intDan) );
			i++;
		}
		
		JOptionPane.showMessageDialog(null, dan + "단의 구구단의 합은" +summary +"입니다.");
		
	}catch (NumberFormatException e) {
	
	}
	
	}

}
