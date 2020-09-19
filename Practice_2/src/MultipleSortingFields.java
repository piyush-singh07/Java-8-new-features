import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MultipleSortingFields {

	public static void main(String[] args) {

		List<Employee> list = Arrays.asList(

				new Employee("Rakesh", "Bharath"), new Employee("Amit", "Zayn"), new Employee("Rakesh", "Agarwal"),
				new Employee("Amit", "August"), new Employee("Jonas", "Andy")

		);

		Comparator<Employee> compByFirst = Comparator.comparing(Employee::getFirstname);
		Comparator<Employee> compBySecond = Comparator.comparing(Employee::getSecondname);
		Collections.sort(list, compByFirst.thenComparing(compBySecond));
		/*
		 * Collections.sort(list, compByFirst); 
		 * Collections.sort(list,compBySecond);
		 * 
		 * 
		 * This will not work because first the list will be sorted based on firstname
		 * like :
		 *   Employee [firstname=Amit, secondname=Zayn]
			 Employee [firstname=Amit, secondname=August]
			 Employee [firstname=Jonas, secondname=Andy]
			 Employee [firstname=Rakesh, secondname=Bharath]
			 Employee [firstname=Rakesh, secondname=Agarwal]
		 * Then again the list will sort based on secondname 
		 * like :
		 * 	 Employee [firstname=Rakesh, secondname=Agarwal]
			 Employee [firstname=Jonas, secondname=Andy]
			 Employee [firstname=Amit, secondname=August]
			 Employee [firstname=Rakesh, secondname=Bharath]
			 Employee [firstname=Amit, secondname=Zayn]
		 */
		list.forEach(System.out::println);

	}

}

class Employee {

	private String firstname;
	private String secondname;

	public Employee(String firstname, String secondname) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", secondname=" + secondname + "]";
	}

}
