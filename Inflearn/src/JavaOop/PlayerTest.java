package JavaOop;


public class PlayerTest {
	public static void main(String[] args) {
		
		// 점수 배열 생성 
		int [] points0 = { 10, 9, 9, 8};
		int [] points1 = { 9, 10, 9, 9 };
		int [] points2 = { 10, 9, 10, 10};
		
		// 선수 객체 생성 
		Player p0 = new Player("kim", points0);
		
		// 객체 배열 만들기 
		Player[] play = {p0, p1, p2};
	}
}