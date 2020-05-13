package io.dowlath.designpatterns.singleton.Serializable.Overcome;

import java.io.*;

/**
 * @Author Dowlath
 * @create 5/13/2020 8:02 AM
 */

class Singleton implements Serializable{
    public static Singleton instance = new Singleton();

    private Singleton(){

    }
    // Implement readResolve method.
    protected Object readResolve(){
        return instance;
    }
}
public class OverComeSerializationBreaksSingletonIssue {
    public static void main(String[] args) {
        try{
            Singleton instance_1 = Singleton.instance;

            //Serialization
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(instance_1);
            out.close();

            // Deserialization
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
            Singleton instance_2 = (Singleton)in.readObject();
            in.close();

            // returns hashcode same for two objects.
            System.out.println("instance_1 hashCode ... : "+instance_1.hashCode());
            System.out.println("instance_2 hashCode ... : "+instance_2.hashCode());

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
