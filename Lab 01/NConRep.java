public class NConRep {

    public static void main(String[] args) {

        int[][] array = { { 1, 2, 3, 4 }, { 6, 7, 8, 9 },
                { 1, 8, 1, 1 },
                { 6, 7, 8, 9 } };

        int n = 4;
        boolean results = checked(n, array);
        System.out.println(results);
        if (results)
            System.out.println("Consective founds");

        else {
            System.out.println("Not Found");
        }

        
    }

    static boolean checked(int no, int[][] arr) {

        int count = 0;
        int row = arr.length;
        int col = arr[0].length;
        int[] save = new int[arr.length];
        int number = 0;
        for (int i = 0; i < row; i++) {
            count = 0;
            number = arr[i][0];
            for (int j = 0; j < col; j++) {

                save[j] = arr[i][j];
                System.out.println(save[j] + "saved array");
                if (number == save[j]) {
                    count++;

                }

            }
            // if (count == 4)
            if (count == no || count == arr[0].length)
                return true;

        }
        return false;
    }

}