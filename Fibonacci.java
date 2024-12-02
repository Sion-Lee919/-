package day1;

public class Fibonacci {

	public static void main(String[] args) {
		//피보나치정렬
		int n=10;
		int n1 =1, n2=1;//n1-전전항 n2-전항
		int result = 0;
		for (int i = 3; i <=n; i++) {
			result = n1 + n2;
			
			n1=n2;
			n2=result;
		}
		System.out.println(result);
		
		int result2 = fibo(n);
		System.out.println(result2);
	}
	
	public static int fibo(int n) {//재귀로
		if(n == 1 || n == 2) return 1;
		return fibo(n-2) + fibo(n-1);
	}
}
