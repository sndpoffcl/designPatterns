package design;

public class ObserverB extends Observer {

    public ObserverB( ){
    }

    @Override
    public void update() {
        System.out.println("All notifications are on");
    }
}
