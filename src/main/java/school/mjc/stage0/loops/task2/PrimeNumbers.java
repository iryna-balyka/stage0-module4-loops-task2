package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i <= printToInclusive) {
            if (i == 2) {
                System.out.println(i);
            }
            if (i >2){
                int j = 2;
                while (j < i) {
                    if (i % j == 0) { //j=2 выход
                        break;
                    } else j++;
                }
                if ((j > 2)&&(j == i)) {
                    System.out.println(i);
                }

            }
            i++;
        }
    }
}