package zooIncorporation;

public class Employee {

    public static final String DEFAULT_HELLO = "Siema";

    private int id;
    private String name;
    private String surname;
    private String outfit;
    private short numbersOfFingers;
    private int seniority;
    private boolean isFullTime;
    private long salary;
    private String specialization;
    private String sex;
    public String nickname;

    public Employee(int id, String name, String surname, String outfit, short numbersOfFingers, int seniority,
                    boolean isFullTime, long salary, String specialization, String sex) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.outfit = outfit;
        this.numbersOfFingers = numbersOfFingers;
        this.seniority = seniority;
        this.isFullTime = isFullTime;
        this.salary = salary;
        this.specialization = specialization;
        this.sex = sex;
    }

    public Employee(int id, String name, String surname, String outfit, short numbersOfFingers, int seniority,
                    boolean isFullTime, long salary, String specialization, String sex, String nickname) {

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.outfit = outfit;
        this.numbersOfFingers = numbersOfFingers;
        this.seniority = seniority;
        this.isFullTime = isFullTime;
        this.salary = salary;
        this.specialization = specialization;
        this.sex = sex;
        this.nickname = nickname;
    }

    public void prepareToWork() {

        System.out.println("zakładam ubrania " + this.outfit);


    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }


    public String getOutfit() {
        return outfit;
    }

    public void setOutfit(String outfit) {
        this.outfit = outfit;
    }

    public short getNumbersOfFingers() {
        return numbersOfFingers;
    }

    public void setNumbersOfFingers(short numbersOfFingers) {
        this.numbersOfFingers = numbersOfFingers;
    }

    public int getSeniority() {
        return seniority;
    }

    public void setSeniority(int seniority) {
        this.seniority = seniority;
    }

    public boolean isFullTime() {
        return isFullTime;
    }

    public void setFullTime(boolean fullTime) {
        isFullTime = fullTime;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        if(checkSalary(salary))
        this.salary = salary;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    private boolean checkSalary(long salary) {
        if (salary < 1450) {
            return false;
        }
        return true;
    }

    public static String doHello(String name) {
        return DEFAULT_HELLO + " " + name;

    }

    @Override
    public String toString() {
     //   System.out.println(super.toString());
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", outfit='" + outfit + '\'' +
                ", numbersOfFingers=" + numbersOfFingers +
                ", seniority=" + seniority +
                ", isFullTime=" + isFullTime +
                ", salary=" + salary +
                ", specialization='" + specialization + '\'' +
                ", sex='" + sex + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';

    }
}
