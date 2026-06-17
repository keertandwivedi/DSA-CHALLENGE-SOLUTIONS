import java.util.*;

public class Main {

    public static void setMatrixZero(int[][] matrix){
        int m = matrix.length;
        int n = matrix[0].length;

        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for(int r : row){
            for(int j = 0; j < n; j++){
                matrix[r][j] = 0;
            }
        }

        for(int c : col){
            for(int i = 0; i < m; i++){
                matrix[i][c] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};

        setMatrixZero(matrix);

        int m = matrix.length;
        int n = matrix[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}