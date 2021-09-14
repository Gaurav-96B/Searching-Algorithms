static int findFloor(long arr[], int n, long x)
    {
       int start=0;
       int end=n-1;
       int floorValue=-1;
       while(start<=end)
       {
           int mid=start+(end-start)/2;
           if(arr[mid]==x)
           {
               return mid;
           }
           else if(arr[mid]<x)
           {
             floorValue=mid;
             start=mid+1;
           }
           else if(arr[mid]>x)
           {
               end=mid-1;
           }
       }
       return floorValue;
        
    }
