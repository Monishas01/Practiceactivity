//with return type and with argument
package first;

public class construct {
	public static void main(String[] args) {
		PersonDetails persondetail=new PersonDetails();
		int finalamount=persondetail.incSalary(50000, 5000);
	System.out.println("final amount is :"+finalamount);
	}
}


//with return type and with argument
public class PersonDetails {
	
	int incSalary(int salary,int bonus) {
		return bonus+salary;
	}

}

