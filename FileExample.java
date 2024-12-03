package day1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
		/*//File 객체 생성
		File dir = new File("C:/ezwel");
		
		//존재하지 않으면 디렉토리 또는 파일 생성
		if(dir.exists() ) {  
		File[] contents = dir.listFiles();
		
		for(File onecontent : contents) {
			if(onecontent.isDirectory()) {
				System.out.printf("%-10s%-20s", "<DIR>", onecontent.getName());
				File [] contents2 = onecontent.listFiles();
				// 언제까지 반복할 것이냐가 문제. 재귀호출로 변경해 보자
			} else {
				System.out.printf("%-10s%-20s", "<FILE>", onecontent.getName());
			}
 			System.out.println();
		}//for end
	}//if end
	*/
		getDir("c:/ezwel/workspace_java",0);
	}
	
	public static void getDir(String name,int depth) throws IOException {
		File dir = new File(name);
		File[] contents = dir.listFiles();
		String space = "-";
		for(int i=1; i<=depth; i++) {
			space+="-";
		}
		for(File onecontent : contents) {
			if(onecontent.isDirectory()) {
				System.out.printf("%-10s%-40s", depth+space+"<DIR>", onecontent.getCanonicalPath());
				getDir(onecontent.getCanonicalPath(),depth+1);
			} else {
				System.out.printf("%-10s%-20s", depth+space+"<FILE>", onecontent.getName());
			}
 			System.out.println();
		}//for end

	}
	
	
}
