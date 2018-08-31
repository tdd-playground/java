package tdd.fizzbuzz;

public class FizzBuzz {

    public static void main(String args[]) {
        for(int index = 1; index <= 100; index++) {
            if(isMultiple(index, 15)) {
                System.out.println("FizzBuzz");
            } else if(isMultiple(index, 5)) {
                System.out.println("Buzz");
            } else if(isMultiple(index, 3)) {
                System.out.println("Fizz");
            } else {
                System.out.println(index);
            }
        }
    }

    public static boolean isMultiple(int number, int multipleValue) {
        return (number % multipleValue) == 0;
    }
}
