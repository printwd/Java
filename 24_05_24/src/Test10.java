import java.util.Arrays;

import javax.swing.JOptionPane;

public class Test10 {

	public static void main(String[] args) {
		
		int arr[] = new int [5];
		
		for(int i = 0; i<arr.length; i++) {
			String tmpNo = JOptionPane.showInputDialog(null, (i+1) + "번째 배열의 숫자를 입력하세요.");
			int tmpNumber = 0;
			try {
				tmpNumber = Integer.parseInt(tmpNo);
			} catch (NumberFormatException ex) {

			}
			arr[i] = tmpNumber;
		}
		
		int max_value = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++) {
			if(max_value < arr[i]) {
				max_value = arr[i];
			}
		}
		
		JOptionPane.showMessageDialog(null, Arrays.toString(arr) + "\n최대값은 " + max_value + "입니다.");
		
	}
}
