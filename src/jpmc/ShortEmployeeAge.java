package jpmc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ShortEmployeeAge {

	public static void main(String[] args) {

		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee("Jon", 22, 1001));
		emplist.add(new Employee("Steve", 19, 1003));
		emplist.add(new Employee("Kevin", 23, 1005));
		emplist.add(new Employee("Ron", 20, 1010));
		emplist.add(new Employee("Lucy", 18, 1111));


		emplist.sort((e1,e2)->e1.getAge()-e2.getAge());
		
		for(Employee e: emplist){
		System.out.println(e.getName()+"  "+e.getAge()+"  "+e.getId());
		}
		
		
	}

}
