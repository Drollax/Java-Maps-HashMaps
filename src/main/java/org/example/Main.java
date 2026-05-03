package org.example;


import org.example.entity.Employee;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(1, "Kiana", "Kaslana"));
        employees.add(new Employee(2, "Mei", "Raiden"));
        employees.add(new Employee(3, "Bronya", "Zaychik"));
        employees.add(new Employee(3, "Bronya", "Zaychik"));
        employees.add(new Employee(3, "Bronya", "Zaychik"));





    }

    public static List<Employee> findDuplicates(List<Employee> employees){
        Set<Employee> first = new HashSet<>();
        List<Employee> duplicate = new ArrayList<>();

        for (Employee employee : employees){
            if (employee == null) continue;

            if(!first.add(employee)){
                duplicate.add(employee);
            }
        }
        return duplicate;
    }

    public static Map<Integer, Employee> findUniques(List<Employee> employees){

        Map<Integer, Employee> map = new HashMap<>();

        for (Employee e : employees) {

            if(e == null) continue;

            if (!map.containsKey(e.getId())) {
                map.put(e.getId(), e);
            }
        }

        return map;
    }

    public static List<Employee> removeDuplicates(List<Employee> employees){
        Set<Employee> seen = new HashSet<>();
        Set<Employee> duplicate = new HashSet<>();

        for (Employee e : employees){
            if(e == null) continue;
            if(!seen.add(e)){
                duplicate.add(e);
            }
        }
        List<Employee> result = new ArrayList<>();
        for(Employee e : employees){
            if (e == null) continue;
            if(!duplicate.contains(e)){
                result.add(e);
            }
        }
        return result;
    }
}