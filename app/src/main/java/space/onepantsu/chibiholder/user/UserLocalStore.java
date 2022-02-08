package space.onepantsu.chibiholder.user;

import android.content.Context;
import android.content.SharedPreferences;

public class UserLocalStore {

    public static final String SP_NAME = "userDetails";
    private SharedPreferences userLocalDB;

    public UserLocalStore(Context context){
        setUserLocalDB(context.getSharedPreferences(SP_NAME, 0));
    }

    public void storeUserData(User user){
        SharedPreferences.Editor spEditor = userLocalDB.edit();
        spEditor.putString("username", user.getUsername());
        spEditor.putString("password", user.getPassword());
        spEditor.putInt("age", user.getAge());
        spEditor.commit();
    }

    public User getLoggedInUser(){
        String username = userLocalDB.getString("username", "");
        String password = userLocalDB.getString("password", "");
        int age = userLocalDB.getInt("age", -1);

        return new User(username, password, age);
    }

    

    public SharedPreferences getUserLocalDB() {
        return userLocalDB;
    }

    public void setUserLocalDB(SharedPreferences userLocalDB) {
        this.userLocalDB = userLocalDB;
    }
}