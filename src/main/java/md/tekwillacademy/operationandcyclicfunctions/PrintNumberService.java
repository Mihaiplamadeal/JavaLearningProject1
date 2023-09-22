package md.tekwillacademy.operationandcyclicfunctions;

public class PrintNumberService {
    public static void main(String[] args) {
        int min = 3;
        int max = 1009;

        //Obtinere de numere pare, Number % 2 == 0

        for(int i = min; i <= max; i++){
            if (i % 2 == 0){
                System.out.println(i);

            }
        }
        //Number % 2 !0 (diferit de zero) or Number % 2 ==1 pentru numere impare

        int i =min;
        while (i < max){
            if (i % 2 ==1){
                System.out.println(i);
            }

          //Toate 3 variante de mai jos semnifica acelasi lucru, doar scris in diferite modalitati
//            i++;
//            i+=1;
            i = i+1;
        }

        int b = max;

        do {
            if (b % 2 == 1) {
                System.out.println(b);

            }
            b--;
        } while (b >= min);
    }


}
