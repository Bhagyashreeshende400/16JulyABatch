package MethodWithReturnType;

public class Example5 
{
	public static void main(String[] args) 
	{
		Example5 s3=new Example5();
		String len=s3.m1("Shekhar");
		
		System.out.println(len);
		System.out.println(s3.m1("Bhagyashree"));
		Example6 b=new Example6();//  Create object call from diff class
		String surname=b.m2("Om Namh Shivy");
		System.out.println(surname);
		
	}
		public String m1(String Name)
		{
			String s1=Name;
			return s1;
		}
	}


