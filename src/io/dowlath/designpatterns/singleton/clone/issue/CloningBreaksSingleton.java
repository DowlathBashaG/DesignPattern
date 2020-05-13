package io.dowlath.designpatterns.singleton.clone.issue;

/**
 * @Author Dowlath
 * @create 5/13/2020 8:13 AM
 */
class SuperClass implements Cloneable{
    int i= 10;
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

class Singleton extends SuperClass{
    public static Singleton instance = new Singleton();
    private Singleton(){
        // private constructor
    }
}

public class CloningBreaksSingleton {
    public static void main(String[] args) throws CloneNotSupportedException {
        Singleton instance_1 = Singleton.instance;
        Singleton instance_2 = (Singleton)instance_1.clone();

        // Breaks singleton and giving two different hashcode's
        System.out.println("instance_1 hashCode ... : "+ instance_1.hashCode());
        System.out.println("instance_2 hashCode ... : "+ instance_2.hashCode());
    }
}
