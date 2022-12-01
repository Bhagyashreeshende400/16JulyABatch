package LogicalProgram;

public class Example2_ArmtrongNumbers 
{
public static void main(String[] args) 
{
	int OrgNum=153;
	int sum=0;
	for(int i=OrgNum;i>0;i=i/10)
	{
		int rem=i%10;
		sum=sum+(rem*rem*rem);
		
	}
if(OrgNum==sum)
{
	System.out.println("given number " + OrgNum + " is an armstrong number");
}
else
{
	System.out.println("given number " + OrgNum + " is not an armstrong number");
}
}
}
