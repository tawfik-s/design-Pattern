package Singleton;

public class Main {
    public static void main(String[] args) {


        SingleObject object = SingleObject.getInstance();
        object.setName("tawfik");
        object.showMessage();

        //data in any object from the same class will not change.

        SingleObject object2=SingleObject.getInstance();
        object2.showMessage();

    }
}
