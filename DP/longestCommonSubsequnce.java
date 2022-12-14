public class longestCommonSubsequnce {
    public static int max(int a,int b){
        return a>b?a:b;
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int [][] lcs=new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)lcs[i][j]=0;
                else if(text1.charAt(i-1)==text2.charAt(j-1)){
                    lcs[i][j]=1+lcs[i-1][j-1];
                }
                else{
                    lcs[i][j]=max(lcs[i-1][j],lcs[i][j-1]);
                }
            }
        }
        return lcs[m][n];
    }
}