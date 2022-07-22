package JavaOop;

public class Starcraft {
	public static void main(String[] args) {
		// 객체 생성
		Marine ma = new Marine("레이너", 80);
		Medic me = new Medic("모랄레스", 60, 60);		
		
		// 마린의 스팀팩 
		ma.stimpack();
				
		// 메딕의 힐 
		me.heal(ma);
	}
}

class Marine {
	String name;
	int hp; 
	
	Marine(String s, int t){
		name = s;
		hp = t;
	}
	void stimpack() {
		System.out.printf(" [%s]의 스팀팩 !: HP: %d -> %s", name , hp, hp);
		hp -= 10;
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
	
	void heal(Marine target){
		System.out.println("힐 !");
	}
}
