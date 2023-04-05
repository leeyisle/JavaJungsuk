package ch06;

public class Ex20 {
//	주어진 배열에 담긴 값의 위치를 작업을 반복하여 뒤섞이게 하고, 처리한 배열을 반환하는 shuffle() 작성
//	반환타입 int[], 매개변수 int[] arr

	public static int[] shuffle(int[] arr) {
		//매개변수로 어떤 값이 넘어올 지 모르기 때문에 유효성체크 반드시 해주기
		if(arr==null || arr.length==0)
			return arr;
		
		
		for(int i=0; i<arr.length; i++) {
			int j = (int)(Math.random()*arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(java.util.Arrays.toString(original));
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
