package Array;

public class Ex6_MultidimentionalArray 
{
//Multidimentional Array 
	public static void main(String[] args) 
	{
		int[][]ar=new int[2][3];
        //  0  1  2
		//0 10 20 30
		//1 40 50 60
ar[0][0]=10;
ar[0][1]=30;
ar[0][2]=40;
ar[1][0]=20;
ar[1][1]=60;
ar[1][2]=70;

	System.out.println(ar[1][0]);	
	System.out.println("Print All Data");	
		
		
	for(int i=0;i<=1;i++)         //Outerloop-->Rows
	{
		for(int j=0;j<=2;j++)     //InnerLoop--->Column
		{
			System.out.print(ar[i][j]+" ");
		}
	System.out.println();
	
	}
	
	}
	
}
