package y_2023.m5.week1.d6;

public class Offer12 {

    public boolean exist(char[][] board, String word) {
        if(board == null || board.length == 0) return false;
        if(word == null || word.length() == 0) return false;

        int row = board.length, col = board[0].length;
        char[] cWord = word.toCharArray();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(dfs(board, cWord, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int idx){
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word[idx])
            return false;
        if(idx == word.length-1)
            return true;
        char temp = board[i][j]; // 回溯时候用
        board[i][j] = '-'; // 标记已访问

        // 继续搜索后续字符
        boolean res = dfs(board, word, i - 1, j, idx + 1) ||
                dfs(board, word, i + 1, j, idx + 1) ||
                dfs(board, word, i, j - 1, idx + 1) ||
                dfs(board, word, i, j + 1, idx + 1);
        board[i][j] = temp;  // 回溯，修改回来，表示未访问
        return res;
    }

}
