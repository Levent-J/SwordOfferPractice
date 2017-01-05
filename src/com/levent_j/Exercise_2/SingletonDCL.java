package com.levent_j.Exercise_2;

/**
 * Created by levent_j on 17-1-5.
 */
public class SingletonDCL {
    private static SingletonDCL sInstance;
    private SingletonDCL(){};

    public static SingletonDCL getsInstance(){
        if (sInstance==null){
            synchronized (SingletonDCL.class){
                if (sInstance==null){
                    sInstance = new SingletonDCL();
                }
            }
        }

        return sInstance;
    }
}
