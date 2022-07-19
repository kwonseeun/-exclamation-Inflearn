package JavaOop;

public class DrinkTest {
	public static void main(String[] args) {
		
		// 디폴트 생성자로 객체 만들기 
		Drink d1 = new Drink(); // 디폴트 생성자가 없기 떄문에 에러가 발생 
		d1.name = "포카리 ";
		d1.price = 1000;
		
		Drink d2 = new Drink("박카스", 800) ;
		
		System.out.println(d1.toStr());
		System.out.println(d2.toStr());
		
		}
	}
	// 드링크 객체 
	class Drink{
		
		String name;
		int price;
		

	// 생성자 
	Drink(String n , int p){
		name = n;
		price = p;
	}
	
	Drink(){
		
	}
	
	// 메소드 추가 
	String toStr() {
		return String.format("Drink { name: %s, price: %d }", name, price);
	}
}
