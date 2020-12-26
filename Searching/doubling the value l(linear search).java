import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    long b = sc.nextInt();
		    long a[] = new long[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i] = sc.nextLong();
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(a[i]==b)
		            b = b * 2;
		    }
		    System.out.println(b);
		}
	}
}
