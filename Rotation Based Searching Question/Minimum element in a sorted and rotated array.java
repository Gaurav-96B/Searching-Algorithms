int findMin(int arr[], int n)
    {
        int start=0;
        int end=n-1;
        if(arr[start]<arr[end])
        {
            return arr[start];
        }
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(mid<n-1&&arr[mid]>arr[mid+1])
            {
                return arr[mid+1];
            }
            else if(mid>0&&arr[mid-1]>arr[mid])
            {
               return arr[mid];
            }
            else if(arr[start]<=arr[mid])
            {
                start=mid+1;
            }
            else if(arr[mid]<=arr[end])
            {
                end=mid-1;
            }
        }
        return 0;
    }
