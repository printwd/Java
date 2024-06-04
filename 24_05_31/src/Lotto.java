import java.util.Arrays;
import java.util.Random;

import javax.swing.JOptionPane;

public class Lotto {
	
	public static void main(String[] args) {
		int lotto[] = new int[6];
			
		for(int i = 0; i < lotto.length; i++) { 
			int num = new Random().nextInt(45)+1;
			lotto[i] = num; for(int j = 0; j < i; j++) {
				if( lotto[i] == lotto[j] ) { 
					i--;
					break; 
				} 
			} 
		}	
		String num = JOptionPane.showInputDialog(null, "6자리의 숫자를 콤마로 구분하도록 하여 입력하세요.\n예시 32,12,23,5,13,22");
		String myNumArr[] = num.split(",");
		if( myNumArr.length != 6 ) {
			JOptionPane.showMessageDialog(null, "6자리 숫자가 아닙니다.");
			System.exit(0);
		}

		int correctCount=0;
		for( int i=0; i< lotto.length ; i++ ) {
			for( int j=0; j< myNumArr.length ; j++ ) {
				if( myNumArr[j].equals( lotto[i]+"" ) ) {
					correctCount ++;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "로또번호" + Arrays.toString(lotto) + "\n나의 번호: " +Arrays.toString(myNumArr)
		+"\n맏힌개수: "+ correctCount +"개" );	

	}
}