import java.util.*;

public class Main {

    public static void roateNinety(int[][] matrix) {
        //transpose
        for(int i=0 ;i<matrix.length ; i++){
            for(int j=i+1; j<matrix[i].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp ;
            }
        }
        //reverse each row
        for(int i=0;i<matrix.length ; i++){
            int l = 0 ;
            int r = matrix[i].length-1 ;
            while(l<r){
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp ;
                l++;
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        roateNinety(matrix);
        for(int i=0 ;i<matrix.length ; i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}