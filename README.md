# 🚆 Train Consist Management App

## 📌 Overview
The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train’s consist — a collection of bogies attached to an engine.

The application supports:
- Passenger bogies (Sleeper, AC Chair, First Class)
- Goods bogies (Rectangular, Cylindrical)
- Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces Java concepts through real-world railway scenarios.

---

## 🎯 Use Case: UC7 – Sort Bogies by Capacity (Comparator)

### 📖 Description
This use case demonstrates how to sort bogies based on their **seating capacity** using a **custom Comparator**.

Instead of just storing data, the system now enables:
- Ranking bogies by capacity
- Comparing different classes
- Supporting planning and reporting

---

## ⚠️ Drawback of UC6
- Data stored using `HashMap`
- ❌ No ordering of bogies
- ❌ No ranking or comparison
- ❌ Difficult for planning and analysis

---

## 🎯 Goal
To sort passenger bogies based on their **capacity** using `Comparator`.

---

## 👤 Actor
**User**

---

## 🔄 Flow of Execution
1. User runs the program
2. Bogie objects are created
3. Bogies are stored in a list
4. Comparator is applied
5. Bogies are sorted by capacity
6. Sorted list is displayed

---

## 🧠 Key Concepts Used

- **Comparator Interface**
  - Custom sorting logic

- **Custom Class (Bogie)**
  - Stores name and capacity

- **List Collection**
  - Stores multiple bogie objects

- **sort()**
  - Applies sorting logic

- **Lambda Expression**
  - Simplifies comparator definition

- **Separation of Data & Logic**
  - Improves code design

---

## ✅ Key Requirements

- Create a `Bogie` class with:
  - name
  - capacity
- Create `List<Bogie>`
- Add bogies:
  - Sleeper → 72
  - AC Chair → 56
  - First Class → 24
- Use `Comparator.comparingInt()`
- Sort and display bogies

---

## 💻 Sample Code

```java
import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String toString() {
        return name + " -> " + capacity;
    }
}

public class TrainConsistUC7 {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));

        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}