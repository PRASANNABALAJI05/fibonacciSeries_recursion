# fibonacciSeries_recursion

---

# 🔢 Java Fibonacci Series (Recursive)

This simple Java program prints the Fibonacci series using **recursion**. It starts with the first two numbers (0 and 1) and prints the rest of the sequence up to a given count.

---

## ✅ Features

* Uses **recursive method** to generate the Fibonacci sequence
* Prints the series up to a specified number of terms
* Easy to understand and modify for learning purposes

---

## 📌 What is the Fibonacci Series?

The Fibonacci sequence is a series of numbers where:

```
F(n) = F(n-1) + F(n-2)
```

Starting values:

```
F(0) = 0, F(1) = 1
```

Example for first 10 terms:

```
0 1 1 2 3 5 8 13 21 34
```

---

## 🧾 Code Structure

* **Static variables** to store intermediate Fibonacci values
* A **recursive function** `fibbonacciSeries()` to compute the sequence
* Main method initializes the count and starts the sequence

---

## 🏁 How to Run

1. Save the code in a file named `Main.java`
2. Compile it using:

   ```bash
   javac Main.java
   ```
3. Run the compiled program:

   ```bash
   java Main
   ```

---

## 💡 Sample Output

```
0 1 1 2 3 5 8 13 21 34
```

---

## 🚀 Customize

Change this line to print more or fewer terms:

```java
int count = 10;
```

---
