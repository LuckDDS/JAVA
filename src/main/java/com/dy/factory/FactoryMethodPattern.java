package com.dy.factory;

/**
 * @author DongDeShuai
 * @Date:2020/5/9 5:18 下午
 * 汽车与工厂(工厂方法模式)
 */
public class FactoryMethodPattern {
    public static void main(String[] args) throws Exception{
        Factory carFactory = new CarFactory();
        Vehicle car = carFactory.produce();
        car.run();
        Factory busFactory = new BusFactory();
        Vehicle bus = busFactory.produce();
        bus.run();
    }

}
/**
 * 抽象工厂类
 * */
interface Factory{
    /**
     * 生产
     * @return 交通工具
     * */
    Vehicle produce();

}

/**
 * 汽车工厂
 * */
class CarFactory implements Factory{
    @Override
    public Vehicle produce() {
        return new Car();
    }
}
/**
 * 公交车工厂
 * */
class BusFactory implements Factory{
    @Override
    public Vehicle produce() {
        return new Bus();
    }
}

/**
 * 交通工具
 * */
interface Vehicle{
    /**
     * 跑
     * */
    void run();
}
/**
 * 汽车
 * */
class Car implements Vehicle{
    @Override
    public void run() {
        System.out.println("car run ....");
    }
}
/**
 * 公交车
 * */
class Bus implements Vehicle{
    @Override
    public void run() {
        System.out.println("bus run ...");
    }
}
/*
abstract class AbstractCar{

    abstract void run();

    void doc(){

    };

}
*/

