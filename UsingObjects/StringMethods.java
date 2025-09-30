package javaPack;

public class StringMethods 
{
	public StringMethods() 
	{
		String message = "The Secret Code is: JavaRocks123!";
		
		// 1. Print original msg
		System.out.println("Original message: " + message);
		// 2. Length of the msg
		System.out.println("Length: " + message.length());
		// 3. Uppercase and lowercase
		System.out.println("Uppercase: " + message.toUpperCase());
		System.out.println("Lowercase: " + message.toLowerCase());
		// 4. Extract "JavaRocks123" using substring
		String code = message.substring(22,33); //Indicates might need adjusting
		System.out.println("Extract code: " + code);
		// 5. Index of "Code"
		System.out.println("Index of Code: " + message.indexOf("Code"));
		// 6.Character at position 10
		System.out.println("Character at index 10: " + message.charAt(10));
		// 7. Check if it contains "Secret"
		System.out.println("Conatins 'Secret'? " + message.contains("Secret"));
		// 8. replace "JavaRocks123" with asterisks
		String maskedMessage = message.replace("JavaRocks123", "***************");
		System.out.println("Masked Message: " + maskedMessage);
		// 9. Comparing ignoring case
		String comparison = "the secret code is: javarocks123!";
		System.out.println("Equal (ignore case)? " + message.equalsIgnoreCase(comparison));
		// 10. Bonus: Trim a anew string
		String messyString = "  Hidden Message  ";
		System.out.println("Trimmed: '" + messyString.trim() + "'");
	}
}
