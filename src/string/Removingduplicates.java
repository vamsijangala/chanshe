package string;

public class Removingduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int current = input[0];
		//boolean found = false;
		//System.out.println(input.length);

		for (int i = 0; i < input.length; i++) {
		    if (current != input[i]) {
		    	
		        System.out.print(" " + current);
		        current = input[i];
		    	
		    }
		}
		System.out.print(" " + current);
	}
}