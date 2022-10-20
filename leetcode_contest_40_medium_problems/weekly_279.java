import java.util.Arrays;

public class weekly_279 {
    // class Solution {
        public long smallestNumber(long num) {
            if(num==0)return 0;
            boolean isNegative=num<0;
            num =num<0?num*-1 : num;
            String str;
            char[]ch=String.valueOf(num).toCharArray();
            Arrays.sort(ch);
                    // System.out.print(Arrays.toString(ch));
            if(!isNegative){
                int non=0;
                for(;non<ch.length;non++){
                    if(ch[non]!='0'){
                        break;
                    }
                }
                // System.out.println(ch[0]+" "+non);
                char temp=ch[0];
                ch[0]=ch[non];
                ch[non]=temp;
                str=new String(ch);
            }
            else{
                str=new String(ch);
                StringBuilder sb=new StringBuilder(str);
                str="-".concat(sb.reverse().toString());
            }
            return Long.valueOf(str);
        }
    // }
}
