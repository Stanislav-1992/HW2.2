public class Hufflepuff extends Hogwards{

    private int hardWork; //трудолюбивость
    private int loyalty; //верность
    private int honesty; //честность

    public Hufflepuff(String name, int power, int transgression, int hardWork, int loyalty, int honesty) {
        super(name, power, transgression);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork() {
        return hardWork;
    }

    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
