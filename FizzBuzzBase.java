package fizzbuzzreto;

public class FizzBuzzBase {
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

	public void play(int start, int end) {
		
	}
}
