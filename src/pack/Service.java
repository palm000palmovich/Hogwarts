package pack;

public class Service {

    //проверка личного рейтинга
    public boolean checkSelfPoints(Hogwarts hog){
        return hog.getSelfPoints() <= 100;
    }
}
