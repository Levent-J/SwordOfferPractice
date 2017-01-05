package com.levent_j.Exercise_2;

/**
 * Created by levent_j on 17-1-5.
 */
public class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy(){};

    public static synchronized SingletonLazy getInstance(){
        if (instance==null){
            instance = new SingletonLazy();
        }
        return instance;
    }
}
