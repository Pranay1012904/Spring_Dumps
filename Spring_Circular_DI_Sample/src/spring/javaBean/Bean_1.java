package spring.javaBean;

public class Bean_1 {
	
	private Bean_2 b2;
	
	Bean_1(){
		System.out.println("\nBEAN_1 EXECUTED!\n");
	}

	public Bean_2 getB2() {
		return b2;
	}

	public void setB2(Bean_2 b2) {
		this.b2 = b2;
	}
	
	

}
