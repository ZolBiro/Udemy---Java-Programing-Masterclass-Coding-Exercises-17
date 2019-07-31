public class EvenDigitSum {

    public static int getEvenDigitSum (int number){

        if (number <0){
            return -1;
        }

        int digits =0;
        int evenDigitSum = 0;

        while (number >0){

            digits = number % 10;

            if ((digits %2) == 0) {
                evenDigitSum += digits;
            }

            number /= 10;
        }

        return evenDigitSum;
    }
}
