class Main {
	public static void main(String args []) {
		SmartTv stv= new SmartTv();
		stv.channel = 10; //조상 클래스에서 상속받은 멤버
		stv.channelUp(); //보조상 클래서로부터 상속받은 멤버
		System.out.println(stv.channel);
		stv.displayCaption("Hello world");
		stv.caption = true;
		stv.displayCaption("Hello, world");
	}
}