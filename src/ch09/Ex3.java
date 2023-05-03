package ch09;
/*
다음과 같은 실행결과가 나오도록 코드 작성
fullPath:c:\jdk1.8\work\PathSeparateTest.java
path:c:\jdk1.8\work
fileName:PathSeparateTest.java
*/
public class Ex3 {
	public static void main(String[] args) {
		String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
		String path = "";
		String fileName = "";
		/*
		 * (1) . 알맞은 코드를 넣어 완성하시오
		 */
		int idx = fullPath.lastIndexOf("\\");
		if(idx!=-1) {
			path = fullPath.substring(0, idx);
			fileName = fullPath.substring(idx+1);
		}
		
		
		System.out.println("fullPath:" + fullPath);
		System.out.println("path:" + path);
		System.out.println("fileName:" + fileName);
	}
}
