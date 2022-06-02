package lectures;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Lecture11 {

  @Test
  public void joiningStrings() throws Exception {
    List<String> names = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin");
    int size = names.size();
    int j=0;
    StringBuilder joining = new StringBuilder();
    for(int i=0;i< size;i++){
      if(names.size()-1 > j){
      joining.append(names.get(i).toUpperCase()).append("|");
      j++;
      }
      else
        joining.append(names.get(i).toUpperCase());
    }
    System.out.println(joining);
  }

  @Test
  public void joiningStringsWithStream() throws Exception {
    String stringJoining = ImmutableList.of("anna", "john", "marcos", "helena", "yasmin")
            .stream()
            .map(String::toUpperCase)
            .collect(Collectors.joining("|"));
    System.out.println(stringJoining);
  }
}
