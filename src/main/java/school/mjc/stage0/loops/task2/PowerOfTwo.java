package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        if(power >= 0) {

            int number = 0;

            while(number <= power) {

                double powerOne = Math.pow(2, number);

                System.out.println((int)powerOne);

                number++;

            }

        } else {

            System.out.println("too much power");

        }

    }
}
