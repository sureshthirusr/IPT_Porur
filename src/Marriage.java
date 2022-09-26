
public class Marriage extends Boy{

	@Override
	public void girlName() {
		//super.girlName();
		System.out.println("Pooja");
	}
	
	public static void main(String[] args) {
		Boy m=new Boy();
		m.girlName();
	}

}
