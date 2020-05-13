package io.dowlath.designpatterns.singleton.Serializable.issue;

import java.io.*;

class Singleton implements Serializable{
    public static Singleton instance = new Singleton();
    private Singleton(){
        // private constructor
    }
}
public class SerializationBreaksSingleton {
    public static void main(String[] args) {
        try{
            // Serialization
            Singleton instance_1 = Singleton.instance;
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
            out.writeObject(instance_1);
            out.close();

            // Deserialization
            ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
            Singleton instance_2 = (Singleton)in.readObject();
            in.close();

            // Both hashcodes are different
            System.out.println("instance_1 hashCode  :  "+instance_1.hashCode());
            System.out.println("instance_2 hashCode  :  "+instance_2.hashCode());
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
