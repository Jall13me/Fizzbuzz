package fizzbuzzreto;

public class FizzBuzzPrueba {
    public void play(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }

    public String getFizzBuzzValue(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
}