import animals.Animal;
import animals.Elephant;
import animals.Monkey;
import animals.WildAnimal;
import zooIncorporation.Employee;
import zooIncorporation.Zoo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(19, "Konstanty", "Koniczynka", "mundur", (short) 10,
                3, true, (long) 3500, "Monkeys", "Male");
        Employee employee2 = new Employee(20, "Patrycja", "Koniczynka", "mundur", (short) 10,
                3, true, (long) 4500, "Elephants", "Female");
        Employee employee3 = new Employee(21, "Ryszard", "Drewno", "mundur", (short) 10,
                3, true, (long) 3500, "Monkeys", "Male");

        Monkey monkey1 = new Monkey(1,(short) 2, 1, 2, 28.00D, "uhah",
                130.5D, "brown", true, 2);
        Monkey monkey2 = new Monkey( 2,(short) 2, 1, 2 ,24.3D,
                "uhaha", 110.2,"black",true, 3);
        Elephant elephant1 = new Elephant(3,3500,1, 2, true,
                true,true, "pucus", "trutu",6);
        Elephant elephant2 = new Elephant(4,3500,1, 2, true,
                true,true, "pucus", "trutu",3);
        Employee[] employees = new Employee[]{employee1, employee2, employee3};
        Monkey[] monkeys = new Monkey[]{monkey1, monkey2};
        Elephant[] elephants = new Elephant[]{elephant1, elephant2};
        Animal[] animals = new Animal[]{monkey1, monkey2, elephant1, elephant2};
        WildAnimal[] wildAnimals = new WildAnimal[]{monkey1, elephant2};

        System.out.println(employee1);
        System.out.println(Employee.doHello("Kasia"));

        Zoo zoo = new Zoo(20,10.2D,(short) 30,
                3000.22F,"nucuś",employees, animals);
        zoo.setWildAnimals(wildAnimals);

        System.out.println("====");
        System.out.println(Arrays.toString(zoo.getWildAnimals()));
        System.out.println("====");
        System.out.println(zoo);
        Zoo.defaultHello();
    }
}
