package y_2023.m3.week2.d5;

public class Offer12 {

    int[][] direction = {{-1,0},{0,-1},{1,0},{0,1}};
    int row, col;
    boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        if(board == null || word == null){
            return false;
        }
        row = board.length;
        col = board[0].length;
        visited = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(searchWord(board, word,0, i, j))
                    return true;
            }
        }
        return false;
    }

    public boolean inArea(int x, int y){
        return x >= 0 && x < row && y >= 0 && y < col;
    }

    public boolean searchWord(char[][] board, String word, int index, int startx, int starty){
        if(!inArea(startx, starty))
            return false;
        if(index == word.length() - 1)
            return board[startx][starty] == word.charAt(index);
        if(board[startx][starty] == word.charAt(index)){
            visited[startx][starty] = true;
            for(int i = 0; i < 4; i++){
                int newx = startx + direction[i][0];
                int newy = starty + direction[i][1];
                if(inArea(newx, newy) && !visited[newx][newy] && searchWord(board,word, index + 1, newx,newy))
                    return true;
            }
        }
        return false;
    }

}
