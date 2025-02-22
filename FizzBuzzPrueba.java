package fizzbuzzreto;

public class FizzBuzzPrueba extends FizzBuzzBase {
    
	@Override
    
    public void play(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }
}
