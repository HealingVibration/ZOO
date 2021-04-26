package zooIncorporation;

import animals.Animal;
import animals.Elephant;
import animals.Monkey;
import animals.WildAnimal;

import java.util.Arrays;

public class Zoo {
    private int parkingSpots;
    private double ticketPrice;
    private short numberOfCages;
    private float area;
    private String name;
    //atrybuty jako kompozycja;
   private Employee[] employees;
   //private Elephant[] elephants;
   // private Monkey[] monkeys;
    private Animal[] animals;
    private WildAnimal[] wildAnimals;


    public Zoo(int parkingSpots, double ticketPrice, short numberOfCages, float area, String name,
               Employee[] employees, Animal[] animals){

        this.parkingSpots = parkingSpots;
        this.ticketPrice = ticketPrice;
        this.numberOfCages = numberOfCages;
        this.area = area;
        this.name = name;
        this.employees = employees;
        //this.monkeys = monkeys;
       // this.elephants = elephants;
        this.animals = animals;
    }

    public short getNumberOfCages() {
        return numberOfCages;
    }

    public void setNumberOfCages(short numberOfCages) {
        this.numberOfCages = numberOfCages;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public WildAnimal[] getWildAnimals() {
        return wildAnimals;
    }

    public void setWildAnimals(WildAnimal[] wildAnimals) {
        this.wildAnimals = wildAnimals;
    }
    /*  public Monkey[] getMonkeys() {
        return monkeys;
    }

    public void setMonkeys(Monkey[] monkeys) {
        this.monkeys = monkeys;
    }

    public Elephant[] getElephants() {
        return elephants;
    }

    public void setElephants(Elephant[] elephants) {
        this.elephants = elephants;
    }
*/


    public int getNumbersOfAnimals(){
        return this.animals.length;
    }

    public static void defaultHello(){
        System.out.println("hello Everybody!");

    }

    @Override
    public String toString() {
        return "Zoo{" +
                "parkingSpots=" + parkingSpots +
                ", ticketPrice=" + ticketPrice +
                ", numberOfCages=" + numberOfCages +
                ", area=" + area +
                ", name='" + name + '\'' +
                ", employees=" + Arrays.toString(employees) +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
