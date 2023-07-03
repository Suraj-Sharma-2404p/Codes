package behavioralDP.ObserverDP;

public class Implementation {
    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Observer observer1 = new MyTopicSubscriber("obj1");
        Observer observer2 = new MyTopicSubscriber("obj2");
        Observer observer3 = new MyTopicSubscriber("obj3");

        //registering observer to the subject
        topic.register(observer1);
        topic.register(observer2);
        topic.register(observer3);


        //attach observer to subject
        observer1.setSubject(topic);
        observer2.setSubject(topic);
        observer3.setSubject(topic);

        //check if update is available
        observer1.update();

        //now send message to subject
        topic.postMessage("New message");
    }
}
