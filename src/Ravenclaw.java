public class Ravenclaw extends Hogwarts{

    public void compareAnyStudentsRavenclaw(Ravenclaw second) {
        int sumOne = this.getIntelligence() + this.getWisdom() + this.getWit() + this.getCreation();
        int sumTwo = second.getIntelligence() + second.getWisdom() + second.getWit() + this.getCreation();
        if (sumOne > sumTwo) {
            System.out.println(this.getName() + " имеет " + sumOne + " баллов. " + second.getName() + " имеет " + sumTwo + " баллов. Соответствено " + this.getName() + " лучший Когтевранец, чем " + second.getName() + ".");
        } else if (sumOne == sumTwo) {
            System.out.println(this.getName() + " и " + second.getName() + " по сумме баллов равны.");
        } else {
            System.out.println(second.getName() + " имеет " + sumTwo + " баллов. " + this.getName() + " имеет " + sumOne + " баллов. Соответствено " + second.getName() + " лучший Когтевранец, чем " + this.getName() + ".");
        }
    }
    private int intelligence; //ум
    private int wisdom; //мудрость
    private int wit; //остроумность
    private int creation; //творчество

    public Ravenclaw(String name, int power, int transgression, int intelligence, int wisdom, int wit, int creation) {
        super(name, power, transgression);
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreation() {
        return creation;
    }

    public void setCreation(int creation) {
        this.creation = creation;
    }

    @Override
    public String toString() {
        return super.toString() +
                "ум: " + intelligence +
                ", мудрость: " + wisdom +
                ", остроумность: " + wit +
                ", творчество: " + creation +  ", факультет: Когтевран" +
                "} ";
    }
}
