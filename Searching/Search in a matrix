import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		int n,m,i,j,k,x;
		while(T-->0)
		{
		    n=sc.nextInt();
		    m=sc.nextInt();
		    int a[][]=new int[n][m];
		    for(i=0;i<n;i++)
		    {
		        for(j=0;j<m;j++)
		        {
		            a[i][j]=sc.nextInt();
		        }
		    }
		    k=0;
		    x=sc.nextInt();
		    i=n-1;j=0;
		    while(i>=0&&j<m)
		    {
		        if(a[i][j]==x)
		        {
		            k=1;
		            break;
		        }
		        else if(a[i][j]<x)
		        {
		            j++;
		        }
		        else if(a[i][j]>x)
		        {
		            i--;
		        }
		    }
		    System.out.println(k);
		}
	}
}
