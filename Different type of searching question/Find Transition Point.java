int transitionPoint(int a[], int n) {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if((mid>0&&a[mid-1]<a[mid])||(mid==0&&a[mid]==1))
            {
                return mid;
            }
            else if(a[mid]==0)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
    }
