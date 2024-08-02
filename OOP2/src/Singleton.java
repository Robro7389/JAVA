public class Singleton {
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton(); // This will allow the function to create only one object
        }

        //If they create more objects, it will refer them the same instance that is created already.
        return instance;
    }
}

