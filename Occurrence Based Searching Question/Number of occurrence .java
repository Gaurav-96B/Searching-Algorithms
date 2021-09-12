int count(int[] a, int n, int x) 
    {
        int firstIndex=lb(a,n,x);
        int lastIndex=ub(a,n,x);
        if(firstIndex==-1&&lastIndex==-1)
        {
            return 0;
        }
        return lastIndex-firstIndex+1;
    }
    public int lb(int arr[],int n,int x)
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
    public int ub(int arr[],int n,int x)
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
