public class Hogwards {
    private String name;
    private int power; //сила
    private int transgression; // трансгрессия

    public Hogwards(String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public void printStudent(Griffindor student) {
        System.out.println("Студент: " + name + ", сила: " + power +", дальность трансгрессии: " + transgression + ",");
        student.printStudentOne();
    }
}

