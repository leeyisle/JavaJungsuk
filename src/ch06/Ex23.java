package ch06;

public class Ex23 {
	 /*
	(1)  . max메서드를 작성하시오
	주어진 int형 배열의 값 중 제일 큰 값을 반환
	만일 주어진 배열이 null 이거나 크기가 0인 경우 -999999를 반환
	반환타입 int, 매개변수 int[] arr
	*/
	public static int max(int[] arr) {

		if(arr == null || arr.length == 0) 
			return -999999;
		
		int max = arr[0];	//배열 첫번째 값으로 초기화
		//배열 두번째 값부터 비교
		for(int i=1; i<arr.length;i++) {

			if(max < arr[i]) {
					max = arr[i];
			}
		}
		
		return max;
	}
	
	public static void main(String[] args)
	{
	int[] data = {3,2,9,4,7};
	System.out.println(java.util.Arrays.toString(data));
	System.out.println("최대값 :"+max(data)); 
	System.out.println("최대값 :"+max(null)); 
	System.out.println("최대값 :"+max(new int[]{})); // 크기가 0인 배열
	}

}
