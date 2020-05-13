package io.dowlath.designpatterns.singleton.reflection;

import java.lang.reflect.Constructor;

/**
 * @Author Dowlath
 * @create 5/13/2020 7:30 AM
 */

// Singleton class.....
class Singleton{
    public static Singleton instance = new Singleton();

    private Singleton(){
        // private constructor
    }
}

public class UsingReflectionBreaksSingleton {
    public static void main(String[] args) {
        Singleton instance_1 = Singleton.instance;
        Singleton instance_2 = null;
        try{
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for(Constructor constructor : constructors){
                // below code destroying singleton pattern
                constructor.setAccessible(true);
                instance_2 = (Singleton) constructor.newInstance();
                break;
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("instance_1 hashcode()  value ... : " + instance_1.hashCode());
        System.out.println("instance_2 hashcode()  value ... : " + instance_2.hashCode());
    }
}

/*
    To overcome Reflection issue, will use enum and resolve.

    //Java program for Enum type singleton
    public enum Singleton
    {
      INSTANCE;
    }

 */