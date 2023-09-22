public class Task2 {
    public static void main(String[] args) {
        long startRec = System.nanoTime();
        System.out.println(fibonacciRec(10));
        long endRec = System.nanoTime();
        
        long totalRec = endRec - startRec;
        long startiterate = System.nanoTime();
       
        System.out.println(fibonacci(10));
        long enditerate = System.nanoTime();
        long totalIterate = enditerate-startiterate;
        System.out.println(totalRec);
        System.out.println(totalIterate);
        if(totalRec<totalIterate)
        {
            System.out.println("Recurrsion take less time");
        }
        else{
            System.out.println("iterative take less time");
        }

    }

    public static long fibonacciRec(int n) {
       

        if (n <= 1) {
            return n;
        }

        return fibonacciRec(n - 1) + fibonacciRec(n - 2);
    }




    public static long fibonacci(int nthTerm) {
        int p = 0;
        int q = 1;
        if (nthTerm < 0) {
            System.out.println("invalid input");

        }
        if (nthTerm == 1) {
            return 0;
        }
        if (nthTerm <= 3) {
            return 1;
        }

        int count = 2;// we start with 2 as we know that the first two numbers are 0 and 1
        while (count <= nthTerm) {
            // by swapping values
            int temp = q;
            q = q + p;
            p = temp;
            count++;
         
        }
            return q;
    }
}
