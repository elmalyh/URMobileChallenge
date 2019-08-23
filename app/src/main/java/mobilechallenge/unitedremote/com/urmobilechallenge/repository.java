package mobilechallenge.unitedremote.com.urmobilechallenge;

import com.google.gson.annotations.SerializedName;

public class repository {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    @SerializedName("owner.login")
    private String owner_name;

    @SerializedName("stargazers_count")
    private int stars_number;

    public repository(String name, String description, String owner_name, int stars_number) {
        this.name = name;
        this.description = description;
        this.owner_name = owner_name;
        this.stars_number = stars_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public int getStars_number() {
        return stars_number;
    }

    public void setStars_number(int stars_number) {
        this.stars_number = stars_number;
    }
}
