package space.onepantsu.chibiholder.user;

public class User {

    private String username, password;
    private int age;
    private long charID;



    public User(String username, String password, int age){
        setUsername(username);
        setPassword(password);
        setAge(age);
    }

    public User(String username, String password){
        setUsername(username);
        setPassword(password);
        setAge(-1);
    }

    public long getCharID() {
        return charID;
    }

    public void setCharID(long charID) {
        this.charID = charID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
