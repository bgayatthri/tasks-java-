import java.util.*;
import java.time.*;

class Event {
    String name;
    LocalDate date;

    Event(String n, String d) {
        name = n;
        date = LocalDate.parse(d);
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Event> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
            list.add(new Event(sc.next(), sc.next()));

        int month = sc.nextInt();

        list.sort(Comparator.comparing(e -> e.date));

        list.forEach(e -> System.out.print(e.name + " "));
        System.out.println();

        System.out.println(list.get(0).name);           // Earliest
        System.out.println(list.get(n - 1).name);       // Latest

        list.stream()
            .filter(e -> e.date.getMonthValue() == month)
            .forEach(e -> System.out.print(e.name + " "));
    }
}
