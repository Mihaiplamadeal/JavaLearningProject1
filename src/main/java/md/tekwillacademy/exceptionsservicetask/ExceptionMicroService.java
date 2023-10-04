package md.tekwillacademy.exceptionsservicetask;

public class ExceptionMicroService {

    public static void main(String[] args) {

        String controlVariable = null;

        System.out.println("The String length is =  " + TextManager.getTheTextLengthWithTryAndCatch(controlVariable));
        System.out.println("The String length is =  " + TextManager.getTheTextLength("Dionis"));
        System.out.println("The String length is =  " + TextManager.getTheTextLengthWithIf(controlVariable));

        System.out.println(ArithmeticOperationService.divideWithoutExceptionHandling(0,2));
        System.out.println(ArithmeticOperationService.divideWithErrorException(0,0));
        System.out.println("The show must go on");
    }
}
