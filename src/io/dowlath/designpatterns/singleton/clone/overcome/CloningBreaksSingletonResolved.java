package io.dowlath.designpatterns.singleton.clone.overcome;

/**
 * @Author Dowlath
 * @create 5/13/2020 8:21 AM
 */

class SuperClass implements Cloneable{
    int d = 10;
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Singleton extends SuperClass{
    public static Singleton instance = new Singleton();
    private Singleton(){
        // private constructor
    }
    protected Object clone() throws CloneNotSupportedException{
        return instance;
    }
}

public class CloningBreaksSingletonResolved {
    public static void main(String[] args) throws CloneNotSupportedException{
        Singleton instance_1 = Singleton.instance;
        Singleton instance_2 = (Singleton) instance_1.clone();

        // returning same hashcode for both objects.
        System.out.println("instance_1 hashCode ... : "+ instance_1.hashCode());
        System.out.println("instance_2 hashCode ... : "+ instance_2.hashCode());
    }
}
