
public class abc2 implements abc,abc1{

	@Override
	public int test() {
		System.out.println("done");
		return 0;
		
	}
	
	public static void main(String[] args) {
		System.out.println(new abc2().test());
		abc a = new abc2();
		a.test();
	}

}
