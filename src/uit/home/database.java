package uit.home;

import uit.utils.Env;

import java.sql.Connection;
import java.sql.DriverManager;

public class database {
    public static Connection connectDb(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(Env.getEnv(Env.DB_HOST),Env.getEnv(Env.DB_USERNAME),Env.getEnv(Env.DB_PASSWORD));
        } catch (Exception e) {e.printStackTrace();}

        return null;
    }
}
