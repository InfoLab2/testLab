package puzzle1;

public class Main {
	

	public static void main(String[] args) {
		blackjack(17,19);

	}
	// Given 2 int values greater than 0, and the method returns
	// whichever value is nearest to 21 without going over. 
	// It returns 0 if they both go over.
	public int blackjack(int a, int b) {
		public int blackjack(int a, int b) {
			  if (a <= 21 && b <= 21) {
			    if ((21 - a) < (21 - b)) {
			      return a;
			    }
			    else {
			      return b;
			    }
			  }
			  if (a > 21 && b <= 21) {
			    return b;
			  }
			  if (a <= 21 && b > 21) {
			    return a;
			  }
			  else {
			    return 0;
			  }
			}

	}

}
