package md.tekwillacademy.zooclubservice;

public class Dog extends Animal {

    private boolean hasAGoodLife;


    public Dog(String nameOfTheDog, boolean hasAGoodLife){
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;


    }


    @Override
    public void makeSound() {
        System.out.println("Hrrr hrrrr");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating Pidigri");
    }

public String getName(){
        return this.name + " This is from the child class";
}
}
