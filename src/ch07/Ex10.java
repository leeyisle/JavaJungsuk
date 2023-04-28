package ch07;

/*
 * [7-10] 멤버변수 isPowerOn, channel, volume을 클래스 외부에서 접근할 수 없도록 제어자 붙이고
 * 대신 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드 추가
 * 실행결과 
 * CH:10
 * VOL:20
 * [7-11] 이전채널(previous channel)로 이동하는 기능의 메서드(gotoPrevChannel) 추가
 * 실행 결과
 * CH:10
 * CH:20
 * CH:10
 * CH:20
 */

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
//	[7-11]
	private int prevChannel;
	
	void gotoPrevChannel() {
		//채널에 이전 채널을 저장
		setChannel(prevChannel);
	}
//	  [7-10] 알맞은 코드를 넣어 완성하시오

	public int getChannel() {
		return channel;
	}
	public void setChannel(int num) {
		if(num < MIN_CHANNEL || num > MAX_CHANNEL) 
			return;
		
		prevChannel = this.channel;
		
		channel = num; //this.channel = num
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int num) {
		if(num < MIN_VOLUME || num > MAX_VOLUME) 
			return;
		volume = num; //this.volume = num
	}
}

class Ex10 {
	public static void main(String args[]) {
		MyTv2 t = new MyTv2();
//	[7-10]
//		t.setChannel(10);
//		System.out.println("CH:" + t.getChannel());
//		t.setVolume(20);
//		System.out.println("VOL:" + t.getVolume());
	
//		[7-11]
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setChannel(20);
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH:"+t.getChannel());

	}
}
