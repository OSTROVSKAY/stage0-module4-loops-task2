package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        if(printToInclusive >= 2 ) {

            int number = 2;

            int count = 1;

            int check = 0;

            while( number <= printToInclusive ) {

                count = 1;

                check = 0;

                int numberPrime = number;

                while( count <= numberPrime ) {


                    if (numberPrime % count == 0) {

                        check++;

                    }

                    count++;

                }

                if(check == 2) {

                    System.out.println(numberPrime);

                }

                number++;

            }

        } else {

            System.out.print("");

        }

    }
}
