# Magical Arena

In the Magical Arena, players engage in turn-based combat where they roll dice to determine attack and defense outcomes. Damage inflicted by an attacking player, calculated by multiplying their attack value with the attacking dice roll, is mitigated by the defending player's strength multiplied by the defending dice outcome, ultimately reducing the defender's health until one player's health reaches zero, ending the game.

## Tech Stack

Java

## Run Locally

1.Download and unzip the repository

2.Navigate to the project directory

```bash
  cd my-project
```

3.Compile the Java Source Code

```bash
  javac src/main/java/Main.java
```

4.Run the Application

```bash
  java -cp src/main/java Main
```

5.Follow the On-Screen Instructions

**Note:** Make sure you have Java Development Kit (JDK) installed on your system.

## Running Tests

**Note:** In this project I did not use any third-party libraries to test the code, all the testing is done manually

To run tests, follow these steps in the command line

1.Compile the test class you want to run with the main class

```bash
  javac src/main/java/<package_name>/<class_name>.java
  javac src/test/java/<package_name>/<test_class_name>.java
```

2.Run the test class

```bash
  java src.test.java.<package_name>.<test_class_name>.java
```

## Authors

- [@jailorx](https://www.github.com/jailorx)
