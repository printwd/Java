
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Chicken1 {
	
	public static void main(String[] args) {
		
		String arr[] = {"간장", "후라이드", "허니순살", "순살", "파이어윙"};
		
		String myOrder[] = new String[3];
		int num = 0;
		while(true) {
			
			String chickenName = JOptionPane.showInputDialog(null,"배달 치킨 이름을 입력하세요,");
			boolean exist = false;
			for(int i = 0 ; i < arr.length ; i++) {
				if(chickenName.equals(arr[i])) {
					exist = true;
				}
			}
			if(exist == false ) {
				JOptionPane.showMessageDialog(null, chickenName + "은 판매하지 않는 치킨입니다.");
				continue;
			}
			if(num < 2) {
				if(exist) {
					myOrder[num] = chickenName;
					num++;
				}
			}else {
				JOptionPane.showMessageDialog(null,"<치킨집 메뉴>" +  Arrays.toString(arr)
				+ "<나의 선택 메뉴>" + Arrays.toString(myOrder));
			}
			
		}
	}
	
}
