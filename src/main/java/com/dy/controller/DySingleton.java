package com.dy.controller;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @author DongDeShuai
 * @Date:2020/5/9 2:26 下午
 */
public class DySingleton {

    //饿汉模式 start
    /**
     * 创建一个单例的对象
     * */
    private static final DySingleton singleton = new DySingleton();

    /**
     * 构造函数私有化,不让在外部创建对象,以下几种单例的写法前提都是构造私有化
     * */
    private DySingleton(){};
    /**
     * static方法相当于类方法
     * */
    public static DySingleton getSingleton(){
        return singleton;
    }
    //饿汉模式 end

    //懒汉模式 start
    /**
     * 声明一个空的对象
     * */
    private static DySingleton dySingleton = null;
    /**
     * 写法一,多线程下会创建多个对象
     * */
    public DySingleton getDySingletonOne (){
        if (dySingleton == null){
            dySingleton = new DySingleton();
        }
        return dySingleton;
    }
    /**
     * 写法二,加锁,但是每次都会执行加锁解锁的操作,不太好
     * */
    public static synchronized DySingleton getDySingleton(){
        if (dySingleton == null){
            dySingleton = new DySingleton();
        }
        return dySingleton;
    }
    /**
     * 写法三,不必每次加锁解锁,但是有指令重排的问题
     * */
    public static DySingleton getMySingleton(){
        if (dySingleton == null){
            synchronized (DySingleton.class){
                dySingleton = new DySingleton();
            }
        }
        return dySingleton;
    }
    /**
     * 写法四,实行双重校验锁volatile
     * */
    private static volatile DySingleton _dySingleton = null;
    public static DySingleton getMyDySingleton(){
        if (_dySingleton == null){
            synchronized (DySingleton.class){
                _dySingleton = new DySingleton();
            }
        }
        return _dySingleton;
    }
    /**
     * 写法五,推荐写法
     * */

    private static class DySingletonHolder{
        private static DySingleton singleton = new DySingleton();
    }
    public static DySingleton getMSingleton(){
        return DySingletonHolder.singleton;
    }
}
