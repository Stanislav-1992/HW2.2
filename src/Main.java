public class Main {

    public static void main(String[] args) {

        Griffindor[] griffindor = new Griffindor[]{
                new Griffindor("Гарри Поттер", 95, 90, 85, 80, 75),
                new Griffindor("Гермиона Грейнджер", 90, 85, 80, 75, 70),
                new Griffindor("Рон Уизли", 85, 80, 75, 70, 65)
        };

        Slytherin[] slytherin = new Slytherin[]{
                new Slytherin("Драко Малфой", 80, 75, 70, 65, 60, 55, 50),
                new Slytherin("Грэхэм Монтегю", 75, 70, 65, 60, 55, 50, 45),
                new Slytherin("Грегори Гойл", 70, 65, 60, 55, 50, 45, 40),
        };

        Hufflepuff[] hufflepuff = new Hufflepuff[]{
                new Hufflepuff("Захария Смит", 65, 60, 55, 50, 45),
                new Hufflepuff("Седрик Диггори", 60, 55, 50, 45, 40),
                new Hufflepuff("Джастин Финч-Флетчли", 55, 50, 45, 40, 35)
        };

        Ravenclaw[] ravenclaw = new Ravenclaw[]{
                new Ravenclaw("Чжоу Чанг", 50, 45, 40, 35, 30, 25),
                new Ravenclaw("Падма Патил", 45, 40, 35, 30, 25, 20),
                new Ravenclaw("Маркус Белби", 40, 35, 30, 25, 20, 15),
        };

        System.out.println(griffindor[0]);
        System.out.println(slytherin[0]);
        System.out.println(hufflepuff[0]);
        System.out.println(ravenclaw[0]);
        griffindor[0].compareAnyStudentsGriffindor(griffindor[1]);
        slytherin[0].compareAnyStudentsSlytherin(slytherin[1]);
        hufflepuff[0].compareAnyStudentsHufflepuff(hufflepuff[1]);
        ravenclaw[0].compareAnyStudentsRavenclaw(ravenclaw[1]);
        griffindor[0].compareAnyStudentsHogwarts(ravenclaw[0]);
    }
}
