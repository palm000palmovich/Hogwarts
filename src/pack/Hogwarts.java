package pack;

public class Hogwarts {
    private String facultet;
    private String fio;
    private int selfPoints;

    public Hogwarts(String facultet, String fio, int selfPoints) {
        this.facultet = facultet;
        this.fio = fio;
        this.selfPoints = selfPoints;
    }


    public String getFacultet(){
        return facultet;
    }
    public void setFacultet(String facultet){
        this.facultet = facultet;
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

    public Griffindor(String facultet, String fio, int selfPoints){
        super(facultet, fio, selfPoints);

    }

    @Override
    public String toString() {
        return "Гриффиндор  " + getFio() + " " + qualities + " индивидуальные очки: " + getSelfPoints();
    }
}
class Puffendui extends Hogwarts{
    static String qualities = "Студенты этого факультета трудолюбивы, верны, честны.";
    public Puffendui(String facultet, String fio, int selfPoints){
        super(facultet, fio, selfPoints);
    }
    @Override
    public String toString() {
        return "Пуффендуй " + getFio() + " " + qualities + " индивидуальные очки: " + getSelfPoints();
    }
}

class Koktevran extends Hogwarts{
    static String qualities = "Студенты этого факультета умны, мудры, остроумны и полны творчества.";
    public Koktevran(String facultet, String fio, int selfPoints){
        super(facultet, fio, selfPoints);
    }
    @Override
    public String toString() {
        return "Пуффендуй " + getFio() + " " + qualities  + " индивидуальные очки: " + getSelfPoints();
    }

}

class Slizerin extends Hogwarts{
    static String qualities = "Студентам этого факультета присущи хитрость, решительность, амбициозность, находчивость и жажда власти.";

    public Slizerin(String facultet, String fio, int selfPoints){
        super(facultet, fio, selfPoints);
    }
    @Override
    public String toString() {
        return "Слизерин " + getFio() + " индивидуальные очки: " + getSelfPoints() + " " + qualities;
    }
}
