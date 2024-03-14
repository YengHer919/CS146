//Yeng Her
//3.13.24

public class HW11 {

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        if (oldColor == newColor) {
            return image;
        }
        fill(image, sr, sc, oldColor, newColor);
        return image;
    }

    private static void fill(int[][] image, int sr, int sc, int oldColor, int newColor) {
        if (sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != oldColor) {
            return;
        }
        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, oldColor, newColor); 
        fill(image, sr + 1, sc, oldColor, newColor);  
        fill(image, sr, sc - 1, oldColor, newColor);  
        fill(image, sr, sc + 1, oldColor, newColor);  
    }

    public static void main(String[] args) {
        
        int[][] image = {
            {1, 1, 1},
            {1, 1, 0},
            {1, 0, 1}
        };
        int sr = 1;
        int sc = 1;
        int color = 2;

        image = floodFill(image, sr, sc, color);

        // Print modified image
        for (int[] row : image) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println();
        }
    }
}
