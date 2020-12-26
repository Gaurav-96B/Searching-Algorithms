import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
	    int t;
	    Scanner sc=new Scanner(System.in);
	    t=sc.nextInt();
	    sc.nextLine();
	    while(t-->0)
	    {
	        int n=sc.nextInt();
	        int a[]=new int[n];
	        for(int i=0;i<n;i++)
	        {
	            a[i]=sc.nextInt();
	        }
	        int count=1;
	        int start=a[0];
	       for(int i=1;i<n;i++)
	       {
	           if(start<a[i])
	           {
	               start=a[i];
	               count++;
	           }
	       }
	       System.out.println(count);
	       
	    }
	}
}
