//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

class SetZeroMatrix {
    public void setZeroes(int[][] matrix) {

        boolean setColumn = false;
        boolean setRow = false;

        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (matrix[r][c] == 0) {
                    matrix[r][0] = 0;
                    matrix[0][c] = 0;

                    if (r == 0) {
                        setRow = true;
                    }
                    if (c == 0) {
                        setColumn = true;
                    }
                }
            }
        }

        for (int r = 1; r < matrix.length; r++) {
            if (matrix[r][0] == 0) {
                for (int c = 1; c < matrix[0].length; c++) {
                    matrix[r][c] = 0;
                }
            }
        }

        for (int c = 1; c < matrix[0].length; c++) {
            if (matrix[0][c] == 0) {
                for (int r = 1; r < matrix.length; r++) {
                    matrix[r][c] = 0;
                }
            }
        }

        if (setRow) {
            for (int c = 0; c < matrix[0].length; c++) {
                matrix[0][c] = 0;
            }
        }

        if (setColumn) {
            for (int r = 0; r < matrix.length; r++) {
                matrix[r][0] = 0;
            }
        }
    }
}