package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int number = 0;

        while( number <= printToInclusive ) {

            System.out.println(factorial(number));

            number++;

        }

    }

    public static int factorial(int i)
        {
            if (i==0) {

                return 1;

            }  else {

                return i*factorial(i-1);

             }
        }

}


