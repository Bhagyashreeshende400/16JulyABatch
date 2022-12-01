package AbstractConcrete;

public class Sample2 extends Sample1
//Concrete Class
{
	 public void div(int a, int b)
	 {
		 System.out.println("Div:"+(a/b));
		 System.out.println("Good All the Best Continue for Next Process");
	 System.out.println("Output shown");
	 }
	public static void main(String[] args) 
	{
		Sample2 s2=new Sample2();
		s2.add(20,10);
		s2.sub(20,10);
	    s2.div(20,10);
	System.out.println("Succesfully Done");
	}
	
	 
	}



