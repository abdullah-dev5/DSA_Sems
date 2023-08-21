public class ImageCropping {

    public static void main(String[] args) {

        int[][] array = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 },
                { 1, 1, 1, 1 },
                { 6, 7, 8, 9 } };

        extractBoundaries(array);
        System.out.println("Cropping");
        cropCenter(array);

    }

    static void extractBoundaries(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        System.out.println("First Row: ");
        for (int i = 0; i < col; i++) {
            System.out.print(arr[0][i] + " ");
        }

        System.out.println("First Column: ");
        for (int i = 0; i < row; i++) {
            System.out.print(arr[i][0] + " ");
        }

        System.out.println("Last Row: ");
        for (int i = 0; i < col; i++) {
            System.out.print(arr[row - 1][i] + " ");
        }

        System.out.println("last Column: ");
        for (int i = 0; i < row; i++) {
            System.out.print(arr[i][row - 1] + " ");
        }
            System.out.println();
    }

    static void cropCenter(int arr[][]) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 1; i < row - 1; i++) {
            for (int j = 1; j < col - 1; j++) {
                System.out.print(arr[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println();
    }

}