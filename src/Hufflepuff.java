public class Hufflepuff extends Hogwarts{

    public void compareAnyStudentsHufflepuff(Hufflepuff second) {
        int sumOne = this.getHardWork() + this.getLoyalty() + this.getHonesty();
        int sumTwo = second.getHardWork() + second.getLoyalty() + second.getHonesty();
        if (sumOne > sumTwo) {
            System.out.println(this.getName() + " имеет " + sumOne + " баллов. " + second.getName() + " имеет " + sumTwo + " баллов. Соответствено " + this.getName() + " лучший Пуффендуец, чем " + second.getName() + ".");
        } else if (sumOne == sumTwo) {
            System.out.println(this.getName() + " и " + second.getName() + " по сумме баллов равны.");
        } else {
            System.out.println(second.getName() + " имеет " + sumTwo + " баллов. " + this.getName() + " имеет " + sumOne + " баллов. Соответствено " + second.getName() + " лучший Пуффендуец, чем " + this.getName() + ".");
        }
    }
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

    @Override
    public String toString() {
        return super.toString() +
                "трудолюбивость: " + hardWork +
                ", верность: " + loyalty +
                ", честность: " + honesty + ", факультет: Пуффендуй" +
                "} ";
    }
}
