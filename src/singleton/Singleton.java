package singleton;

/**
 * Created by Administrator on 26.02.2015.
 *
 * Like in web projects, u need only 1 connection to the server, this template do this for u!
 * If there are 2 connections at the same time, first will be continue and only after first will be closed, second opens.
 */
public class Singleton {

    // static class that has static final HOLDER_INSTANCE type of Singleton that returns new Singleton
    public static class SingletonHolder{
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }

    // Method that returns static field of class SingletonHolder
    public static Singleton getInstance(){
        return SingletonHolder.HOLDER_INSTANCE;
    }

    // Private constructor makes possible to create object (Singleton obj = new Singleton) only in this class.
    private Singleton(){
        System.out.println("Worker[singleton]");
    }
    
}
