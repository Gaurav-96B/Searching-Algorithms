class GfG
{
	int bin_search(int A[], int left, int right,  int k)
	{
	    int index=-1;
	  while(left<=right)  
	  {
	      int mid=left+(right-left)/2;
	      if(A[mid]==k)
	      {
	          index=mid;
	          break;
	      }
	      else if(A[mid]>k)
	      {
	         right=mid-1; 
	      }
	      else
	      {
	          left=mid+1;
	      }
	  }
	  return index;
	}
}


