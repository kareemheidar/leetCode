class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<board.length; i++){
            HashSet<Character> rowSet = new HashSet<>();
            for(int j=0; j<board[i].length; j++){
                if(rowSet.contains(board[i][j])) return false;
                if(board[i][j] != '.') rowSet.add(board[i][j]);
            }
        }

        for(int j=0; j<board[0].length; j++){
            HashSet<Character> columnSet = new HashSet<>();
            for(int i=0; i<board.length; i++){
                if(columnSet.contains(board[i][j])) return false;
                if(board[i][j] != '.') columnSet.add(board[i][j]);
            }
        }

        HashMap<Integer, HashSet<Character>> map = new HashMap<>();
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j] == '.') continue;
                int key;
                if (i<3 && j<3) key = 1;
                else if(i<3 && j<6) key = 2;
                else if(i<3 && j<9) key = 3;
                else if(i<6 && j<3) key = 4;
                else if(i<6 && j<6) key = 5;
                else if(i<6 && j<9) key = 6;
                else if(i<9 && j<3) key = 7;
                else if(i<9 && j<6) key = 8;
                else key = 9;

                if(!map.containsKey(key)){
                    map.put(key, new HashSet<>());
                    map.get(key).add(board[i][j]);
                } else if(map.get(key).contains(board[i][j]))
                    return false;
                else map.get(key).add(board[i][j]);
            }
        }
        return true;
    }
}