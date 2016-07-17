#include <stdio.h>

int findGapBetweenOnes(int N){
    int max_count=0;
    int cur_count=0;
    while(N && ((N&1)==0)) N>>=1;

    while(N){
        if(N&1){            
            if(cur_count>max_count){
                max_count=cur_count;
             }
             cur_count=0;
        }
        else{
            cur_count++;
        }
        N>>=1;
    }
    return max_count;
}

int main(){
    int N = 74901729; //100011101101110100011100001 => 4
    printf("find gap between ones for %d : %d\n", N, findGapBetweenOnes(N));

    return 0;
}
