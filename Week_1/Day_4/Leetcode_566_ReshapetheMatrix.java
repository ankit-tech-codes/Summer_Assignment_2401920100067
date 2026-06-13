class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;
        if(m*n!=r*c) return mat;
        int[][] newmat=new int[r][c];
        int temp=c;
        r=0;
        c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                newmat[r][c]=mat[i][j];
                c++;
                if(c==temp){
                    c=0;
                    r++;
                }


            }
        }
        return newmat;
        
    }
}
