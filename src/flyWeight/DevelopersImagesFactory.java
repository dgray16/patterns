package flyWeight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 01.04.2015.
 */
public class DevelopersImagesFactory {
    private static Map<String, DeveloperImage> devImages = new HashMap<>();

    public static DeveloperImage createApplicationImage(){
        if (!devImages.containsKey("Application")){
            devImages.put("Application", new ApplicationDeveloperImage());
        }
        return devImages.get("Application");
    }
    public static DeveloperImage createWebImage(){
        if (!devImages.containsKey("Web")){
            devImages.put("Web", new flyWeight.WebDeveloperImage());
        }
        return devImages.get("Web");
    }
}
