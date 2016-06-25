//
//  main.cpp
//  dp
//
//  Created by Kim. Dae-Hyun on 2016. 6. 25..
//
// X < Y 그리디의 왼쪽 상단 꼭직점에 로봇이 놓여 있다.
// 이 로봇은 오른쪽 아니면 아래쪽으로만 이동할 수 있다.
// 로봇이 (0,0) 에서 (X, Y)로 이동하는 데 있어 가능한 경로는 모두 몇 개가 있겠는가?


#include <iostream>

int map[101][101];
int go(int x, int y);
int main(int argc, const char * argv[]) {
    
    
    for (int i=1; i<=100; i++) {
        for (int j=1; j<=100; j++) {
            map[i][j] = 1;
        }
    }
    
    printf("%d \n", go(6, 6));

    return 0;
}

int go(int x, int y) {

    if (map[x][y] > 1) {
        return map[x][y];
    }
    
    if (x > 1  && y > 1) {
        map[x][y] = go(x-1, y) + go(x, y-1);
        return map[x][y];
    }
    
    if (x > 1 && y <= 1) {
        return 1;
    }
    
    if (x <= 1 && y > 1) {
        return 1;
    }
    
    return 1;
}