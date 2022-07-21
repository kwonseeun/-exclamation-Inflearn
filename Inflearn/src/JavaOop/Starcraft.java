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
	
	Marine(String s, int t){
		name = s;
		hp = t;
	}
}

class Medic {
	String name;
	int hp;
	int mp;
	
	Medic(String s, int i1, int i2){
		name = s;
		hp = i1;
		mp = i2;
	}
}
