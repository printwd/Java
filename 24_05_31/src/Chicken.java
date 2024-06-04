import java.util.Arrays;

import javax.swing.JOptionPane;

public class Chicken {
	
	public static void main(String[] args) {
		
		String arr[] = new String[5];
		arr[0] = "간장";
		arr[1] = "후라이드";
		arr[2] = "허니순살";
		arr[3] = "순살";
		arr[4] = "파이어윙";
		
		String myOrder[] = new String[3];
		int num = 0;
		while(true) {
			String chickenName = JOptionPane.showInputDialog(null,"배달 치킨 이름을 입력하세요,");
			
			boolean exist = false;
			for(int i = 0 ; i < arr.length ; i++) {
				if(arr[i].equals(chickenName)) {
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
					JOptionPane.showMessageDialog(null, chickenName + "을 장바구니에 담았습니다.\n장바구니" + Arrays.toString(myOrder));
					num++;
				}
			}else {
				JOptionPane.showMessageDialog(null, "3가지 치킨을 모두 배달 주머니에 담았습니다.\n배송을 시작합니다.");
			System.exit(0);
			}
			
		}
	}
	
}
