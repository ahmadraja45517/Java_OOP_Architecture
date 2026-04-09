package com.ahmad.StaticAndinBuiltMethods;

public class DatabaseConnection {
    private DatabaseConnection(){

    }

    private static DatabaseConnection instance;

    public static DatabaseConnection getInstance(){
        if (instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}
