package co.edu.konradlorenz.myapplication.entities;

/**
 * Created by Kevin on 25/09/2017.
 */

public class commentary {
    String commentary;
    String user;

    public commentary(String commentary, String user) {
        this.commentary = commentary;
        this.user = user;
    }

    public commentary() {
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
