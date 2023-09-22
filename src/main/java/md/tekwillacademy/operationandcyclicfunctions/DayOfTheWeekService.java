package md.tekwillacademy.operationandcyclicfunctions;

public class DayOfTheWeekService {
    public static void main(String[] args) {

        //Enter the day name and write in the console the day number

        String nameOfTheDay = "Monday";
        int numberOfTheDay;

        switch (nameOfTheDay.toUpperCase()){

            case "MONDAY":
                numberOfTheDay = 1;
                System.out.println("A case has been founded");

                break;

            case "TUESDAY":
                numberOfTheDay = 2;
                System.out.println("A case has been founded");

                break;

            case "WEDNESDAY":
                numberOfTheDay = 3;
                System.out.println("A case has been founded");
                break;
            case "THURSDAY":
                numberOfTheDay = 4;
                System.out.println("A case has been founded");
                break;
            case "FRIDAY":
                numberOfTheDay = 5;
                System.out.println("A case has been founded");
                break;
            case "SATURDAY":
                numberOfTheDay = 6;
                System.out.println("A case has been founded");
                break;
            case "SUNDAY":
                numberOfTheDay = 7;
                System.out.println("A case has been founded");
                break;

            default:
                numberOfTheDay = 0;
                System.out.println("There is not such day defined in your program");


        }


        System.out.println(numberOfTheDay);

    }
}
