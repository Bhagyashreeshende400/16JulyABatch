package Inheritance;

public class WhatsappV4 extends WhatsappV3
{
public void status()
{
	System.out.println("Status Updated");
}
public static void main(String[] args) 
{
WhatsappV4 v4=new WhatsappV4();
v4.sms();
v4.audiocall();
v4.videocall();	
v4.status();	
	
}


	
}
