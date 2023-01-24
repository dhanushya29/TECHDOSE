class Solution {
    public int[] decode(int[] encoded) {
        int n=encoded.length+1;
        int[]res=new int[n];
        int e1=0;
        for(int i=1;i<=n;i++){
            e1^=i;
        }
        for(int i=0;i<n-1;i+=2){
            e1^=encoded[i];
        }
        System.out.println(e1);
        res[n-1]=e1;
        for(int i=n-2;i>=0;i--){
            res[i]=res[i+1]^encoded[i];
        }
        return res;
    }
}
