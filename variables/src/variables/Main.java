package variables;

public class Main {
	public static void main(String[] args) {
		//type variableName = value;
		String name = "Andrés";
		System.out.println("I will print my string var: " + name + "\n");
	
		int myNum = 15;
		System.out.println("I will print my integer var: " + myNum+ "\n");

		// you can also declare a variable without assigning the value, and assign the value later
		int myNum_1;
		myNum_1 = 19;
		System.out.println(myNum_1 + "\n");
 
		// Note that if you assign a new value to an existing variable, it will overwrite the previous value
		int myNum_2 = 15;
		myNum_2 = 30;
		System.out.println(myNum_2 + "\n");

		final int myNum_3 = 90000;
		System.out.println(myNum_3);
	}
}
