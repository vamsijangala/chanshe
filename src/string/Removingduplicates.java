package string;

public class Removingduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 7,3,2103,3,10,23};
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