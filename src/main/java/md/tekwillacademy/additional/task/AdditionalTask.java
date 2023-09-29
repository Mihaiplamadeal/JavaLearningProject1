package md.tekwillacademy.additional.task;

public class AdditionalTask {
    public static void main(String[] args) {
        int min = 1;
        int max = 1000;
        int annastere = 10;

//        for (int i  = min; i <= max; i++) {
//            if (i % 5 == 0 || i % 3 == 0) {
//                System.out.println(i);
//            }
//
//        }
//        int sum = 0;
//
//        for (int i = min; i <= annastere; i++) {
//
//
//                if (i % 2 == 0) {
//                    sum = sum + i;
//                    System.out.println(sum);
//                }

//            System.out.println("Iteratia: " + i + "  Valoarea sumei este  " + sum);
//        }
//        System.out.println(sum);

        int x = 1;
        int y = 100;
        int sum = 0;
        int result = x;


        for (int i = x; i < y; i++){
            if(i % 11 == 0 || i % 9 == 0){
                result *=i;
                System.out.println(result);
            }
        }
    }
}



