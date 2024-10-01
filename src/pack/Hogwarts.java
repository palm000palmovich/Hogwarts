package pack;

public class Hogwarts {
    private String  facultet;
    private String fio;
    private int selfPoints;
    private int magicPower, transDist;

    public Hogwarts(String facultet, String fio, int selfPoints, int magicPower, int transDist) {
        this.facultet = facultet;
        this.fio = fio;
        this.selfPoints = selfPoints;
        this.magicPower = magicPower;
        this.transDist = transDist;
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

    public int getMagicPower() {
        return magicPower;
    }
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public int getTransDist() {
        return transDist;
    }
    public void setTransDist(int transDist) {
        this.transDist = transDist;
    }
}

class Griffindor extends Hogwarts{
    static String qualities = "Студентам этого факультета присущи благородство, честь и храбрость.";

    public Griffindor(String facultet, String fio, int selfPoints, int magicPower, int transDist){
        super(facultet, fio, selfPoints, magicPower, transDist);

    }

    @Override
    public String toString() {
        return getFio() + " индивидуальные очки: " + getSelfPoints() + " магические силы и расстоянию трансгрессии" +
                " " + getMagicPower() + " " + getTransDist();
    }
}
class Puffendui extends Hogwarts{
    static String qualities = "Студенты этого факультета трудолюбивы, верны, честны.";
    public Puffendui(String facultet, String fio, int selfPoints, int magicPower, int transDist){
        super(facultet, fio, selfPoints, magicPower, transDist);
    }
    @Override
    public String toString() {
        return getFio() + " индивидуальные очки: " + getSelfPoints() + " магические силы и расстоянию трансгрессии" +
                " " + getMagicPower() + " " + getTransDist();
    }
}

class Koktevran extends Hogwarts{
    static String qualities = "Студенты этого факультета умны, мудры, остроумны и полны творчества.";
    public Koktevran(String facultet, String fio, int selfPoints, int magicPower, int transDist){
        super(facultet, fio, selfPoints, magicPower, transDist);
    }
    @Override
    public String toString() {
        return getFio() + " индивидуальные очки: " + getSelfPoints() + " магические силы и расстоянию трансгрессии" +
                " " + getMagicPower() + " " + getTransDist();
    }

}

class Slizerin extends Hogwarts{
    static String qualities = "Студентам этого факультета присущи хитрость, решительность, амбициозность, находчивость и жажда власти.";

    public Slizerin(String facultet, String fio, int selfPoints, int magicPower, int transDist){
        super(facultet, fio, selfPoints, magicPower, transDist);
    }
    @Override
    public String toString() {
        return getFio() + " индивидуальные очки: " + getSelfPoints() + " магические силы и расстоянию трансгрессии" +
                " " + getMagicPower() + " " + getTransDist();
    }
}
