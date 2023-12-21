package kadai_011;

public class Prime_Chapter11 {
	
	public static void main(String[] args) {
		
		boolean[] isPrime = new boolean[101];
		
		for( int i = 2; i < isPrime.length; i++ ) {
			isPrime[i] = true;
		}
		
		for( int i = 2; i < isPrime.length; i++ ) {
			if( isPrime[i] ) {
				for ( int j = 2 * i; j < isPrime.length; j += i ) {
					isPrime[j] = false;
				}
			}
		}
		
		for( int i = 2; i < isPrime.length; i++ ) {
			if( isPrime[i] ) {
				System.out.println(i);
			}
		}
		
	}

}
