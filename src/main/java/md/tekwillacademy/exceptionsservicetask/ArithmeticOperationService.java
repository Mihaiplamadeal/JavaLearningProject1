package md.tekwillacademy.exceptionsservicetask;

public class ArithmeticOperationService {

    public static double divideWithoutExceptionHandling(int a, int b){

        return a/b;

    }
    public static double divideWithErrorException(int a, int b){
        try{
            return a/b;

        }catch (ArithmeticException capturedException){
            System.out.println(capturedException.getMessage());
            return 0.0;

        }
    }
}
