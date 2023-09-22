package md.tekwillacademy.operationandcyclicfunctions;

public class AssigmentOperationExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 15;

        a = a + 1;
        System.out.println(a);

        b = b % a;
        System.out.println(b);


        a %= b;
        //Atribuire cu restul impartii. In cazul specific este a = 11 % 4

        System.out.println(a);

//Atribuire cu adunare
        a +=4;
        System.out.println(a);

//Calculate the sum of the numbers until x

        int x = 64;
        int sum = 0;

        for (int i = 0; i <= x; i++){
            sum = sum + i;

        }
        System.out.println(sum);

        int c = 45;
        int d = 5;
        c /=d;

        System.out.println(c);
    }
}
