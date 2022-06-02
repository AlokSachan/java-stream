package lectures;

import beans.Person;
import mockdata.MockData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {

    MockData.getPeople().stream()
        .map(Person::getEmail)
        .collect(
            () -> new ArrayList<String>(),
            (list, element) -> list.add(element.toUpperCase()),
            (list1, list2) -> list1.addAll(list2))
        .forEach(System.out::println);
  }
}
