public class Ravenclaw extends Hogwards{
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
}
