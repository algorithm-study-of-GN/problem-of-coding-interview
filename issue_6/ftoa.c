/* 2016.06.13 Eunice */

#include <stdio.h>
#include <stdlib.h>
#include <math.h>

#define PRECESION 5

void ftoa(char* result, float value);

int main() {

    char result[50];
    float value;

    printf("Enter float:");
    scanf("%f", &value);
    ftoa(result, value);
    printf("Convert:%s\n", result);
    return 0;
}

void ftoa(char* result, float value) {

    int intpart, temp;
    float fraction;
    int i, n, cur;
    char* pos = result;

    if (value < 0) {
        *pos = '-';
        pos++;
        value *= -1;
    }

    intpart = (int)value;
    n = (int)log10(intpart)+1;

    for (i = 0; i<n; i++) {             
        *pos = '0' + (int)(intpart / pow(10, n-i-1)) % 10;
        pos++;
    }

    *pos = '.';
    pos++;
    fraction = value - intpart;
    for (i = 1; i <= PRECESION; i++) {
        *pos = '0' + (int)(fraction*pow(10,i)) %10;
        pos++;
    }

    //last digit should be rounded up
    //*pos = '0' + round(fraction * pow(10,i));;
    //pos++;

    *pos = '\0';

}
