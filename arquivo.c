#include <stdio.h>

int main(){
	int n = 0;
	scanf("%d", &n);

	int count = 0;
	FILE *arq = fopen("nums.txt", "wt");
	while(count < n){
                float num;
		scanf("%f", &num);
		count++;
		fprintf(arq, "%f\n", num); 
	}
	fclose(arq);

        fopen("nums.txt", "rt");
	fseek(arq, 0, SEEK_END);
	int indicator = ftell(arq)-2;
	fseek(arq, indicator, SEEK_SET);
	for(int i = 0; i < n; i++){
		float num;
		while(fgetc(arq) != '\n' && indicator >=0){
		fseek(arq, --indicator, SEEK_SET);
		}
		fseek(arq, indicator+1, SEEK_SET);
		fscanf(arq, "%f", &num);
		printf("%g\n", num);
		fseek(arq, --indicator, SEEK_SET);
		count++;
		
	}
	fclose(arq);
}
