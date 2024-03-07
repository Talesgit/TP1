#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <string.h>
#include <stdbool.h>

bool mStrcmp(char word1[], char word2[]){
		bool resp = true;
		if(strlen(word1) != strlen(word2)){
			resp = false;
		}else{
			for(int i = 0 ; i < strlen(word1); i++){
				if(word1[i] != word2[i]){
					resp = false;
	      				i = strlen(word1);
				}
			}
		}
		return resp;
	}

bool isPalindrome(char word[]){
	bool resp = true;
	for(int i = 0, k = strlen(word) - 1; i < strlen(word)/2; i++, k--){
	        printf("%c\n %c\n", word[i], word[k]);
		if(word[i] == -61 || word[i] == 126){
			word[i] = word[i+1];
		}

		if(word[i] == -31){
			word[i] = word[i+2];
		}
		if(word[i] != word[k]){
			resp = false;
		}
	}
		return resp;
	}

int main(){
	char *word = (char*)malloc(200 * sizeof(char));
	do{
		scanf("%[^\n]", word);
		getchar();
		
		if(strcmp(word, "FIM") != 0){
			if(isPalindrome(word)){
			printf("SIM\n");
		}else{
			printf("NAO\n");
		}
		}
         }while(strcmp(word, "FIM") != 0);
}
