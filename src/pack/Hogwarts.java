package pack;

public class Hogwarts {
    private String fio;
    private int selfPoints;

    public Hogwarts(String fio, int selfPoints) {
        this.fio = fio;
        this.selfPoints = selfPoints;
    }


    public String getFio() {
        return fio;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }
    public int getSelfPoints() {
        return selfPoints;
    }
    public void setSelfPoints(int selfPoints) {
        this.selfPoints = selfPoints;
    }

}

class Griffindor extends Hogwarts{
    static String qualities = "Студентам этого факультета присущи благородство, честь и храбрость.";

    public Griffindor(String fio, int selfPoints){
        super(fio,selfPoints);

    }

    @Override
    public String toString() {
        return "Гриффиндор  " + getFio() + " " + qualities + " индивидуальные очки: " + getSelfPoints();
    }
}
class Puffendui extends Griffindor{
    static String qualities = "Студенты этого факультета трудолюбивы, верны, честны.";
    public Puffendui(String fio, int selfPoints){
        super(fio, selfPoints);
    }
    @Override
    public String toString() {
        return "Пуффендуй " + getFio() + " " + qualities + " индивидуальные очки: " + getSelfPoints();
    }
}

class Koktevran extends Hogwarts{
    static String qualities = "Студенты этого факультета умны, мудры, остроумны и полны творчества.";
    public Koktevran(String fio, int selfPoints){
        super(fio, selfPoints);
    }
    @Override
    public String toString() {
        return "Пуффендуй " + getFio() + " " + qualities  + " индивидуальные очки: " + getSelfPoints();
    }

}

class Slizerin extends Hogwarts{
    static String qualities = "Студентам этого факультета присущи хитрость, решительность, амбициозность, находчивость и жажда власти.";

    public Slizerin(String fio, int selfPoints){
        super(fio, selfPoints);
    }
    @Override
    public String toString() {
        return "Слизерин " + getFio() + " " + qualities + " индивидуальные очки: " + getSelfPoints();
    }
}
