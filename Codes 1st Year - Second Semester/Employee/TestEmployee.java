public class TestEmployee{
	public static void main (String args[])
	{
		//Employee painter, electrician, ....;
		//Employee firstEmployee, secondEmployee...
		
		//does not initial all the objects
		Employee[] emps = new Employee[7];
		
		//call individual constructors
		
		final int START_NUM = 101;
		final double STARTING_SALARY = 15_000;
		
		for(int x = 0; x < emps.length; ++x)
			emps[x] = new Employee(START_NUM + x, STARTING_SALARY);
		
		//some classes contains default constructors
		
		final int NUM_ITEMS = 7;
		Employee[] items = new Employee[NUM_ITEMS];
		for(int x = 0; x < NUM_ITEMS; ++x)
			items[x] = new Employee();
	
		for (int x = 0; x <items.length; ++x)
			System.out.println(items[x].getEmpNum() + " " +
					items[x].getSalary());
	

	
		for (int x = 0; x <emps.length; ++x)
			System.out.println(emps[x].getEmpNum() + " " +
					emps[x].getSalary());
		//using enhanced for
		for(Employee worker : emps)
			System.out.println(worker.getEmpNum() + " "
				+ worker.getSalary());


		
		//Arrays of Strings
		
		String[] deptNames= {"Accounting","Human Resources","Sales"};
		
		for(int a = 0; a < deptNames.length; ++a)
			System.out.println(deptNames[a]);
		}
	}		
		
		
		