public class Slytherin extends Hogwarts{

    public void compareAnyStudentsSlytherin(Slytherin second) {
        int sumOne = this.getCunning() + this.getDetermination() + this.getAmbition() + this.getResourcefulness() + this.getAuthority();
        int sumTwo = second.getCunning() + second.getDetermination() + second.getAmbition() + second.getResourcefulness() + second.getAuthority();
        if (sumOne > sumTwo) {
            System.out.println(this.getName() + " имеет " + sumOne + " баллов. " + second.getName() + " имеет " + sumTwo + " баллов. Соответствено " + this.getName() + " лучший Слизеринец, чем " + second.getName() + ".");
        } else if (sumOne == sumTwo) {
            System.out.println(this.getName() + " и " + second.getName() + " по сумме баллов равны.");
        } else {
            System.out.println(second.getName() + " имеет " + sumTwo + " баллов. " + this.getName() + " имеет " + sumOne + " баллов. Соответствено " + second.getName() + " лучший Слизеринец, чем " + this.getName() + ".");
        }
    }
    private int cunning; //хитрость
    private int determination; //решительность
    private int ambition; //амбициозность
    private int resourcefulness; //находчивость
    private int authority; //властность

    public Slytherin(String name, int power, int transgression, int cunning, int determination, int ambition, int resourcefulness, int authority) {
        super(name, power, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.authority = authority;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return super.toString() +
                "хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", властность: " + authority + ", факультет: Слизерин" +
                "} ";
    }
}
