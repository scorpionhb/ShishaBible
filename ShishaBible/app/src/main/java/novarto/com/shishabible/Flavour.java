package novarto.com.shishabible;

/**
 * Created by ACER on 04/11/2017.
 */

public class Flavour {

    private int id;
    private String flavourName;


    public Flavour(String flavourName) {
        this.flavourName = flavourName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlavourName() {
        return flavourName;
    }

    public void setFlavourName(String flavourName) {
        this.flavourName = flavourName;
    }
}
