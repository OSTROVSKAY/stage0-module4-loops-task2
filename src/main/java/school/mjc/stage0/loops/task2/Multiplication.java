package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int result;

        if(multiplyByAndToInclusive != 0) {

            if(multiplyByAndToInclusive > 0) {

                int numberOne = 0;

                while(numberOne <= multiplyByAndToInclusive) {

                    result = numberOne * multiplyByAndToInclusive;

                    System.out.println(result);

                    numberOne++;

                }

            } else {

                    int numberTwo = 0;

                    int multiplyByAndToInclusiveOne = -multiplyByAndToInclusive;

                while( numberTwo <= multiplyByAndToInclusiveOne )  {

                    result = numberTwo * multiplyByAndToInclusive;

                    System.out.println(result);

                    numberTwo++;

                }

            }

        } else {

            System.out.print("");

        }

    }
}
