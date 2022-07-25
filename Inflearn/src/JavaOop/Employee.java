package JavaOop;

public class Employee {

	public static void main(String[] args) {
	int[] hours0 = {2,4,3,4,5,8,8};
	
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
		System.out.println("%s -> %d 시간 \n", name, totalHours());
	}
	
	int totalHours() {
		int sum = 0;
		for (int i = 0; i< hours.length; i ++) {
			sum += hours[i];
		}
		return sum;
	}
}
