package md.tekwillacademy.classesandobjects;

import md.tekwillacademy.classesandobjects.autoservicetask.Car;
import md.tekwillacademy.classesandobjects.autoservicetask.Garage;
import md.tekwillacademy.classesandobjects.autoservicetask.Person;
import md.tekwillacademy.classesandobjects.autoservicetask.Worker;

public class ManageAutoService {

    public static void main(String[] args) {
        Garage autoDocGarage;
        autoDocGarage = new Garage();
        autoDocGarage.address = "Stefan cel Mare, Ihub 64";
        autoDocGarage.surfaceM2 = 450.0F;
        autoDocGarage.capacity = 50;

        System.out.println(" Obiectul autodocGarage are urmatoarele proprietati" + autoDocGarage.address + "     " + autoDocGarage.surfaceM2 + "    " + autoDocGarage.capacity);

        Garage garageIaloveni = new Garage();
        System.out.println(" Obiectul autodocGarage are urmatoarele proprietati" + garageIaloveni.address + "     " + garageIaloveni.surfaceM2 + "    " + garageIaloveni.capacity);

        Worker vasile = new Worker();
        vasile.name = "Vasile";
        vasile.age = 54;

        System.out.println("Obiectul nostru are nume de " + vasile.name + " si are " + vasile.age + " ani" );

        Worker ion = new Worker();

        System.out.println("Obiectul nostru are nume de " + ion.name + " si are " + ion.age + " ani" );

        Person client1 = new Person("37369000123");

        Car porscheNNK132 = new Car("1234A567A89", "Porsche Cayenne", client1);

        Car mercedesBenzTranzit = new Car("A1234445B","Mercedes",
                new Person("+37369123456"));

        System.out.println("Masina noastra este  " + porscheNNK132.mark + " si proprietarul poate fi apelat la " + porscheNNK132.owner.phoneNumber );


        System.out.println("Masina noastra este  " + mercedesBenzTranzit.mark + " si proprietarul poate fi apelat la " + mercedesBenzTranzit.owner.phoneNumber );

    }
}
