package ch03;

public class Ex2 {

	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 개수
		int sizeOfBucket = 10; // ( ) 바구니의 크기 바구니에 담을 수 있는 사과의 개수
		
		//int numOfBucket = ( /* (1) */ ); // 모든 사과를 담는데 필요한 바구니의 수
		//소수점까지 나오도록 double로 형변환
		//남는 사과를 담을 바구니도 필요하므로 나온 값을 올림 Math.ceil
		int numOfBucket = (int)Math.ceil((double)numOfApples/sizeOfBucket);
		//사과의 개수를 바구니의 크기로 나누고 나머지가 있다면 +1 
		//풀이의 답이 더 직관적인듯. 
		int numOfBucket2 = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0 ? 1 : 0);
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket2); 

	}

}
