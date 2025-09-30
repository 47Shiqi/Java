package javaPack;

public class WrapClass 
{
	public WrapClass()
	{
		// 1. Convert String to Integer using Integer wrapper class
		String strNumber = "25";
		Integer number = Integer.parseInt(strNumber);
		System.out.println("Number: " + number);
		
		// 2. Autoboxing: Convert primitive int to Integer object
		int primitiveInt = 10;
		Integer wrappedInt = primitiveInt; // Autobxing
		System.out.println("Wrapped Integer: " + wrappedInt);
		
		// 3. Unboxing: Convert Integer object back to primitive int
		int unboxedInt = wrappedInt; // Unboxing
		System.out.println("Unboxed Integer: " + unboxedInt);
		
		// 4. Perform arithemetic using wrapper objects
		Integer a = 15;
		Integer b = 5;
		System.out.println("Sum: " + (a + b));
		System.out.println("Product: " + (a * b));
		
		// 5. Check if number is even or odd using wrapper class method
		System.out.println(number + " is even? " + (number % 2 == 0));
		
		//6. Boolean wrapper example
		boolean isJavaFun = true;
		Boolean wrappedBoolean = isJavaFun; //Autoboxing
		boolean unboxedBoolean = wrappedBoolean; //Unboxing
		System.out.println("Wrapped Boolean: " + wrappedBoolean);
		System.out.println("Unboxed Boolean: " + unboxedBoolean);
	}
}
