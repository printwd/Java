import java.util.Arrays;

import javax.swing.JOptionPane;

public class LoopSample {

	public static void main(String[] args) {
		
		int arr[] = {127, 15, 223, 10, 27, 25, 50, 78};
			System.out.println(Arrays.toString(arr));
			//합, 평균, 최댓값, 최솟값 구해보기.
			
			int sum = 0;
			float avg = 0;
			int max_num = Integer.MIN_VALUE;
			int min_num = Integer.MAX_VALUE;
		
		for(int i=0; i< arr.length ; i++) {
			// 1 . 합
			sum=sum + arr[i];
			
			// 2. 평균
			avg = (float)sum / arr.length;
			
			// 3. 최댓값
			if(arr[i] > max_num) {max_num = arr[i];}
			
			// 4. 최솟값
			if(arr[i] < min_num) {min_num = arr[i];}
		}

		JOptionPane.showMessageDialog(null, "배열" + Arrays.toString(arr) 
		+ "\n합계 : " +sum + "\n평균 : " + avg + "\n최댓값 : " + max_num + "\n최솟값 : " + min_num);
		
	}
	
	
}
