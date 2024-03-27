public class Hogwarts {
    public void compareAnyStudentsHogwarts(Hogwarts second) {
        int sumOne = this.getPower() + this.getTransgression();
        int sumTwo = second.getPower() + second.getTransgression();
        if (sumOne > sumTwo) {
            System.out.println(this.getName() + " имеет " + sumOne + " баллов. " + second.getName() + " имеет " + sumTwo + " баллов. Соответствено " + this.getName() + " большей мощностью магии, чем " + second.getName() + ".");
        } else if (sumOne == sumTwo) {
            System.out.println(this.getName() + " и " + second.getName() + " по сумме баллов равны.");
        } else {
            System.out.println(second.getName() + " имеет " + sumTwo + " баллов. " + this.getName() + " имеет " + sumOne + " баллов. Соответствено " + second.getName() + " большей мощностью магии, чем  " + this.getName() + ".");
        }
    }
    private String name;
    private int power; //сила
    private int transgression; // трансгрессия

    public Hogwarts(String name, int power, int transgression) {
        this.name = name;
        this.power = power;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Хогвардс {" +
                "студент - '" + name + '\'' +
                ", сила: " + power +
                ", расстояние трансгрессии: " + transgression +
                ", ";
    }
}

