class hammingDistance {
    public static int hammingDistance(int x, int y) {
        int res=x^y,count=0;
        while(res>0){
            if(res%2==1){
                count++;
            }
            res>>=1;
        }
        return count;
    }
	public static void main(String[]args){
		int x=93,y=73;
		System.out.print(hammingDistance(x,y));
	}
}