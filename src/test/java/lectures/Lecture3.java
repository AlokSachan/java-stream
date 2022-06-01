package lectures;

import com.google.common.collect.ImmutableList;
import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

import static org.assertj.core.api.Assertions.assertThat;

public class Lecture3 {

  @Test
  public void min() throws Exception {
    Integer min = ImmutableList.of(10, 2, 3, 100, 23, 93, 99, 1, 20)
            .stream()
            .min(Comparator.naturalOrder())
            .get();
    assertThat(min).isEqualTo(1);
  }

  @Test
  public void max() throws Exception {
    Integer max= ImmutableList.of(1, 2, 3, 100, 23, 93, 99)
            .stream().max(Comparator.naturalOrder())
            .get();
    assertThat(max).isEqualTo(100);
  }
}
