package animals;

public class Elephant extends Animal implements WildAnimal{
    public static final String SOUND = "Tereee!";
    private long id;
    private int weight;
    private int trunkNumber;
    private int earsNumber;
    private boolean isHealthy;
    private boolean isMammal;
    private boolean isHerbivore;
    public String name;
    private String playBeautiful;
    public Elephant(long id, int weight, int trunkNumber, int earsNumber,
                    boolean isHealthy, boolean isMammal, boolean isHerbivore,
                    String name, String playBeautiful, int age) {
        super(age);
        this.id = id;
        this.weight = weight;
        this.trunkNumber = trunkNumber;
        this.earsNumber = earsNumber;
        this.isHealthy = isHealthy;
        this.isMammal = isMammal;
        this.isHerbivore = isHerbivore;
        this.name = name;
        this.playBeautiful = playBeautiful;
    }
    public Elephant(long id, int weight, int trunkNumber, int earsNumber,
                    boolean isHealthy, boolean isMammal, boolean isHerbivore, int age) {
        super(age);
        this.id = id;
        this.weight = weight;
        this.trunkNumber = trunkNumber;
        this.earsNumber = earsNumber;
        this.isHealthy = isHealthy;
        this.isMammal = isMammal;
        this.isHerbivore = isHerbivore;
        this.name = "Benjamin";
        this.playBeautiful = SOUND;
    }

    public static void typicalPlayTrunk() {
        System.out.println(SOUND);
    }
    public void playTrunk() {
        System.out.println(this.playBeautiful);
    }
    public void walk() {
        System.out.println("tuptuptup");
    }
    private boolean isCorrectWeight(int weight) {
        return weight < 10000 && weight > 1000;
    }

    @Override
    public void attack() {
        System.out.println("trample");
    }

    @Override
    public String toString() {
//        return super.toString();
        return "id: " + this.id + ", name: " + this.name;
    }
    public long getId() {
        return id;
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (isCorrectWeight(weight)) {
            this.weight = weight;
        } else {
            System.out.println("This weight is NOT possible");
        }
    }

    @Override
    void makeSound() {
        System.out.println("tiuuu");
    }

    //Getters and Setters
    public int getTrunkNumber() {
        return trunkNumber;
    }
    public int getEarsNumber() {
        return earsNumber;
    }
    public boolean isHealthy() {
        return isHealthy;
    }
    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }
    public boolean isMammal() {
        return isMammal;
    }
    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }
    public boolean isHerbivore() {
        return isHerbivore;
    }
    public void setHerbivore(boolean herbivore) {
        isHerbivore = herbivore;
    }
    public String getPlayBeautiful() {
        return playBeautiful;
    }
    public void setPlayBeautiful(String playBeautiful) {
        this.playBeautiful = playBeautiful;
    }

}
