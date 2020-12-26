class Solution
{
    ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer>a=new ArrayList<>();
        int x=0;
        int y=0;
        int z=0;
        while(x<n1&&y<n2&&z<n3)
        {
            if(A[x]==B[y]&&B[y]==C[z])
            {
                if(!a.contains(A[x]))
                {
               a.add(A[x]);
                }
               x++;
               y++;
               z++;
            }
            else if(A[x]>B[y])
            {
                y++;
            }
            else if(B[y]>C[z])
            {
               z++; 
            }
            else
            {
               x++; 
            }
        }
        return a;
    }
}
