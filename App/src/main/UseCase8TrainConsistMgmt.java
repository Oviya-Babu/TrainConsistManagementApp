package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UseCase8TrainConsistMgmt {

    // Bogie class
    public static class Bogie {
        private String name;
        private int capacity;

        public Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }
    }

    // Business Logic Method (IMPORTANT for testing)
    public static List<Bogie> filterBogies(List<Bogie> bogies, int threshold) {
        return bogies.stream()
                .filter(b -> b.getCapacity() > threshold)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        System.out.println("========================================");
        System.out.println(" UC8 - Filter Passenger Bogies ");
        System.out.println("========================================\n");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("All Bogies:");
        bogies.forEach(b -> 
            System.out.println(b.getName() + " -> " + b.getCapacity())
        );

        List<Bogie> filtered = filterBogies(bogies, 60);

        System.out.println("\nFiltered Bogies (Capacity > 60):");
        filtered.forEach(b -> 
            System.out.println(b.getName() + " -> " + b.getCapacity())
        );

        System.out.println("\nUC8 filtering completed...");
    }
}