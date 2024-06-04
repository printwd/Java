import java.util.Arrays;
import java.util.Random;

public class ArrTest4 {

	public static void main(String[] args) 
	{
		int lotto[] = new int[6];
		
		for(int i = 0; i < lotto.length; i++) {
			int num  = new Random().nextInt(45)+1; // 1부터 46까지 난수
			lotto[i] = num;
			// 중복된 번호가 있는지 체크하여 한칸 뒤로 가서 다시 실행한다. 
			for(int j = 0; j < i; j++) {	
				if( lotto[i] == lotto[j] ) {
					i--; // 배열 1칸 뒤로 이동
					break;
				}
			}
		}
		
		System.out.println( Arrays.toString(lotto));// 로또번호를 출력한다.
                 }
}
