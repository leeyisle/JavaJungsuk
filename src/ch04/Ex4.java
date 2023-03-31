package ch04;

public class Ex4 {
	public static void main(String[] args) {
//		1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상이 되는지

		int sum = 0;	//총합
		int s = 1;		//값의 부호 바꿀 때 사용
		int num = 0;	
		
		for(int i=1;sum<100;i++,s=-s) { // 매 반복마다 s의 값은 1, -1, 1, -1...
			num = i * s;	// i와 부호(s)를 곱해서 더할 값을 구한다.
			sum += num;
		}
		
		System.out.println("num="+num);
		System.out.println("sum="+sum);
	}

}
