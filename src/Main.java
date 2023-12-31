    //question1 :- //write a java program to add two numbers
    public class Main {
    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);

        //question2 :- //write a java program to add multiply numbers

        // Given numbers
        int num3 = 6;
        int num4 = 4;
        int num5 = 7;

        // Calculate the sum
        int sum1 = num3 + num4 + num5;

        // Calculate the product
        int product = num3 * num4 * num5;

        // Display the results
        System.out.println("Sum of " + num3 + ", " + num4 + ", and " + num5 + " is: " + sum1);
        System.out.println("Product of " + num3 + ", " + num4 + ", and " + num5 + " is: " + product);


        //question3 :- //write a java program to divide numbers


        double numerator = 556.0;
        double denominator = 34.0;

        // Check if the denominator is not zero to avoid division by zero
        if (denominator != 0) {
            // Calculate the result of division
            double result = numerator / denominator;

            // Display the result
            System.out.println("Result of " + numerator + " divided by " + denominator + " is: " + result);
        } else {
            // Handle division by zero
            System.out.println("Cannot divide by zero. Please provide a non-zero denominator.");

       //question4 :-   //write a java if else simple program

            // Given numbers
            int numm1 = 8;
            int numm2 = 5;

            // Compare the numbers
            if (numm1 > numm2) {
                System.out.println(numm1 + " is greater than " + numm2);
            } else if (numm1 < numm2) {
                System.out.println(numm1 + " is less than " + numm2);
            } else {
                System.out.println(numm1 + " is equal to " + numm2);
            }
        }


        //question5 :-//write a java data type program

        // Integer data type
        int intValue = 42;
        System.out.println("Integer Value: " + intValue);

        // Floating-point data type
        double doubleValue = 3.14;
        System.out.println("Double Value: " + doubleValue);

        // Character data type
        char charValue = 'A';
        System.out.println("Character Value: " + charValue);

        // Boolean data type
        boolean boolValue = true;
        System.out.println("Boolean Value: " + boolValue);

        // String data type
        String stringValue = "Hello, Java!";
        System.out.println("String Value: " + stringValue);
    }
}
