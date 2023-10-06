package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ObserverPatternExample {
    public static void main(String[] args){

        ConcreteSubject subject  = new ConcreteSubject();

        ConcreteObserver observer1  = new ConcreteObserver("Observer 1");

        ConcreteObserver observer2 = new ConcreteObserver("Observer 2");

        subject.addObserver(observer1);
        subject.addObserver(observer2);

        subject.setState("New state");
    }
}