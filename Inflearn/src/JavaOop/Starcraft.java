package JavaOop;

public class Starcraft {
	public static void main(String[] args) {
		// 객체 생성
		Marine ma = new Marine("레이너", 80);
		Medic me = new Medic("모랄레스", 60, 60);		
		
		// 마린의 스팀팩 
		
				
		// 메딕의 힐 
	}
}

class Marine {
	String name;
	int hp; 
}

class Medic {
	String name;
	int hp;
	int mp;
}
