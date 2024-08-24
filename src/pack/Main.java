package pack;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();
        //Гриффиндор
        Hogwarts masGrif[] = new Griffindor[3];
        masGrif[0]= new Griffindor("Гриффиндор","Гарри Поттер", 94);
        masGrif[1] = new Griffindor("Гриффиндор", "Гермиона Грейнджер", 84);
        masGrif[2] = new Griffindor("Гриффиндор","Рон Уизли", 63);

        //Слизерин
        Hogwarts masSliz[] = new Slizerin[3];
        masSliz[0] = new Slizerin("Слизерин","Драко Малфой", 87);
        masSliz[1] = new Slizerin("Слизерин","Грэхэм Монтегю", 34);
        masSliz[2] = new Slizerin("Слизерин","Грегори Гойл", 34);

        //Пуффендуй
        Hogwarts masPuf[] = new Puffendui[3];
        masPuf[0] = new Puffendui("Пуффендуй","Захария Смит", 68);
        masPuf[1] = new Puffendui("Пуффендуй","Седрик Диггори", 75);
        masPuf[2] = new Puffendui("Пуффендуй","Джастин Финч-Флетчли", 72);

        //Когтевран
        Hogwarts masKog[] = new Koktevran[3];
        masKog[0] = new Koktevran("Когтевран","Чжоу Чанг" , 65);
        masKog[1] = new Koktevran("Когтевран","Падма Патил", 59);
        masKog[2] = new Koktevran("Когтевран","Маркус Белби", 45);

        soutStudent(masGrif);
        soutStudent(masSliz);
        soutStudent(masPuf);
        soutStudent(masKog);
    }

    //Метод выводит инфу о студентах
    public static void soutStudent(Hogwarts arr[]){
        Service ser = new Service();

    }

}