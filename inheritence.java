class vehicle{
    int id;
    String color;
    void show(){
        System.out.println("Vehicle color:"+this.color);
        System.out.println("ID:"+this.id);
    }
}

class Car extends vehicle{
    void run(){
        System.out.println("Brrrmmmmrmrmrm");
    }
}
public class inheritence {
    public static void main (String[] args){
        Car c1=new Car();
        c1.run();
        c1.color="red";
        c1.show();
        c1.id=001;
    }
}
