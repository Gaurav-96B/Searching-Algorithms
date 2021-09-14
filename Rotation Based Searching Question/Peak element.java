public int peakElement(int[] arr,int n)
    {
      int start=0;
        int end=n-1;
        int found=0;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if((mid==0||arr[mid]>arr[mid-1])&&(mid==n-1||arr[mid]>arr[mid+1]))
            {
               found=mid;
               break;
            }
            else if((mid==0||arr[mid]>arr[mid-1])&&(mid==n-1||arr[mid]<arr[mid+1]))
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        if(found!=0)
        {
            return found;
        }
        return 0;
    }
