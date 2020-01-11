package utils;

import java.util.ResourceBundle;

public class PropertyReader {
    private final ResourceBundle config = ResourceBundle.getBundle("config");
    private final ResourceBundle user = ResourceBundle.getBundle("user");


    public String getURL() {
        return this.config.getString("url");
    }

    public String getUserName() {
        return this.user.getString("username");
    }

    public String getPassword() {
        return this.user.getString("password");
    }
}
