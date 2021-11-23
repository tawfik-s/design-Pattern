package Singleton;

public class SingleObject {

        //create an object of SingleObject
        private static SingleObject instance = new SingleObject();
        private String name="";
        //make the constructor private so that this class cannot be
        //instantiated
        private SingleObject(){}  //the class cannot be initiated
        //Get the only object available
        public static SingleObject getInstance(){
            return instance;
        }

        public void setName(String name) {
                this.name = name;
        }

        public void showMessage(){
            System.out.println("you are welcome "+name);
        }
}
