/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String a;
		int n;
		
		a=sc.next();
		n=a.length();
		int count=0;
		for(int i=0;i<n;i++)
		{
			if((a.charAt(i)=='1')||(a.charAt(i)=='0'))
			{
				count++;
			}
			else
			{
			System.out.println("no");
			break;
			}
			
		}
		if(count==n)
		System.out.println("yes");
			
		}
		
		
		
	}
