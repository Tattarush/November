package day041125.task1;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем издателя
        NewsPublisher publisher = new NewsPublisher();

        // Создаем двух подписчиков с разными именами
        Person andrey = new Person("Андрей");
        Person boris = new Person("Борис");

        // Подписываем их на новости
        publisher.addSubscriber(andrey);
        publisher.addSubscriber(boris);

        // Оповещаем всех подписчиков о новой новости
        publisher.notifySubscribers("Обновление курса Java!");
    }
}

interface Subscriber {
    void update(String news);
}

class NewsPublisher {
    private List<Subscriber> subscriberList = new ArrayList<>();

    void addSubscriber(Subscriber subscriber) {
        subscriberList.add(subscriber);
    }

    void removeSubscriber(Subscriber subscriber) {
        subscriberList.remove(subscriber);
    }

    void notifySubscribers(String news) {
        for (Subscriber subscriber : subscriberList) {
            subscriber.update(news);
        }
    }
}

class Person implements Subscriber {
    String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " получил новость: " + news);
    }
}