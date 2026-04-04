class Solution {
//     public String decodeCiphertext(String s, int r) {
//         if (r == 0) return "";

//         int n = s.length();
//         int c = n / r;

//         char[][] m = new char[r][c];
//         int k = 0;

//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 m[i][j] = s.charAt(k++);
//             }
//         }

//         StringBuilder sb = new StringBuilder();

//         for (int j = 0; j < c; j++) {
//             int i = 0, x = j;
//             while (i < r && x < c) {
//                 sb.append(m[i][x]);
//                 i++;
//                 x++;
//             }
//         }

//         int e = sb.length() - 1;
//         while (e >= 0 && sb.charAt(e) == ' ') e--;

//         return sb.substring(0, e + 1);
//     }
// }
   public String decodeCiphertext(String encodedText, int rows) {
        if (rows == 1) return encodedText;
        int encodedSize = encodedText.length();
        int columns = encodedSize/rows;
        char[][] matrix = new char[rows][columns];

        int c = 0;
        for (int i = 0; i < rows; i++) {
            if (c == encodedSize) break;
            for (int j = 0; j < columns; j++) {
                if (c == encodedSize) break;
                matrix[i][j] = encodedText.charAt(c);
                c++;
            }
        }

        StringBuilder originalText = new StringBuilder();
        
        int row = 0, column = 0;
        int columnCounter = 0;
        while (column < columns) {
            char character = matrix[row][column];
            if (character == '\0') break;
            originalText.append(character);
            row++;
            column++;
            if (row == rows) {
                row = 0;
                columnCounter++;
                column = columnCounter;
            };

        }
        int limit = originalText.length();
        for (int i = originalText.length() - 1; i >= 0; i--) {
            if (originalText.charAt(i) == ' ') {
                limit--;
            } else {
                break;
            }
        }
        originalText.setLength(limit);
        return originalText.toString();
    }
}