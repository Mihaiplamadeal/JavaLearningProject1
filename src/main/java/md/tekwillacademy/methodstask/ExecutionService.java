package md.tekwillacademy.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(100,120));
        System.out.println(DataGeneratorUtil.getRandomInt(120,100));

        int randomInt = DataGeneratorUtil.getRandomInt(50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));

        Customer customer1 = new Customer("Fat Frumos", "Masculin", 65);

        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(95);
        System.out.println(infoAboutCustomer1.toString());

        customer1.setName("Fat Cosinzeana");
        System.out.println(customer1.toString());

        System.out.println("Varsta lui Fat este: " + customer1.getAge());
        System.out.println("Familia lui Fat este: " + customer1.getName());

        Customer customer2 = new Customer("Elena Cosinzeama", "Femenin", 18);
        System.out.println(customer2.toString());



    }
}
