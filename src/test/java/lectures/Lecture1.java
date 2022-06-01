package lectures;

import beans.Person;
import mockdata.MockData;
import org.assertj.core.util.Lists;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;


public class Lecture1 {


  @Test
  public void imperativeApproach() throws IOException {
    List<Person> people = MockData.getPeople();
    List<Person> youngPeople= Lists.newArrayList();
    int counter =0;
for(Person person: people){
  if(person.getAge() <= 18 && counter<10){
    youngPeople.add(person);
    counter++;
  }
}

int peopleCounter=1;
    for (Person young : youngPeople) {
      System.out.println(peopleCounter + " : person  ->  "+young);
      peopleCounter++;
    }
  }

  @Test
  public void declarativeApproachUsingStreams() throws Exception {
    MockData.getPeople()
            .stream()
            .filter(person -> person.getAge() <=18)
            .limit(10)
            .collect(Collectors.toList())
            .forEach(person-> System.out.println(person));
  }
}
