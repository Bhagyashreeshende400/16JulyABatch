package Generalization;

public class TestGeneralization 


{
public static void main(String[] args) 
{
	System.out.println("***Feature of Jio Simcard***");
Jio j=new Jio();
j.sms();
j.audiocalling();
j.Data();
j.newFeatureA();



System.out.println("***Feature of VI Simcard***");
VI i=new VI();
i.sms();
i.audiocalling();
i.Data();
i.newFeatureB();

System.out.println("***Feature of Airtel Simcard***");
Airtel a=new Airtel();
a.sms();
a.audiocalling();
a.Data();
a.newFeatureC();




}
	
	
}
