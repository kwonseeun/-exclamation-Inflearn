package JavaOop;

public class EmployeeTest {

	public static void main(String[] args) {
	// 배열 생성 
	int[] hours0 = {2,4,3,4,5,8,8};
	
	// 객체 생성 
	Employee e0 = new Employee("직원0", hours0);
	
	Employee[] employees = { e0 };
	
	for (int i = 0; i < employees.length; i++) {
		employees[i].printTotalHours();
		}
	}
}
class Employee {
	// 필드 
	String name;
	int[] hours;
	
	Employee(String str, int[] arr) {
		name = str;
		hours = arr;
	}
	
	void printTotalHours() {
		System.out.printf("%s -> %d 시간 \n", name, totalHours());
	}
	
	int totalHours() {
		int sum = 0;
		for (int i = 0; i< hours.length; i ++) {
			sum += hours[i];
		}
		return sum;
	}
}

