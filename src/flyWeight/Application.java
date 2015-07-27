package flyWeight;

/**
 * Created by Administrator on 01.04.2015.
 */
public class Application extends Developer {
    public Application(){
        id = Math.random();
        typeOfDeveloper = "Application";
        avatar = DevelopersImagesFactory.createApplicationImage();
    }
}
