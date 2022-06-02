package lectures;


import org.junit.Test;

import java.util.Arrays;

public class Lecture9 {

  @Test
  public void reduce() throws Exception {
    Integer[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
int sum= Arrays.stream(integers)
        .reduce(0, (i,j)-> i+ j);
    System.out.println(sum);
    
int max= Arrays.stream(integers)
        .reduce(0,Integer::max);
    System.out.println(max);

    int sum2 = Arrays.stream(integers).reduce(0, Integer::sum);
    System.out.println(sum2);

  }


}

