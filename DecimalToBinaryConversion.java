package day1;

public class DecimalToBinaryConversion {

	
	public static void main(String[] args) {
		//2진수 변환
		char[] mainresult =new DecimalToBinaryConversion().conversion(12);
		for (int i = mainresult.length-1; i>=0; i--) {
			if(mainresult[i]!=0)
			System.out.print(mainresult[i]);
		}
		
	}
	
	public  char[] conversion (int i) {
		char[] result = new char[32];
		int base = 2;
		int index =0;
		while(true) {
			result[index++] = String.valueOf(i % base).charAt(0);
			i=i/base;
			if(i==0) break;
		}
		return result;
}
}