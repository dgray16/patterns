package flyWeight;

/**
 * Created by Administrator on 01.04.2015.
 */
public class Web extends Developer{
    public Web(){
        id = Math.random();
        typeOfDeveloper = "Web";
        avatar = DevelopersImagesFactory.createWebImage();
    }
}
