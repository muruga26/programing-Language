#include <stdio.h>

int main(void) {
	int a,sum=0;
	scanf("%d %d",&a);
	while(a>0)
	{
              a=a/10;
              sum++;
	}
	
	return 0;
}
