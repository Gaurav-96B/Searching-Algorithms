class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
class Solution {
    
    public pair indexes(long v[], long x)
    {
        int n=v.length;
        pair p=new pair(-1,-1);
        long firstIndex=lb(v,n,x);
        long lastIndex=ub(v,n,x);
        p=new pair(firstIndex,lastIndex);
        return p;
    }
    public long lb(long arr[],int n,long x)
    {
        int start=0;
        int end=n-1;
        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            {
               index=mid;
               end=mid-1;
            }
            else if(x>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return index;
    }
    public long ub(long arr[],int n,long x)
    {
        int start=0;
        int end=n-1;
        int index=-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(arr[mid]==x)
            {
               index=mid;
               start=mid+1;
            }
            else if(x>arr[mid])
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return index;
    }

}
