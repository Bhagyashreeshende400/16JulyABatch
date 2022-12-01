package UseOfstaticNonstatic;

public class empinfo
{
public static void main(String[] args) 
{
	employee e1=new employee();            //Object 1 Create 
	e1.empName="Shekhar";
	e1.empID=23;
e1.empCEOName="Shekhar Shende";
	
	
	employee e2=new employee();              //Object 2 Create 
	e2.empName="Bhagyashree";
	e2.empID=10;
	e2.empCEOName="Bhagyashree Shende";
	
	
	employee d3=new employee();              //Object 3 Create 
	d3.empName="Pooja";
	d3.empID=15;
	d3.empCEOName="XYZ";
	
	e1.showinfo();
	e2.showinfo();
	d3.showinfo();
	
	
	
}
	
	
	
	
}
