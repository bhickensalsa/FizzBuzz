/**
* Returns the FizzBuzz result for a given number.
* 
* @author ChatGPT
*/
public class FizzBuzzOptimized {

    public static void main(String[] args) {
        final int FIZZ = 3;
        final int BUZZ = 5;

        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzz(i, FIZZ, BUZZ));
        }
    }

    /**
     * Returns the FizzBuzz result for a given number.
     * 
     * @param number the number to check
     * @param fizz   the divisor for "Fizz"
     * @param buzz   the divisor for "Buzz"
     * @return a String representing "Fizz", "Buzz", "FizzBuzz", or the number itself
     */
    private static String getFizzBuzz(int number, int fizz, int buzz) {
        StringBuilder result = new StringBuilder();

        if (number % fizz == 0) result.append("Fizz");
        if (number % buzz == 0) result.append("Buzz");

        return result.isEmpty() ? String.valueOf(number) : result.toString();
    }
}
