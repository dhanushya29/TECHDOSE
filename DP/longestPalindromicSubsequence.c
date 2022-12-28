#include<string.h>
#include<math.h>
#include<stdlib.h>
int longestPalindromeSubseq(char * s){
    int m=strlen(s);
    char *str2;
    str2=(char*)malloc(1000*sizeof(char));
    int i=0,temp=m;
    while(i<m){
        str2[i++]=s[--temp];
    }
   // str2=strrev(s);
    int lcs[m+1][m+1];
    for(int i=0;i<=m;i++){
        for(int j=0;j<=m;j++){
            if(i==0 || j==0)lcs[i][j]=0;
            else if(s[i-1]==str2[j-1])lcs[i][j]=1+lcs[i-1][j-1];
            else lcs[i][j]=fmax(lcs[i-1][j],lcs[i][j-1]);
        }
    }
    return lcs[m][m];
}