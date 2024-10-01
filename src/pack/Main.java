package pack;

public class Main {
    public static void main(String[] args) {
        //Гриффиндор
        Hogwarts masGrif[] = new Griffindor[3];
        masGrif[0]= new Griffindor("Гриффиндор","Гарри Поттер", 45, 23,11);
        masGrif[1] = new Griffindor("Гриффиндор", "Гермиона Грейнджер", 34,19,15);
        masGrif[2] = new Griffindor("Гриффиндор","Рон Уизли", 24, 13,12);

        //Слизерин
        Hogwarts masSliz[] = new Slizerin[3];
        masSliz[0] = new Slizerin("Слизерин","Драко Малфой", 41,22,12);
        masSliz[1] = new Slizerin("Слизерин","Грэхэм Монтегю", 28,4,7);
        masSliz[2] = new Slizerin("Слизерин","Грегори Гойл", 31,6,10);

        //Пуффендуй
        Hogwarts masPuf[] = new Puffendui[3];
        masPuf[0] = new Puffendui("Пуффендуй","Захария Смит", 32,12,13);
        masPuf[1] = new Puffendui("Пуффендуй","Седрик Диггори", 17,25,34);
        masPuf[2] = new Puffendui("Пуффендуй","Джастин Финч-Флетчли", 31,23,4);

        //Когтевран
        Hogwarts masKog[] = new Koktevran[3];
        masKog[0] = new Koktevran("Когтевран","Чжоу Чанг" , 41,22,12);
        masKog[1] = new Koktevran("Когтевран","Падма Патил", 28,4,7);
        masKog[2] = new Koktevran("Когтевран","Маркус Белби", 31,6,10);

        soutStudent(masGrif);
        soutStudent(masSliz);
        soutStudent(masPuf);
        soutStudent(masKog);

        sravPoints(masGrif);
        sravPoints(masSliz);
        sravPoints(masPuf);
        sravPoints(masKog);

        System.out.println("\n");

        sravSkills(masGrif[0], masGrif[2]);
    }

    //Сравнение магических навыков
    public static void sravSkills(Hogwarts student1, Hogwarts student2){
        //магические силы
        if (student1.getMagicPower() > student2.getMagicPower()){
            System.out.println("У " + student1.getFio() + " магические силы мощнее, чем у " +
                    student2.getFio());
        } else if (student1.getMagicPower() < student2.getMagicPower()){
            System.out.println("У " + student2.getFio() + " магические силы мощнее, чем у " +
                    student1.getFio());
        }
        if (student1.getMagicPower() == student2.getMagicPower()){
            System.out.println("У " + student1.getFio() + " и " +
                    student2.getFio() + " магические силы равны.");
        }

        //расстояние трансгрессии
        if (student1.getTransDist() > student2.getTransDist()){
            System.out.println("У " + student1.getFio() + " расстояние трансгрессии больше, чем у " +
                    student2.getFio());
        } else if (student1.getTransDist() < student2.getTransDist()){
            System.out.println("У " + student2.getFio() + " расстояние трансгрессии больше, чем у " +
                    student1.getFio());
        }
        if (student1.getTransDist() == student2.getTransDist()){
            System.out.println("У " + student1.getFio() + " и " +
                    student2.getFio() + " расстояние трансгрессии одинаково.");
        }

    }
    //Сравнение 2-х учеников факультета
    public static void sravPoints(Hogwarts arr[]){
        int max1 = -100, max2 = -100, num1 = 0, num2 = 0, num3 = 0;
        for (int i = 0; i < arr.length; i++){
            if ((arr[i].getSelfPoints() + arr[i].getMagicPower() + arr[i].getTransDist())> max1){
                max1 = arr[i].getSelfPoints() + arr[i].getMagicPower() + arr[i].getTransDist();
                num1 = i;
            }
            if ((arr[i].getSelfPoints() + arr[i].getMagicPower() + arr[i].getTransDist()) > max2
                    && (arr[i].getSelfPoints() + arr[i].getMagicPower() + arr[i].getTransDist()) < max1){
                max2 = arr[i].getSelfPoints() + arr[i].getMagicPower() + arr[i].getTransDist();
                num2 = i;
            }
            if (i != num2 && i != num1){
                num3 = i;
            }
        }
        System.out.println("У " + arr[num1].getFio() + " больше очков, чем у " +
                arr[num2].getFio() + " и " + arr[num3].getFio() + ", а у " +
                arr[num2].getFio() + " очков больше, чем у " + arr[num3].getFio());
    }

    //Метод выводит инфу о студентах
    public static void soutStudent(Hogwarts arr[]){
        Service ser = new Service();
        String fac  = arr[0].getFacultet();
        String facQual = "";
        System.out.println("Факультет: " + fac);
        if (fac.equals("Гриффиндор")){
            facQual = Griffindor.qualities;
        } else if (fac.equals("Слизерин")){
            facQual = Slizerin.qualities;
        } else if (fac.equals("Пуффендуй")){
            facQual = Puffendui.qualities;
        } else if (fac.equals("Когтевран")){
            facQual = Koktevran.qualities;
        }
        for (int i = 0; i < arr.length; i++){
            if (ser.checkSelfPoints(arr[i]) == true){
                System.out.println(arr[i]);
            }else {
                throw new IllegalArgumentException("Недопустимое значение в очках!");
            }

        }
        System.out.println(facQual + "\n");
    }
}
