# 📄 Description

This project consists of two exercises focused on creating classes in Java that utilize generics and demonstrate method functionality. The exercises are as follows:

- **Exercise 1:** Implement a class called `NoGenericMethods` that stores three arguments of the same type, providing methods for storing and retrieving these objects, along with a constructor that allows for arguments to be passed in any order.
- **Exercise 2:** Create a `Person` class with attributes such as first name, last name, and age. Additionally, implement a class called `GenericMethods` with a generic method that accepts three arguments of any type and prints them, demonstrating the use of generics with different parameter types.

## 💻 Technologies Used

- Java JDK 22
- IntelliJ IDEA or Eclipse
- Maven (optional)

## 📋 Requirements

- JDK 22 or higher installed.
- IntelliJ IDEA or Eclipse, or any other Java-compatible IDE.
- Maven dependencies configured (if using Maven).

## 🛠️ Installation

1. Clone the repository to your local machine using the command:
   ```bash
   git clone https://github.com/CatalinBarsan/1.6-Generics.git
   ```
2. Navigate to the project directory:
   ```bash
   cd your-project-name
   ```
3. If using Maven, run the following command to download dependencies:
   ```bash
   mvn install
   ```

## ▶️ Execution

To execute the exercises, follow these steps:

1. Open the project in your IDE.
2. Run the main classes for `NoGenericMethods` and `GenericMethods` to demonstrate their functionality.
3. Observe the output in the console to verify that the methods are working as intended.

## 🌐 Deployment

To deploy the project in a production environment, follow these steps:

1. Ensure all dependencies are correctly installed.
2. Compile the project using:
   ```bash
   mvn clean package
   ```
3. Copy the resulting JAR file to the production server and run it with:
   ```bash
   java -jar <file-name>.jar
   ```

## 🤝 Contributions

If you want to contribute to this project, follow these steps:

1. Fork the repository.
2. Create a new branch for your changes:
   ```bash
   git checkout -b my-new-feature
   ```
3. Make your changes and commit:
   ```bash
   git commit -m 'Added a new feature'
   ```
4. Push your branch to the remote repository:
   ```bash
   git push origin my-new-feature
   ```
5. Create a Pull Request to have your changes reviewed.