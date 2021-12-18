package design;

public class ObserverDemo {
    public static void main(String[] args) {
        Subject techChannel = new Subject();
        Subject educationChannel = new Subject();

        ObserverA personA = new ObserverA();
        ObserverB personB = new ObserverB();
        personA.addSubject(techChannel);
        personA.addSubject(educationChannel);
        personB.addSubject(techChannel);
        personB.addSubject(educationChannel);
        techChannel.setNoOfPosts(1);
        educationChannel.setNoOfPosts(2);
    }
}
