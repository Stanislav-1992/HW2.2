public class Griffindor extends Hogwards{
    private int nobility; //благородство
    private int honor; // честь
    private int courage; // храбрость

    public Griffindor(String name, int power, int transgression, int nobility, int honor, int courage) {
        super(name, power, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobility() {
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
    public void printStudentOne() {
        System.out.println("благородство: " + nobility + ", честь: " + honor + ", храбрость: " + courage + ".");
    }
}
