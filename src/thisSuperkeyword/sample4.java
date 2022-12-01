package thisSuperkeyword;

public class sample4 extends sample3
{

//subclass	
	//int a=10      //global variable from superclass
	int a=20;      //global variable
	
		public void m2()
		{
			int a=30;    //local variable
		System.out.println("HI:"+a);        // local variable
		System.out.println("Hello:"+(this.a));   // global variable
		System.out.println("How are you:"+(super.a));  //super class variable
		
		}
	}

