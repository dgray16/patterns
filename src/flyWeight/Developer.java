package flyWeight;

import javafx.scene.image.Image;

/**
 * Created by Administrator on 01.04.2015.
 */
public abstract class Developer {
    public double id;
    public String typeOfDeveloper;
    public DeveloperImage avatar;

    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }

    public String getTypeOfDeveloper() {
        return typeOfDeveloper;
    }
    public void setTypeOfDeveloper(String typeOfDeveloper) {
        this.typeOfDeveloper = typeOfDeveloper;
    }

    public DeveloperImage getAvatar() {
        return avatar;
    }
    public void setAvatar(DeveloperImage avatar) {
        this.avatar = avatar;
    }
}
