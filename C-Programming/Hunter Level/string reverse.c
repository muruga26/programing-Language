#include <stdio.h>
#include <string.h>

int main(void) {
	    char str1[20],*ptr;

    int size;

 

    printf("Enter a string to reverse: ");

    scanf("%s",&ptr);

    size = strlen(ptr);
    for(int i=size;i>=0;i--)
    {
    	printf("%c",*ptr[i]);
    }
    
	return 0;
}
