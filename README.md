# 🚆 Train Consist Management App

## 📌 Overview
The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train’s consist — a collection of bogies attached to an engine.

The application supports:
- Passenger bogies (Sleeper, AC Chair, First Class)
- Goods bogies (Rectangular, Cylindrical)
- Tracking composition, capacity, cargo types, and safety compliance

Each use case introduces Java concepts through real-world railway scenarios.

---

## 🎯 Use Case: UC6 – Map Bogie to Capacity (HashMap)

### 📖 Description
This use case demonstrates how to associate each bogie with its **capacity** using a key–value mapping structure (`HashMap`).

This allows the system to store and retrieve **operational data** such as:
- Seating capacity (passenger bogies)
- Load capacity (goods bogies)

---

## ⚠️ Drawback of UC5
- Stored only bogie names
- ❌ No way to associate capacity
- ❌ Cannot perform validation or analysis
- ❌ No attribute mapping

---

## 🎯 Goal
To map each bogie to its **capacity** using `HashMap`.

---

## 👤 Actor
**User**

---

## 🔄 Flow of Execution
1. User runs the program
2. Bogie-capacity mapping is created
3. Data is inserted into `HashMap`
4. System iterates through entries
5. Bogie capacities are displayed
6. Specific capacity lookup is performed

---

## 🧠 Key Concepts Used

- **HashMap**
  - Stores key–value pairs

- **Map Interface**
  - Defines mapping between keys and values

- **put()**
  - Inserts bogie and capacity

- **get()**
  - Retrieves capacity using bogie name

- **entrySet()**
  - Iterates over key–value pairs

- **Fast Lookup**
  - Constant-time access using keys

---

## ✅ Key Requirements

- Create `HashMap<String, Integer>`
- Add bogies:
  - Sleeper → 72
  - AC Chair → 60
  - First Class → 24
- Use `put()` for insertion
- Iterate using `entrySet()`
- Display bogie and capacity

---

## 💻 Sample Code

```java
import java.util.HashMap;
import java.util.Map;

public class TrainConsistUC6 {
    public static void main(String[] args) {

        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}