package DsaInJava.Searching_Algorithms.BinarySearching;

import java.util.Arrays;

public class Sorted_MatrixBS {

    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.toString(search(arr,7)));
    }

    // Binary search in a specific row
    static int[] binarySearch(int[][] matrix, int row, int cstart, int cEnd, int target){
        while (cstart <= cEnd){
            int mid = cstart + (cEnd - cstart) / 2;

            if(matrix[row][mid] == target){
                return new int[]{row, mid};
            }

            if(matrix[row][mid] < target){
                cstart = mid + 1;
            }
            else{
                cEnd = mid - 1;
            }
        }
        return new int[]{-1,-1};
    }

    static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int col = matrix[0].length;

        if(rows == 1){
            return binarySearch(matrix, 0, 0, col - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = col / 2;

        // reduce rows
        while (rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid, cMid};
            }

            if(matrix[mid][cMid] < target){
                rStart = mid;
            }
            else{
                rEnd = mid;
            }
        }

        // check middle column of remaining rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }

        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1, cMid};
        }

        // search 1st half
        if(target <= matrix[rStart][cMid - 1]){
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }

        // search 2nd half
        if(target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][col - 1]){
            return binarySearch(matrix, rStart, cMid + 1, col - 1, target);
        }

        // search 3rd half
        if(target <= matrix[rStart + 1][cMid - 1]){
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }

        // search 4th half
        return binarySearch(matrix, rStart + 1, cMid + 1, col - 1, target);
    }
}