package design;

public class ObserverA extends Observer {

    public ObserverA(){
    }

    @Override
    public void update() {
        System.out.println("NO notifications are on");
    }

}
