public class Griffindor extends Hogwarts{

    public void compareAnyStudentsGriffindor(Griffindor second) {
        int sumOne = this.getHardWork() + this.getHonor() + this.getCourage();
        int sumTwo = second.getHardWork() + second.getHonor() + second.getCourage();
        if (sumOne > sumTwo) {
            System.out.println(this.getName() + " имеет " + sumOne + " баллов. " + second.getName() + " имеет " + sumTwo + " баллов. Соответствено " + this.getName() + " лучший Гриффиндорец, чем " + second.getName() + ".");
        } else if (sumOne == sumTwo) {
            System.out.println(this.getName() + " и " + second.getName() + " по сумме баллов равны.");
        } else {
            System.out.println(second.getName() + " имеет " + sumTwo + " баллов. " + this.getName() + " имеет " + sumOne + " баллов. Соответствено " + second.getName() + " лучший Гриффиндорец, чем " + this.getName() + ".");
        }
    }

    private int nobility; //благородство
    private int honor; // честь
    private int courage; // храбрость

    public Griffindor(String name, int power, int transgression, int nobility, int honor, int courage) {
        super(name, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getHardWork() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getCourage() {
        return courage;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    @Override
    public String toString() {
        return super.toString() +
                "благородство: " + nobility +
                ", честь: " + honor +
                ", храбрость: " + courage + ", факультет Гриффиндор" +
                "} ";
    }
}
