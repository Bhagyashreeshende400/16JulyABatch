package Constructor;

public class parameterized_constructor
{

	String name;
	int rollnum;
	char grade;
	
	parameterized_constructor(String nm,int rno,char gr)
	{
		name=nm;
		rollnum=rno;
		grade=gr;
		}
public void display()

{
	System.out.println("*****call to Non static method*****");
	System.out.println("Student details:"+name+" "+rollnum+" "+grade);
}
public static void info()

{
parameterized_constructor p2=new parameterized_constructor("hello",2,'A');
System.out.println("******call to static method******");
System.out.println(p2.name);
System.out.println(p2.rollnum);
System.out.println(p2.grade);

}
public static void main(String[] args)
{
	parameterized_constructor p1=new parameterized_constructor("Shekhar",1,'A');
	p1.display();
	
	info();
}


}
