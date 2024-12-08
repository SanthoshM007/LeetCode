class Solution {
    public int numRookCaptures(char[][] board) {
        int a=0,b=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='R') {a=i;b=j;break;}
            }
        }
        int i=a,j=b,k=a,l=b,m=a,n=b,o=a,p=b;
     
        int c=0;
        while(j>=0||l<8||m>=0||o<8){
            if(j>=0&&board[i][j]=='p') {c+=1;j=-1;}
            else if(j>=0&&board[i][j]=='B') j=-1;

            if(l<8&&board[k][l]=='p') {c+=1;l=9;}
            else if(l<8&&board[k][l]=='B') l=9;

            if(m>=0&&board[m][n]=='p') {c+=1;m=-1;}
            else if(m>=0&&board[m][n]=='B') m=-1;

            if(o<8&&board[o][p]=='p') {c+=1;o=9;}
            else if(o<8&&board[o][p]=='B') o=9;

            j-=1;
            l+=1;
            m-=1;
            o+=1;
            
        }

        return c;
    }
}
