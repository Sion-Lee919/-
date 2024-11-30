package day1;

public class ArithmeticSequence {

	public static void main(String[] args) {
		// 등차수열
		int n = 10000;

		int ten = new ArithmeticSequence().seq(n);
		System.out.println("seq(" + n+")="+ten);

		int ten2 = new ArithmeticSequence().seq2(n);
		System.out.println("seq(" + n+")="+ten2);

	}
	
	public int seq(int n) {
		int result =0;
		if (n==1) result =1;
		else result = seq(n-1) +3;
		
		return result;
	}
	
	public int seq2(int n) {
		//반복문
		int result =0;
		for(int i =1; i<=n; i++) {
			result =1+(i-1) * 3;
		}
		return result;
	}
}
