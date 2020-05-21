package com.dy.factory;

/**
 * @author DongDeShuai
 * @Date:2020/5/9 4:58 下午
 * 交通工具(简单工厂模式)
 */

public class SimpleFactoryPattern {
    public static void main(String[] args) {
        SimpleVehicle vehicle = SimpleFactory.produce("bus");
        vehicle.run();
    }
}
/**
 * 工厂类
 * */
class SimpleFactory{
    //静态方法,生产交通工具
    public static SimpleVehicle produce(String type){
        SimpleVehicle vehicle = null;
        if (type.equals("car")){
            vehicle = new SimpleCar();
        }else if(type.equals("bus")){
            vehicle = new SimpleBus();
        }else if (type.equals("bicycle")){
            vehicle = new SimpleBicycle();
        }
        return vehicle;
    }
}
/**
 * 交通工具(抽象类)
 * */
interface SimpleVehicle{
    /**
     * 跑
     * */
    void run();
}
/**
 * 汽车(具体类)
 * */
class SimpleCar implements SimpleVehicle{
    @Override
    public void run() {
        System.out.println("car is run");
    }
}
/**
 * 公交车
 * */
class SimpleBus implements SimpleVehicle{
    @Override
    public void run() {
        System.out.println("bus is run");
    }
}
/**
 * 自行车
 * */
class SimpleBicycle implements SimpleVehicle{
    @Override
    public void run() {
        System.out.println("bicycle is run");
    }
}