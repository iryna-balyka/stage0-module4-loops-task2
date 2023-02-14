package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0) {
            System.out.println("too much power");
        } else {
            int i = 0;
            int res = 1;
            while (i <= power) {
                if (i == 0) {
                    res = 1;
                } else res = res * 2;
                i++;
                System.out.println(res);
            }
        }
    }
}
