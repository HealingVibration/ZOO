package animals;

public abstract class Animal {
    protected int age;

    public Animal(int age){
        this.age = age;

    }

    abstract void makeSound();


}
