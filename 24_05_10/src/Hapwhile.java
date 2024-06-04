
public class Hapwhile {

	public static void main(String[] args) {
		
		int i = 0;
		int j =0;
		
		do {
			
			j+=i;
			i+=2;
			
		}while(i<=2000);
		
		System.out.println("1부터 2000까지의 짝수의 합은 " +j+"입니다.");
	}
	
	
}
