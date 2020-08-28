class Solution
{
    public List<Integer> spiralOrder(int[][] matrix)
    {
        if(matrix==null || matrix.length==0)
        {
            return new ArrayList(){};
        }
        int row=matrix.length;
        int col=matrix[0].length;
        int row1=0;
        int col1=0;
        List<Integer> list=new ArrayList<Integer>();
        
        while(row1<row && col1<col)
        {
            for(int i=col1;i<col;i++)
                list.add(matrix[row1][i]);
            for(int j=row1+1;j<row;j++)
                list.add(matrix[j][col-1]);
            
            //this if statement is useful when [1,2,3] is tcase;row=1,col=3
            //every time while going from bottom to top we decrease row, col length by 1 and check to make it spiral
            if(row1<row-1 && col1<col-1)
            {
                //starts at 8, only 8 is assessed here
            for(int i=col-2;i>col1;i--)
                list.add(matrix[row-1][i]);
                //starts at 7 and assess till 4
            for(int i=row-1;i>row1;i--)
                list.add(matrix[i][col1]);
            }
            col--;
            row--;
            col1++;
            row1++;
        }
        return list;
        
    }
}
