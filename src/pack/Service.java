package pack;

public class Service {

    //проверка личного рейтинга
    public boolean checkSelfPoints(Hogwarts hog) {
        boolean flag = true;
        if ((hog.getSelfPoints() + hog.getMagicPower() + hog.getTransDist()) <= 100){
            flag = true;
        }  else{
            flag = false;
        }
        return flag;
    }
}
