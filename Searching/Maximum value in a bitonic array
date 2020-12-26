import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    static int maxElement(int a[],int left,int right)
    {
        if(left==right)
        {
            return a[left];
        }
        if((left==right+1)&&a[left]>a[right])
        {
           return a[left];
        }
        if((left==right+1)&&a[left]<a[right])
        {
            return a[right];
        }
        int mid=left+(right-left)/2;
        if(a[mid]>a[mid+1]&&a[mid]>a[mid-1])
        {
            return a[mid];
        }
        else if(a[mid]>a[mid+1]&&a[mid]<a[mid-1])
        {
            return maxElement(a,left,right-1);
        }
        else
        {
           return maxElement(a,left+1,right);
        }
    }
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
	        System.out.println(maxElement(a,0,n-1));
	    }
	}
}
