import java.util.LinkedList;
import java.util.List;

public class linkedlListMain {
    public static void main(String[] args) {
        Person person = new Person(1);
        Person pers = new Person(3);
        List<Person> list = new LinkedList<Person>();
        list.add(person);
        list.add(pers);
        for (Person p : list) {
            System.out.println(p.getId());
        }
        list.remove(0);
        for (Person p : list) {
            System.out.println(p.getId());
        }
    }
}
