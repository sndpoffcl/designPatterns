package design;

public class Singleton {
    //there should be only one object for Singleton

    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getObject(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj = Singleton.getObject();
        System.out.println(obj);
        Singleton obj2 = Singleton.getObject();
        System.out.println(obj2);
    }
}
