# 🚆 Train Consist Management App

**(Core Java + Data Structures Learning Project)**

---

## 📌 Overview

The **Train Consist Management App** is a console-based Java application that simulates how railway systems manage a train consist, which is the collection of passenger and goods bogies attached to an engine.

This project was built as a **step-by-step learning journey**. Each use case introduces a new Java concept, collection type, algorithm, validation rule, or exception-handling technique, and applies it to a realistic railway scenario.

The project now covers everything from **basic train initialization** to **grouping, aggregation, regex validation, safety compliance, performance benchmarking, sorting, searching, and fail-fast exception handling**.

---

## 🎯 Objective

- Apply **Core Java concepts** in a practical, real-world style project
- Understand **data structures and algorithms** through railway-based scenarios
- Build a **clean, scalable, and maintainable design**
- Move from **basic coding** to **problem-solving and system-thinking**
- Learn both **manual logic implementation** and **optimized library-based approaches**

---

## 🧠 Learning Approach

Each use case introduces:

- A **real-world railway problem**
- A **limitation in the previous approach**
- A **new concept, collection, algorithm, or validation rule**
- A **better and more robust solution**

This creates a natural progression from foundational Java to more advanced topics like streams, regex, benchmarking, exception handling, and search/sort optimization.

---

## 📚 Use Cases Covered

### 🔹 UC1 – Initialize Train Consist

- Introduced: `Class`, `main()`, `ArrayList`
- Created an empty train consist
- Displayed the initial train state
- Built the foundation for all later operations

---

### 🔹 UC2 – Add Passenger Bogies

- Introduced: `ArrayList` CRUD operations
- Used:
  - `add()`
  - `remove()`
  - `contains()`
- Added and managed passenger bogies dynamically

---

### 🔹 UC3 – Unique Bogie IDs

- Introduced: `HashSet`
- Prevented duplicate bogie IDs
- Demonstrated uniqueness enforcement automatically

---

### 🔹 UC4 – Ordered Train Structure

- Introduced: `LinkedList`
- Simulated real-world train chaining behavior
- Used:
  - `addFirst()`
  - `addLast()`
  - `add(index)`
  - `removeFirst()`
  - `removeLast()`
- Showed how ordered insertion and removal work in a train-like structure

---

### 🔹 UC5 – Ordered + Unique Bogies

- Introduced: `LinkedHashSet`
- Maintained:
  - Insertion order
  - Uniqueness
- Combined the benefits of ordered storage and duplicate prevention

---

### 🔹 UC6 – Bogie Capacity Mapping

- Introduced: `HashMap`
- Stored:
  - `Bogie ID -> Capacity`
- Enabled fast lookup of bogie details
- Demonstrated key-value based storage

---

### 🔹 UC7 – Sort Bogies by Capacity

- Introduced:
  - `Comparator`
  - `Lambda Expressions`
- Sorted bogies using business rules
- Demonstrated custom sorting logic using Java features

---

### 🔹 UC8 – Filter Bogies using Stream API

- Introduced:
  - `Stream API`
  - `filter()`
- Filtered bogies based on capacity conditions
- Replaced manual filtering loops with declarative logic

---

### 🔹 UC9 – Group Bogies by Type

- Introduced:
  - `Collectors.groupingBy()`
- Converted:
  - `List<Bogie> -> Map<String, List<Bogie>>`
- Grouped bogies by category for better reporting and organization

---

### 🔹 UC10 – Count Total Seats in Train

- Introduced:
  - `map()`
  - `reduce()`
  - `Integer::sum`
- Aggregated seating capacities into a single total
- Demonstrated how grouped or listed data can be converted into useful analytics
- Showed how functional aggregation replaces manual summation loops

---

### 🔹 UC11 – Validate Train ID and Cargo Code using Regex

- Introduced:
  - `Pattern`
  - `Matcher`
  - `matches()`
  - Regular Expressions
- Validated formats like:
  - Train ID → `TRN-1234`
  - Cargo Code → `PET-AB`
- Enforced strict input format rules
- Improved data integrity before processing

---

### 🔹 UC12 – Safety Compliance Check for Goods Bogies

- Introduced:
  - `allMatch()`
  - Lambda-based validation rules
  - Stream-based conditional checks
- Enforced the business rule:
  - `Cylindrical -> only Petroleum allowed`
- Marked a train as safe only if all bogies obey safety constraints
- Demonstrated declarative business rule enforcement

---

### 🔹 UC13 – Performance Comparison (Loops vs Streams)

