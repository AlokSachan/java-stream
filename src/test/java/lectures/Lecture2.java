package lectures;

import beans.Person;
import mockdata.MockData;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Lecture2 {

  @Test
  public void range() throws Exception {
    System.out.println("for i");
    for (int i = 0; i <= 10; i++) {
      System.out.println(i);
    }
    System.out.println("Using IntStream Inclusive");
    IntStream.range(0, 10)
            .boxed()
            .collect(Collectors.toList())
            .forEach(System.out::print);

    System.out.println("Using IntStream Exclusive");
    IntStream.rangeClosed(0, 10)
            .boxed()
            .collect(Collectors.toList())
            .forEach(System.out::print);
  }

  @Test
  public void rangeIteratingLists() throws Exception {

    List<Person> people = MockData.getPeople();
    IntStream.range(0, people.size())
        .forEach(
            index -> {
              Person person = people.get(index);
              System.out.println(person);
            });
  }

  @Test
  public void intStreamIterate() throws Exception {

    IntStream.iterate(0, module -> module + 1)
            .filter(input-> input %2 ==0)
            .limit(10)
            .forEach(System.out::println);
  }
}
