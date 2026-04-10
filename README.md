# 🚆 Train Consist Management App

## 📌 Overview
The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train’s consist — a sequence of bogies attached to an engine.

The application supports:
- Passenger bogies (Sleeper, AC Chair, First Class)
- Goods bogies (Rectangular, Cylindrical)
- Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces Java concepts through real-world railway scenarios.

---

## 🎯 Use Case: UC5 – Preserve Insertion Order of Bogies (LinkedHashSet)

### 📖 Description
This use case demonstrates how to maintain both:
- ✅ **Insertion order**
- ✅ **Uniqueness (no duplicates)**

using `LinkedHashSet`.

This ensures that the train formation reflects the **exact order of attachment** while preventing duplicate bogies.

---

## ⚠️ Drawback of UC4
- Used `LinkedList`, which maintains order
- ❌ Allows duplicate bogies
- ❌ No built-in constraint for uniqueness
- ❌ Does not enforce data integrity

---

## 🎯 Goal
To maintain **ordered and unique bogie formation** using `LinkedHashSet`.

---

## 👤 Actor
**User**

---

## 🔄 Flow of Execution
1. User runs the program
2. Bogies are added to the formation
3. Duplicate bogie is attempted
4. `LinkedHashSet` ignores duplicates
5. Final ordered formation is displayed

---

## 🧠 Key Concepts Used

- **LinkedHashSet**
    - Maintains insertion order + uniqueness

- **Set Interface**
    - Prevents duplicate elements

- **add()**
    - Inserts bogies into formation

- **Automatic Deduplication**
    - Ignores duplicate entries

- **Ordered Iteration**
    - Maintains sequence while printing

---

## ✅ Key Requirements

- Create `LinkedHashSet<String>`
- Add bogies:
    - Engine
    - Sleeper
    - Cargo
    - Guard
- Add duplicate bogie (e.g., Sleeper again)
- Display final formation
- Ensure no duplicates appear

---

## 💻 Sample Code

```java
import java.util.LinkedHashSet;

public class TrainConsistUC5 {
    public static void main(String[] args) {

        // Step 1: Create LinkedHashSet
        LinkedHashSet<String> train = new LinkedHashSet<>();

        // Step 2: Add bogies
        train.add("Engine");
        train.add("Sleeper");
        train.add("Cargo");
        train.add("Guard");

        // Step 3: Add duplicate
        train.add("Sleeper"); // Duplicate

        // Step 4: Display formation
        System.out.println("Final Train Formation:");
        System.out.println(train);
    }
}