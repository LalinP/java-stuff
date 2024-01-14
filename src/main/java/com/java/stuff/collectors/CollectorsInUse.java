package com.java.stuff.collectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.java.stuff.model.Person;
import lombok.var;

import static java.util.stream.Collectors.averagingDouble;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingDouble;

/**
 * Implementations of Collector that implement various useful reduction operations,
 * such as accumulating
 * elements into collections,
 * summarizing elements according to various criteria, etc.
 */
public class CollectorsInUse {

  public static void main(String [] args) {
    List<Person> personsList = new ArrayList<Person>();
    Person one = Person.builder()
        .salary(1001.00d)
        .age("35")
        .name("a")
        .department("Finance")
        .build();
    Person two = Person.builder()
        .salary(10001.00d)
        .age("36")
        .name("b")
        .department("Finance")
        .build();
    Person three = Person.builder()
        .salary(10001.00d)
        .age("46")
        .name("c")
        .department("Tech")
        .build();
    Person four = Person.builder()
        .salary(10001.00d)
        .age("26")
        .name("d")
        .department("Tech")
        .build();

    personsList.add(one);
    personsList.add(two);
    personsList.add(three);
    personsList.add(four);


  List<String> namesList = collectTheNamesToAList(personsList);
  namesList.forEach(System.out::println);

  //Treeset
    TreeSet<String> treeSet = collectNamesToTreeSet(personsList);
    treeSet.stream().forEach(System.out::println);

    //summing double
    double salaries = sumOfSalaries(personsList);
    System.out.println(salaries);

    //Grouping by
    Map map = groupEmployeesByDept(personsList);
    map.keySet().forEach(key -> System.out.println(key + ":"+  map.get(key)));

    //Group by dept and salary
    Map deptAndSal = groupSalariesByDept(personsList);
    deptAndSal.keySet().stream().forEach(k -> System.out.println(k + ":" +  deptAndSal.get(k)));

    // partition by high sal
    Map sal = partitionBySal(personsList);
    sal.keySet().stream().forEach(key -> System.out.println(key + ":" + sal.get(key) ));

    //averaging salaries
    double doub = averagingDoubleSalary(personsList);
    System.out.println(doub);

    //a verage salaries by dept
    var mapAvgSal = groupAverageSalariesByDept(personsList);
    mapAvgSal.keySet().stream().forEach(key -> System.out.println(key + ":" + mapAvgSal.get(key)));
  }

  private static void printNames(List<Person> personList) {
     personList.stream().map(Person::getName).forEach(System.out::println);
  }
  private static List<String> collectTheNamesToAList(List<Person> personList) {
    return personList.stream()
        .map(Person::getName).collect(Collectors.toList());
  }

  // Accumulate names into a TreeSet
  private static TreeSet<String> collectNamesToTreeSet(List<Person>personList) {
    return personList.stream()
        .map(Person::getName)
        .collect(Collectors.toCollection(TreeSet::new));
  }

// Compute sum of salaries of employee
  private static double sumOfSalaries(List<Person> personList) {
    return personList
        .stream()
        .collect(summingDouble(Person::getSalary));
  }

  //Group employees by dept
  private static Map<String, List<Person>> groupEmployeesByDept(List<Person> personList) {
    return personList
        .stream()
        .collect(groupingBy(Person::getDepartment));
  }

  // Compute sum of salaries by department
  private static Map<String, Double> groupSalariesByDept(List<Person> personList) {
    return personList
        .stream()
        .collect(groupingBy(Person::getDepartment, Collectors.summingDouble(Person::getSalary)));
  }

  private static Map<String, Double> groupAverageSalariesByDept(List<Person> personList) {
    return personList
        .stream()
        .collect(groupingBy(Person::getDepartment, Collectors.averagingDouble(Person::getSalary)));
  }
  //partition employees based on high salary benchmark

  private static Map<Boolean , List<Person>> partitionBySal(List<Person> personList) {
    return personList
        .stream()
        .collect(Collectors.partitioningBy(person -> person.getSalary() > 6000.00));
  }

  //Averaging double
  private static double averagingDoubleSalary(List<Person> personList) {
    return personList
        .stream()
        .collect(averagingDouble(Person::getSalary));
  }

}
