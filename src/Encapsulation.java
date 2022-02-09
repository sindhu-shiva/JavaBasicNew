
public class Encapsulation {
	
	private int rollno;
	private String name;
	
	public void setRollno(int rollno)
	{
		this.rollno= rollno;
	}
	
	public void setName(String name)
	{
		this.name= name;
	}
	
	public int getRollno()
	{
		return rollno;
	}
	
	public String getName()
	{
		return name;
	}

	public static void main(String[] args) {
		
		Encapsulation e= new Encapsulation();
		System.out.println("Details are =");
		e.setName("sindhu");
		e.setRollno(55);
		System.out.println(e.getName());
		System.out.println(e.getRollno());
	
		
		
		// TODO Auto-generated method stub

	}

}
