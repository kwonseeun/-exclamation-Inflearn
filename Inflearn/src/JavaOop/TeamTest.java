package JavaOop;

public class TeamTest {
	
	public static void main(String[] args) {

		// 선수 생성 객체
		Player2 kim = new Player2("kim", new int[] { 9, 8, 10 });
		Player2 lee = new Player2("lee", new int[] { 10, 9, 10 });
		Player2 park = new Player2("park", new int[] { 8, 10, 9 });

		// 중국 생성 객체
		Player2 xi = new Player2("xi", new int[] { 9, 8, 10 });
		Player2 yu = new Player2("yu", new int[] { 10, 9, 10 });
		Player2 xui = new Player2("xui", new int[] { 8, 10, 9 });

		Player2[] koreaPlayers = { kim, lee, park };
		Player2[] chinaPlayers = { xi, yu, xui };

		Team korea = new Team("KOREA", koreaPlayers);
		Team china = new Team("CHINA", chinaPlayers);

		korea.printTeamPoints();
		china.printTeamPoints();
	}

}

class Team {

	// 필드
	String nation; // 나라
	Player2[] players; // 선수

	Team(String str, Player2[] arr) {
		nation = str;
		players = arr;

	}

	// 메소드
	void printTeamPoints() {
		int sum = 0;
		for (int i = 0; i < players.length; i++) {
			sum += players[i].totalPoints();
		}
		System.out.printf("%s -> %d points\n", nation, sum);
	}
}

class Player2 {

	String name;
	int[] points;

	Player2(String str, int[] arr) {
		name = str;
		points = arr;
	}

	int totalPoints() {
		int sum = 0;
		for (int i = 0; i < points.length; i++) {
			sum += points[i];
		}
		return sum;
	}
}
