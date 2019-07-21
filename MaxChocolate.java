import java.io.*;
import java.util.*;

class MaxChocolate
{       
	public static void main(String args[])
	{
		int tm=15,per=1,wr=3,s=0,ch;
		System. out. println("\n\t Total money you have : " + tm);
		System. out. println("\n\t Wrapper to get 1 chocolate in Excahnge : " + wr);
		System.out.println("\n\t Per Chocolate price: " + per);
		ch=tm/per;
		s=s+ch;
		while(ch>=wr){
			s=s+ch/wr;
			ch=ch/wr+ch%wr;
		}
		System.out.println("\n\n Maximum chocolate you can eat = "+s);
    } 
}