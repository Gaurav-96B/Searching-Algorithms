public int findExtra(int a[], int b[], int n) {
        int start=0;
        int end=b.length-1;
        int extraElement=a.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(a[mid]!=b[mid])
            {
               extraElement=mid;
               end=mid-1;
            }
            else if(a[mid]==b[mid])
            {
                start=mid+1;
            }
            
        }
        return extraElement;
        
    }
