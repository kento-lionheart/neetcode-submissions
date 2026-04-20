class Solution {
    public boolean isValidSudoku(char[][] board) {
        return check1(board)&&check2(board)&&check3(board);
    }
    static int[] dx8 = {-1, -1, -1, 0, 0, 1, 1, 1, 0};  // 8-way (including diagonals)
    static int[] dy8 = {-1, 0, 1, -1, 1, -1, 0, 1, 0};
    public boolean check1(char[][] board){
        for(int i = 0; i < board.length; ++i){
            int[] checkMate = new int[10];
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != '.'){
                    if(checkMate[board[i][j] - '0'] == 0){
                        checkMate[board[i][j] - '0']++;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean check2(char[][] board){
        for(int i = 0; i < board[0].length; i++){
            int[] checkMate = new int[10];
            for(int j = 0; j < board.length; j++){
                if(board[j][i] != '.'){
                    if(checkMate[board[j][i] - '0'] == 0){
                        checkMate[board[j][i] - '0']++;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean check3(char[][] board) {
        for(int boxRow = 0; boxRow < 9; boxRow += 3) {
            for(int boxCol = 0; boxCol < 9; boxCol += 3) {
                int[] checkMate = new int[10];
                for(int i = boxRow; i < boxRow + 3; i++) {
                    for(int j = boxCol; j < boxCol + 3; j++) {
                        if(board[i][j] != '.') {
                            int num = board[i][j] - '0';
                            if(num < 1 || num > 9 || checkMate[num]++ > 0) {
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
