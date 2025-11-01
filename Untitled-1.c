#include <stdio.h>
int main()
{
    int num, sum = 0, n, remainder;
    printf("Enter any number:");
    scanf("%d", &num);
    n = num;

    while (n != 0)
    {
        remainder = n % 10;
        sum = sum + remainder;
        n = n / 10;
    }
    printf("The sum of: %d ", sum);
}