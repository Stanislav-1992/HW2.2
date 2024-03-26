public class Main {
    public static void main(String[] args) {



        Griffindor harryPotter = new Griffindor("Гарри Поттер",95, 90, 85, 80, 75);
        Griffindor hermioneGranger = new Griffindor("Гермиона Грейнджер",90, 85, 80, 75, 70);
        Griffindor ronWeasley = new Griffindor("Рон Уизли",85, 80, 75, 70, 65);

        Slytherin dracoMalfoy = new Slytherin("Драко Малфой", 80, 75, 70, 65,60, 55, 50);
        Slytherin grahamMontague = new Slytherin("Грэхэм Монтегю", 75, 70, 65, 60,55, 50, 45);
        Slytherin gregoryGoyle = new Slytherin("Грегори Гойл", 70, 65, 60, 55,50, 45, 40);

        Hufflepuff zachariahSmith = new Hufflepuff("Захария Смит", 65, 60, 55, 50, 45);
        Hufflepuff cedricDiggory = new Hufflepuff("Седрик Диггори", 60, 55, 50, 45, 40);
        Hufflepuff justinFinchFletchley = new Hufflepuff("Джастин Финч-Флетчли", 55, 50, 45, 40, 35);

        Ravenclaw zhouChang = new Ravenclaw("Чжоу Чанг", 50, 45, 40, 35, 30, 25);
        Ravenclaw padmaPatil = new Ravenclaw("Падма Патил", 45, 40, 35, 30, 25, 20);
        Ravenclaw marcusBelby = new Ravenclaw("Маркус Белби", 40, 35, 30, 25, 20, 15);

        harryPotter.printStudent(harryPotter);

    }
}