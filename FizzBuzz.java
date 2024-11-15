/**
* Returns the FizzBuzz result for a given number.
* 
* @author bhickensalsa
*/
public class FizzBuzz {

    private int Fizz = 3;
    private int Buzz = 5;
    
    public static void main(String[] args) {
        FizzBuzz fizzbuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            fizzbuzz.checkNumber(i);
        }
    }

    public void checkNumber(int number) {
        if (number % Fizz == 0 && number % Buzz == 0) {
            System.out.println("FizzBuzz");
        }
        else if (number % Fizz == 0) {
            System.out.println("Fizz");
        }
        else if (number % Buzz == 0) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
    }
}