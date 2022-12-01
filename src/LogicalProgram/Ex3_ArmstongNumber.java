package LogicalProgram;

public class Ex3_ArmstongNumber
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
	System.out.println("Armstong Number");
}
else
{
	System.out.println("Not an Armstong Number");
}
}
}
