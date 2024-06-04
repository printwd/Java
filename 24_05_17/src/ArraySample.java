import javax.swing.JOptionPane;

public class ArraySample {

	public static void main(String[] args) {
		int tmpArr[] = {127, 15, 223, 10, 24, 25, 50, 78};
		
		for(int i=0; i<tmpArr.length; i++) {
			System.out.println(tmpArr[i]+".");
		}
		System.out.println("\n===================");
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		float avg = 0;
		
		for(int tmp : tmpArr) {
			if(tmp>max) {max=tmp;}
			if(tmp<min) {min=tmp;}
			sum+= tmp;
		}
		avg = sum/tmpArr.length;
		
		JOptionPane.showMessageDialog(null, "합계=" + sum + ", 평균=" + avg + ", 최대값=" + max + ", 최솟값=" + min);
	}
	
}
