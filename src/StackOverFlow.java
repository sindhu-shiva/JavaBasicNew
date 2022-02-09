
public class StackOverFlow {
	
	public void m1()
	{
		m2();
	}
	
	public void m2()
	{
		m3();
	}
	
	public void m3()
	{
		m4();
	}
	
	public void m4()
	
	{
		int a=10;
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		StackOverFlow syt= new StackOverFlow();
		// TODO Auto-generated method stub
           syt.m1();
	}
	}


