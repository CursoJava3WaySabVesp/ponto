package br.com.threeway.segsex.locadora.config;

/**
 * Created by Alex on 02/09/2017.
 */
public class Config {

    private static Config instance;

    private Config (){
    }

    public static Config getInstance(){
        if (instance == null){
            instance = new Config();
        }

        return instance;
    }
}
