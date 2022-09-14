package JavaOop;

public class GalaxyTest {
	public static void main(String[] args) {
		
		Galaxy[] phones = new Galaxy[5];
		
		for (int i = 0; i < phones.length; i++) {
			phones[i] = new Galaxy();
		}
		
		
		
		for (int i = 0; i < phones.length; i++) {
			phones[i].print();
		}
		System.out.println("===============");
		
		System.out.printf("Galaxy 객체의 개수: %d" ,Galaxy.cnt);
	}
	
}

	
	class Galaxy{

		String serialNum;
		
		static int cnt = 0;
		
		Galaxy(){
			cnt++;
			char c = randomAlphabet(); // A-Z 중 택1 
			serialNum = String.format("%c - %d",c, cnt);
		}

		public void print() {
			// TODO Auto-generated method stub
			
		}

		private char randomAlphabet() {
			return (char) ('A' + Math.random() * 26);
		}

}
