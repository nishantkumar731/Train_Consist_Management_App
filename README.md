# 🚆 Train Consist Management App

## 📌 Overview
The **Train Consist Management App** is a console-based Java application that simulates how a railway system manages a train’s consist — a collection of bogies attached to an engine.

The application supports:
- Passenger bogies (Sleeper, AC Chair, First Class)
- Goods bogies (Rectangular, Cylindrical)
- Tracking composition, capacity, and safety compliance

Each use case introduces core Java concepts through real-world scenarios.

---

## 🎯 Use Case: UC3 – Track Unique Bogie IDs (Set – HashSet)

### 📖 Description
This use case introduces the **Set data structure** to ensure that each bogie has a **unique ID**, preventing duplication errors in train management.

---

## ⚠️ Drawback of UC2
- Used `ArrayList`, which allows duplicate values
- Duplicate bogie IDs can occur (e.g., `BG101, BG101`)
- Leads to incorrect train composition and data inconsistency

---

## 🎯 Goal
Ensure that **no duplicate bogie IDs** are added by using `HashSet`.

---

## 👤 Actor
**User**

---

## 🔄 Flow of Execution
1. User runs the program
2. User adds bogie IDs (including duplicates)
3. System inserts IDs into `HashSet`
4. Duplicate IDs are automatically ignored
5. Unique bogie IDs are displayed

---

## 🧠 Key Concepts Used

- **Set Interface**
  - Collection that does not allow duplicates

- **HashSet**
  - Implements Set using hashing
  - Stores unique elements

- **add()**
  - Inserts elements into the set

- **Automatic Deduplication**
  - Duplicate values are ignored automatically

- **Unordered Storage**
  - No index-based storage

---

## ✅ Key Requirements

- Create `HashSet<String>` for bogie IDs
- Add duplicate values intentionally
- Display the final set
- Verify duplicates are removed automatically

---

## 💻 Sample Code

```java
import java.util.HashSet;

public class TrainConsistUC3 {
    public static void main(String[] args) {

        // Step 1: Create HashSet for bogie IDs
        HashSet<String> bogieIDs = new HashSet<>();

        // Step 2: Add bogie IDs (with duplicates)
        bogieIDs.add("BG101");
        bogieIDs.add("BG102");
        bogieIDs.add("BG103");
        bogieIDs.add("BG101"); // Duplicate
        bogieIDs.add("BG102"); // Duplicate

        // Step 3: Display unique bogie IDs
        System.out.println("Unique Bogie IDs:");
        System.out.println(bogieIDs);
    }
}
