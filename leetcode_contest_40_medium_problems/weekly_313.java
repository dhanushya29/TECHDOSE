public class weekly_313 {
    // class Solution {
        public int minimizeXor(int num1, int num2) {
            int c1=count(num1),c2=count(num2);
            int x=num1;
            while(c1!=c2){
                if(c1<c2){
                    x=setBit(x);c1++;
                }else{
                    x=unSetBit(x);c1--;
                }
            }
            return x;
        }
        public int count(int a){
            int res=0;
            while(a!=0){
                res++;
                a=a&(a-1);
            }
            return res;
        }
        public int setBit(int a){
            int bit=0;
            while(bit<=31){
                if(((1<<bit)&a)==0){
                    return a|(1<<bit);
                }
                bit++;
            }
            return a;
        }
        public int unSetBit(int a){
            int bit=0;
            while(bit<=31){
                if(((1<<bit)&a)!=0){
                    return a&(~(1<<bit));
                }
                bit++;
            }
            return a;
        }
    // }
}
