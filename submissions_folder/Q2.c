#include <stdio.h>

int main(){
	int value;
	int odd_sum = 0, odd_count = 0;
	int even_product = 1;
	int total_count = 0;

	while(1){
		printf("\n Please enter a number (negative number to exit): ");
		scanf("%d", &value);

		if(value<0) break;

		if(value%2 == 0){
			even_product *= value;
		}
		else{
			odd_sum += value;
			odd_count++;
		}
		total_count++;
	}
	float avg = (float) odd_sum / odd_count;
	printf("\n odd_sum: %d , odd_count: %d", odd_sum, odd_count);
	printf("\n The average of odd numbers: %.2f", avg);
	printf("\n The product of even numbers: %d", even_product);
	printf("\n In total, you entered %d numbers.", total_count);
}

