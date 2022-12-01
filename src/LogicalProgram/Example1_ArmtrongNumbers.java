package LogicalProgram;

public class Example1_ArmtrongNumbers 
{
public static void main(String[] args)
{
	int OrgNum = 153;  // 1+125+27=153
	int sum = 0;    

	int rem = OrgNum%10;  // 153%10= 3
	System.out.println(rem);
OrgNum=OrgNum/10;            //153/10 =15
System.out.println(OrgNum);
}
}
