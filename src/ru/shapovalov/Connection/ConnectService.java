package ru.shapovalov.Connection;

/**
 * Created by igor on 20.03.15.
 */
public class ConnectService {
    private Connect conn;

    public ConnectService(){

    }

    public String getTitle(long id){
        return conn.getTitle(id);
    }
}
