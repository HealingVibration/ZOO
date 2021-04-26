package animals;
public class Monkey extends Animal implements WildAnimal{

    public static final String SOUND = "Uhaha";
    private long id;
    private short legs;
    private int tails;
    private int hands;
    private double weight;
    private String ownSound;
    private double height;
    private String color;
    private boolean isHealthy;
    private boolean likeStealing;
    public String name;

    public Monkey(long id, short legs, int tails, int hands, double weight, String ownSound,
                  double height, String color, boolean isHealthy, int age) {
        super(age);

        this.id = id;
        this.legs = legs;
        this.tails = tails;
        this.weight = weight;
        this.hands = hands;
        this.ownSound = ownSound;
        this.height = height;
        this.color = color;
        this.isHealthy = isHealthy;
        this.likeStealing = true;
        this.name = "Monkey";
    }
    public Monkey(long id, short legs, int tails, int hands, double weight,
                  String ownSound, double height, String color, boolean isHealthy,
                  boolean likeStealing, String name, int age) {
        super(age);
        this.id = id;
        this.legs = legs;
        this.tails = tails;
        this.hands = hands;
        this.weight = weight;
        this.ownSound = ownSound;
        this.height = height;
        this.color = color;
        this.isHealthy = isHealthy;
        this.likeStealing = likeStealing;
        this.name = name;
    }

    @Override
    public void attack() {
        System.out.println("punching");
    }


    @Override
    void makeSound(){
        System.out.println("uhaha");
    }


    @Override
    public String toString() {
        return "Monkey{" +
                "id=" + id +
                ", legs=" + legs +
                ", tails=" + tails +
                ", hands=" + hands +
                ", weight=" + weight +
                ", ownSound='" + ownSound + '\'' +
                ", height=" + height +
                ", color='" + color + '\'' +
                ", isHealthy=" + isHealthy +
                ", likeStealing=" + likeStealing +
                ", name='" + name + '\'' +
                '}';
    }
    //Getters and Setters
    public long getId() {
        return id;
    }
    public short getLegs() {
        return legs;
    }
    public void setLegs(short legs) {
        this.legs = legs;
    }
    public int getTails() {
        return tails;
    }
    public void setTails(int tails) {
        this.tails = tails;
    }
    public int getHands() {
        return hands;
    }
    public void setHands(int hands) {
        this.hands = hands;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public String getOwnSound() {
        return ownSound;
    }
    public void setOwnSound(String ownSound) {
        this.ownSound = ownSound;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getColor() {
        return color;
    }
    public boolean isHealthy() {
        return isHealthy;
    }
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
    public boolean isLikeStealing() {
        return likeStealing;
    }
    public void setLikeStealing(boolean likeStealing) {
        this.likeStealing = likeStealing;
    }

}
