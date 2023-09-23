public class Task4 {

    public static void main(String[] args) {

        int[] arr = { 1, 5, 7, 8, 3, 11, 9, 232, 12, 56, 4, 23 };
        int search = 9;

        long startRec = System.nanoTime();
        int results = recurrsiveSearch(arr, search, 0);
        long endRec = System.nanoTime();
        long totalRec = endRec - startRec;

        long startiterate = System.nanoTime();
        int result = search(arr, search);
        long enditerate = System.nanoTime();
        long totalIterate = enditerate - startiterate;
        System.out.println(totalRec);
        System.out.println(totalIterate);
        if (totalRec < totalIterate) {
            System.out.println("Recurrsion take less time");
        } else {
            System.out.println("iterative take less time");
        }

        System.out.println(result);
        System.out.println(results);

        if (result == 1 && results == 1) {
            System.out.println("Number is  found :");
        } else {
            System.out.println("not found ");
        }

    }

    static int search(int[] arr, int target) {
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return 1;

            }

        }

        return 0;
    }

    static int recurrsiveSearch(int[] arr, int target, int index) {
        int count = index;
        if (count == (arr.length - 1)) {
            return 0;
        }

        if (target == arr[count]) {

            return 1;
        }
        return recurrsiveSearch(arr, target, ++count);
    }

}
