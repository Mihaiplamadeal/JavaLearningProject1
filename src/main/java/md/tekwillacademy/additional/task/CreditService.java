package md.tekwillacademy.additional.task;

public class CreditService {
    public static void main(String[] args) {
        int sum = 20000;
        double rate1 = 0.03;
        double rate2 = 0.045;
        double rate3 = 0.05;
        double result = 0;


        if ((sum > 0) && (sum < 20000)) {
            result = sum * (1 + rate3);
        } else if (sum < 40000) {
            result = sum * (1 + rate2);
        } else {
            result = sum * (1 + rate1);

        }

        System.out.println("Suma de plata este  " + result);

    }

}

