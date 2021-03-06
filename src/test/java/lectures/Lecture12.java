package lectures;

import beans.Person;
import mockdata.MockData;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Lecture12 {
  @Test
  public void understandingCollect() throws Exception {
    List<String> emails = MockData.getPeople()
        .stream()
        .map(Person::getEmail)
        .collect(
            ArrayList::new,
            ArrayList::add,
            (list1, list2) -> list1.addAll(list2));
//        .collect(Collectors.toList());

    emails.forEach(System.out::println);
  }
}
