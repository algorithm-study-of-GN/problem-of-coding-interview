//
//  main.cpp
//  dp
//
//  Created by Kim. Dae-Hyun on 2016. 6. 25..
//
// n개의계단을아이가오른다. 한번에1계단오르기도하고, 2계단이나 3단계씩오르기도한다.
// 계단을 오르는데 몇 가지 방법이 있는지 계산하는메서드를구현하라.

#include <iostream>


int countWays(int n);
int countWaysDP(int n, int map[]);

int main(int argc, const char * argv[]) {
    
    printf("%d \n", countWays(10));

    int map[100] = {0};
    printf("%d \n", countWaysDP(10, map));
    return 0;
}


int countWays(int n) {
    
    if (n < 0) {
        return 0;
    } else if (n == 0) {
        return 1;
    } else {
        return countWays(n - 1) + countWays(n - 2) + countWays(n - 3);
    }
}

int countWaysDP(int n, int map[]) {

    if (n < 0) {
        return 0;
    } else if (n == 0) {
        return  1;
    } else if (map[n] > 0) {
        return map[n];
    } else {
        map[n] = countWaysDP(n - 1, map) + countWaysDP(n - 2, map) + countWaysDP(n - 3, map);
        return map[n];
    }
}