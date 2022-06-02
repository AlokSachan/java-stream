package lectures;


import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class Lecture4 {

  @Test
  public void distinct() {
    List<Integer> integerList = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9)
            .stream().distinct()
            .collect(Collectors.toList());
    assertThat(integerList).hasSize(9);

  }

  @Test
  public void distinctWithSet() {
    Set<Integer> distinctNumbers = ImmutableList.of(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9)
            .stream()
            .collect(Collectors.toSet());
    assertThat(distinctNumbers).hasSize(9);
  }
}
