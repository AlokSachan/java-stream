package lectures;


import beans.Car;
import mockdata.MockData;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;

public class Lecture7 {

  @Test
  public void count() throws Exception {
    long male = MockData.getPeople()
            .stream()
            .filter(person -> person.getGender().equalsIgnoreCase("Male"))
            .count();
    System.out.println(male);
  }

  @Test
  public void min() throws Exception {
    double min = MockData.getCars()
            .stream()
            .filter(car -> car.getColor().equalsIgnoreCase("Yellow"))
            .mapToDouble(Car::getPrice)
            .min()
            .orElse(0);
    System.out.println(min);
  }

  @Test
  public void max() throws Exception {
    double max = MockData.getCars()
        .stream()
        .filter(car -> car.getColor().equalsIgnoreCase("yellow"))
        .mapToDouble(Car::getPrice)
        .max()
        .orElse(0);
    System.out.println(max);
  }


  @Test
  public void average() throws Exception {
    List<Car> cars = MockData.getCars();
//    ImmutableList<Car> cars = ImmutableList.of();
    double averagePrice = cars.stream()
        .mapToDouble(Car::getPrice)
        .average()
        .orElse(0);
    System.out.println(averagePrice);

  }

  @Test
  public void sum() throws Exception {
    double sum = MockData.getCars()
            .stream()
            .mapToDouble(Car::getPrice)
            .sum();
    System.out.println(sum);
  }

  @Test
  public void statistics() throws Exception {
    List<Car> cars = MockData.getCars();
    DoubleSummaryStatistics statistics = cars.stream()
        .mapToDouble(Car::getPrice)
        .summaryStatistics();
    System.out.println(statistics);
    System.out.println(statistics.getAverage());
    System.out.println(statistics.getCount());
    System.out.println(statistics.getMax());
    System.out.println(statistics.getMin());
    System.out.println(statistics.getSum());
  }


}