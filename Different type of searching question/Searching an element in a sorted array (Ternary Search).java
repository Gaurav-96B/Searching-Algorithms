static int ternarySearch(int arr[], int N, int K)
    {
        int start=0;
        int end=N-1;
        while(start<=end)
        {
            int mid1=start+(end-start)/3;
            int mid2=end-(end-start)/3;
            if(arr[mid1]==K)
            {
                return 1;
            }
            else if(arr[mid2]==K)
            {
                return 1;
            }
            else if(arr[mid1]>K)
            {
                end=mid1-1;
            }
            else if(arr[mid2]>K)
            {
               end=mid2-1; 
            }
            else if(arr[mid1]<K)
            {
               start=mid1+1; 
            }
            else
            {
                end=mid2-1;
            }
        }
        return -1;
    }
