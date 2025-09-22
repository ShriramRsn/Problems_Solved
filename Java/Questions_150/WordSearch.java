// You are using Java
import java.util.*;
public class WordSearch{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] arr = new char[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[i][j] = sc.next().charAt(0);
            }
        }
        String str = sc.next();
        System.out.println(exist(arr, str) ? 1 : 0);
    }
    
    public static boolean exist(char[][] arr, String word){
        int rows = arr.length;
        int cols = arr[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(arr[i][j] == word.charAt(0) && dfs(arr, word, i, j, 0, visited)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public static boolean dfs(char[][] arr, String str, int r, int c, int i, boolean[][] visited){
        if(i == str.length()){
            return true;
        }
        
        if(r < 0 || r >= arr.length || c < 0 || c >= arr[0].length || visited[r][c] || arr[r][c] != str.charAt(i)){
            return false;
        }
        
        visited[r][c] = true;
        
        if(dfs(arr, str, r + 1, c, i + 1, visited) ||
        dfs(arr, str, r - 1, c, i + 1, visited) ||
        dfs(arr, str, r, c + 1, i + 1, visited) ||
        dfs(arr, str, r, c - 1, i + 1, visited)){
            return true;
        }
        
        visited[r][c] = false;
        return false;
    }
}

// example1:
//         3 4
//         A B C E
//         S F C S
//         A D E E
//         SEE
//         1


// example2:
//         3 4
//         A B C E
//         S F C S
//         A D E E
//         ABCB
//         0