- Introduced:
  - `System.nanoTime()`
  - Basic benchmarking
- Compared:
  - Loop-based filtering
  - Stream-based filtering
- Measured execution time instead of assuming performance
- Encouraged evidence-driven optimization

---

### 🔹 UC14 – Handle Invalid Bogie Capacity using Custom Exception

- Introduced:
  - Custom checked exception
  - `throw`
  - `throws`
- Created `InvalidCapacityException`
- Prevented creation of passenger bogies when capacity was less than or equal to zero
- Applied fail-fast validation at object construction time

---

### 🔹 UC15 – Safe Cargo Assignment using try-catch-finally

- Introduced:
  - Custom runtime exception
  - `try-catch-finally`
- Created `CargoSafetyException`
- Enforced runtime cargo rules such as:
  - `Rectangular bogie cannot carry Petroleum`
- Prevented crashes and ensured graceful handling during runtime assignment
- Used `finally` for guaranteed completion/logging behavior

---

### 🔹 UC16 – Sort Passenger Bogies by Capacity using Bubble Sort

- Introduced:
  - Bubble Sort
  - Nested loops
  - Swapping logic
  - Array-based sorting fundamentals
- Sorted passenger bogie capacities manually without library methods
- Helped understand how sorting works internally
- Highlighted algorithmic thinking and `O(n²)` behavior

---

### 🔹 UC17 – Sort Bogie Names using Arrays.sort()

- Introduced:
  - `Arrays.sort()`
  - `Arrays.toString()`
  - Natural ordering
- Sorted bogie type names alphabetically using Java’s built-in optimized sorting utility
- Showed the transition from manual algorithms to production-friendly library methods
- Reinforced the difference between learning internals and using optimized utilities

---

### 🔹 UC18 – Linear Search for Bogie ID

- Introduced:
  - Linear Search
  - Sequential traversal
  - `equals()` for string comparison
- Searched for bogie IDs in unsorted data
- Returned whether a bogie exists or not
- Demonstrated early termination when a match is found
- Highlighted `O(n)` search complexity

---

### 🔹 UC19 – Binary Search for Bogie ID

- Introduced:
  - Binary Search
  - Divide-and-conquer strategy
  - `low`, `high`, `mid`
  - `compareTo()`
- Performed efficient searching on sorted data
- Sorted input before searching when required
- Reduced search space repeatedly to achieve `O(log n)` performance
- Demonstrated the value of sorted-data preconditions

---

### 🔹 UC20 – Exception Handling During Search Operations

- Introduced:
  - Defensive programming
  - `IllegalStateException`
  - Fail-fast state validation
- Prevented search operations when the train had no bogies
- Threw an exception before invalid search logic could run
- Improved reliability and made system behavior explicit
- Demonstrated validation of system state before execution

---

## ✅ Concepts Covered Across the Project

This project includes hands-on implementation of:

- Core Java classes and objects
- Arrays and array manipulation
- ArrayList, LinkedList, HashSet, LinkedHashSet, HashMap
- Stream API operations:
  - `filter()`
  - `map()`
  - `reduce()`
  - `groupingBy()`
  - `allMatch()`
- Lambda expressions
- Comparator-based sorting
- Bubble Sort
- Arrays.sort()
- Linear Search
- Binary Search
- Regular Expressions
- Custom checked exceptions
- Custom runtime exceptions
- `try-catch-finally`
- Fail-fast validation
- Defensive programming
- Performance benchmarking with `System.nanoTime()`
- JUnit 5 based unit testing

---

## 🛠️ Technologies Used

- **Java (Core Java)**
- **Java Collections Framework**
- **Java Stream API**
- **Regular Expressions (Regex)**
- **JUnit 5** for testing
- **Git and GitHub**

---

## 🚀 How to Run

### Compile

```bash

java UseCase20TrainConsistMgmt
javac UseCase20TrainConsistMgmt.java

```

---


### 👩‍💻 Author

**Oviya Babu**  
B.Tech – Computer Science Engineering - Cybersecurity
SRM Institute of Science and Technology  

---

## 📌 Final Note

This project demonstrates that concepts like **data structures, algorithms, validation, and exception handling are not just theoretical**, but essential tools for building **real-world, reliable, and efficient systems**.

Through progressive use cases, this application evolves from basic Java programming to **advanced problem-solving, optimization, and defensive system design**, reflecting how modern software is actually developed.

It represents a complete journey from **learning syntax → understanding logic → applying engineering thinking**.
