package tdd.code.maven.calculator;

public class StringCalculator {

//	public int add(String numbers) {
//        return 0;
//    }
	
	public int add(String numbers) {
	    if (numbers.isEmpty()) {
	        return 0;
	    }
	    return Integer.parseInt(numbers);
	}
}
