#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int matrix[6][6];
int adjList[6][6];

void findDis(int i,int j,int coin){
	int cpy,k,l,coldis,rowdis,sum;	
	//printf("\n%d %d %d",i,j,coin);
	cpy = coin;  //coin represents the coin number if it is found 1st then coin=1,if 2nd then coin=2 and so on..
	adjList[coin][cpy]=0; //since dis from itself is 0
	cpy=1;
	for(k=1;k<6;k++){ // for calculating each coin dis from the coin at index i,j
		for(l=1;l<6;l++){
			if(i==k&&j==l){  //if the index is same as coin index leave this iteration
				//printf("\ncontinue %d %d",k,l);
				cpy++;
				//printf("cpy %d",cpy);
				continue;
			}
			coldis = 0;
			rowdis = 0;
			if(matrix[k][l]==1){
				if((k-1==i&&l==j)||(k+1==i&&l==j)||(k==i&&l-1==j)||(k==i&&l+1==j)){
					//printf("\nadj %d %d",k,l);  //if there is another coin but it is adjacent to another coin so its dis is 0
					cpy++;
					//printf("cpy %d",cpy);
					adjList[coin][cpy]=0;		
				}	
				else{
					//printf("\ndis %d %d",k,l);  //this is the part where actual dis calc take place
					
					coldis = abs(j-l);  //dis between the col of 2 coins
					rowdis = abs(i-k);  //dis between the rows of 2 coins
					sum = coldis+rowdis;  //sum will give the actual distance between 2 coins
					//printf("sum coin cpy %d %d %d",sum,coin,cpy);
					adjList[coin][cpy]=sum;	  //paste this dis in that adjmat corresponding to the row of coin passed to this function..
					cpy++;                   // cpy refers to the which coin we are calc dis..
				}                            //print the line no 69 to 75 for better understanding of this adj matr creation
			}			
		}
	}
}
int main(){
	int i,j,coins=0,coinnum,sum,minsum=25,minrow,diff=0,diff1=0,flag=1,centrecoin=-1,c=0,colsum=0,rowsum=0,l=0,m=0,k=0,extra=0,exdiff; 
	int colw[6];
	int roww[6];
	char arr[5];
	for(i=1;i<6;i++){//input
		scanf("%s",arr);
		for(j=0;j<5;j++){
			if(arr[j]=='*'){
				matrix[i][j+1]=1;
				coins++;
			}
			else
				matrix[i][j+1]=0;
		}
	}
	coinnum=1;
	for(i=1;i<6;i++){
		for(j=1;j<6;j++)
			rowsum=rowsum+matrix[i][j];	
		roww[i]=rowsum;
		rowsum=0;
	}
	for(i=1;i<6;i++){
		for(j=1;j<6;j++)
			colsum=colsum+matrix[j][i];	
		colw[i]=colsum;
		colsum=0;
	}
	for(i=1;i<6;i++){    //this is for creating adjacency matrix(it contains distance value of each coins from that coins)if3coins->3*3 mat
		for(j=1;j<6;j++){   //.. findDis will create adjacency row for each coin 
			if(matrix[i][j]==1){
				findDis(i,j,coinnum);  //coinnum will pass 1..i.e., its first coin and so on..
				coinnum++;
			}
		}
	}
	/*printf("\n");
	for(i=1;i<=coins;i++){
		for(j=1;j<=coins;j++){
			printf("%d ",adjList[i][j]);    //print this to see adjmatrix
		}
		printf("\n");
	}*/
	for(i=1;i<=coins;i++){             //this will find the row of matrix having minimum overall distances of each coin from the coin
		for(j=1;j<=coins;j++)          // specified by ith number..if i==1->coin 1 has overall min distances of each coin
			sum=sum+adjList[i][j];
		if(sum!=0){                   //some row of adjmatrix contains only 0's we dont take that
			if(sum<minsum){
				minsum=sum;
				minrow=i;            //have that row in another var
			}
		}
		sum=0;
	}                          
	for(i=1;i<coins;i++){          //this is the case where if all coins are actually connected together
		if(adjList[i][i+1]!=0){    //if connected flag willbe 1 so it will go to else and print 0
			flag=0;
			break;
		}
	}
	if(flag==0){
		centrecoin=minrow;  
		 diff=0;              //below 2 for loop..consider this case 4 2 0 2 4->this is the minrow we got
		/*printf("centre %d\n",centrecoin);   //so first go to the 0 dis and travel backwards like 2 then 4..since for 2 dis we	
		for(i=1;i<6;i++)
			printf("%d",roww[i]);
		for(i=1;i<6;i++)
			printf("%d",colw[i]);*/
		extra=coins;
		if(extra%2==1)
			extra++;		
		for(i=1;i<6;i++){	
			if(roww[i]>=extra/2){
				for(k=i-1;k>0;k--){
					if(roww[k]!=0){
						exdiff = abs(k-i)-1;
						if(exdiff==0)
							exdiff=1;
						diff=diff+(roww[k]*exdiff)-c;
						c++;
					}
				}
				c=0;
				for(k=i+1;k<6;k++){
					exdiff = abs(k-i)-1;
					if(exdiff==0)
						exdiff=1;
					if(roww[k]!=0){
						diff=diff+(roww[k]*exdiff)-c;
						c++;
					}
				}
				printf("%d",diff);
				exit(0);			
			}
		}	
		c=0;
		diff=0;
		for(i=1;i<6;i++){
			if(colw[i]>=extra/2){
				for(k=i-1;k>0;k--){
					if(colw[k]!=0){
						exdiff = abs(k-i)-1;
						if(exdiff==0)
							exdiff=1;
						diff=diff+(colw[k]*exdiff)-c;
						c++;
					}
				}
				c=0;
				for(k=i+1;k<6;k++){
					if(colw[k]!=0){
						exdiff = abs(k-i)-1;
						if(exdiff==0)
							exdiff=1;
						diff=diff+(colw[k]*exdiff)-c;
						c++;
					}
				}
				printf("%d",diff);
				exit(0);			
			}
		}	
		for(i=centrecoin-1;i>0;i--){              //we require 1 move and for 4 we dont require 3 moves bcoz we can place it adjacent
			if(adjList[minrow][i]!=0){            // to the previously moved one so we require 2 moves only..
				diff1=abs(adjList[minrow][i]-1);  //for eg..    *....       in this case minrow is 3 rd row..like centre pos
				diff = diff + diff1;            //              .*...       so if we move coin in the 2nd row we require 1 move
				if(adjList[minrow][i+1]!=0)    //               ..*..       now 2nd and 3rd coin will be in same column *....
 					diff=diff-1;              //                ...*.                                                   ..*..
			}                                     //            ....*                                                   ..*..
		}                                    //                             now we dont rquire 1st coin to move 3 dis..instead we need only
		//printf("bef diff %d",diff);                                      // 2 moves to place it adjacent to 2nd coin
		for(i=centrecoin+1;i<6;i++){
			if(adjList[minrow][i]!=0){
				diff1=abs(adjList[minrow][i]-1);
				diff=diff+diff1;
				if(adjList[minrow][i-1]!=0)  //the 1st for loop traverse from the 0 to backwards and 2nd for loop will do opposite
					diff=diff-1;            // if(adjList[minrow][i-1]!=0) this will check if there is any coins moved prevously
			}                               //if yes we can move current coin adj to this coin..i.e.,reducing dis 1
		}
		if(centrecoin==1||centrecoin==5)
			diff=diff+1;
		printf("%d",diff);
	}
	else
		printf("0");
	return 0;
}
