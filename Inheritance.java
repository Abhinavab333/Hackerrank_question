import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	protected int[]testScores;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
		
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;
	String firstName,lastName;
	int idNumber;


    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName,String lastName,int id,int[]testScores)
    {
    	super(firstName,lastName,id);
    	this.testScores=testScores;
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate()
    {
    	int sum=0,a;
    	char result='a';
    	for(int b=0;b<testScores.length;b++)
    	{
    		sum=sum+testScores[b];
    	}
    	a=sum/(testScores.length);
    	if(a>=90&&a<=100)
    	{
    		result='O';
    	}
    	else if(a>=80&&a<90)
    	{
    		result='E';
    	}
    	else if(a>=70&&a<80)
    	{
    		result='A';
    	}
    	else if(a>=55&&a<70)
    	{
    		result='P';
    	}
    	else if(a>=40&&a<55)
    	{
    		result='D';
    	}
    	else if(a<40)
    	{
    		result='T';
    	}
    	return result;


    }
}
class Inheritance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName,lastName,id,testScores);
		/*s.setfisrtName(firstName);
		s.setlastName(lastName);
		s.setidNumber(id);
		s.settestScores(testScores);*/
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}