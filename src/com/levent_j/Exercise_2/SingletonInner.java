package com.levent_j.Exercise_2;

/**
 * Created by levent_j on 17-1-5.
 */
public class SingletonInner {
    private SingletonInner(){}
    public static SingletonInner getInstance(){
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder {
        private static final SingletonInner sInstance = new SingletonInner();
    }
}
