public class Task1 {

    public static void main(String[] args) {

        long startRec = System.nanoTime();
        System.out.println(factorialRec(5));
        long endRec = System.nanoTime();
        
        long totalRec = endRec - startRec;
        long startiterate = System.nanoTime();
        System.out.println(factorial(5));
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

    public static int factorialRec(int fact) {
        // base conditions
        if (fact <= 1) {
            return 1;
        }

        return fact * factorialRec(fact - 1);

    }

    public static long factorial(int number) {
        long fact = 1;

        for (long i = 1; i <= number; i++) {
            fact *= i;
        }

        return fact;
    }

}