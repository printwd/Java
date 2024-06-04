class sample2{
	public void printAge(){
		System.out.println("나이는 24살 입니다.");
	}
	public void printStudentNo(){
		System.out.println("나의 학번은 2021011915입니다");
	}
	public void printAddress(){
		System.out.println("주소는 청주시 상당구 용암동입니다.");
	}
	public static void main(String[] args){
		sample2 sam = new sample2();
		sam.printAge();
		sam.printStudentNo();
		sam.printAddress();
		
	}
}