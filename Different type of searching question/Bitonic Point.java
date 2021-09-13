int findMaximum(int[] a, int n) {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if((mid>0&&a[mid]>a[mid-1])&&(mid<n-1&&a[mid]>a[mid+1]))
            {
                return a[mid];
            }
            else if((mid>0&&a[mid]>a[mid-1])&&(mid<n-1&&a[mid]<a[mid+1]))
            {
                start=mid+1;
            }
            else
            {
              end=mid-1;  
            }
        }
        return a[n-1];
    }
