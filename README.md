# Webook Project

## Overview
Webook is a mobile automation project designed for testing mobile applications using Appium and Java. It is a Maven-based project that includes automated test scenarios for the following functionalities:
- **Change Language**
- **Login**

This project leverages the TestNG testing framework for organizing and running test cases.

---

## Features
- Automates mobile application testing using **Appium**.
- Includes modular and reusable code for better maintainability.
- Supports parameterized and data-driven testing through **TestNG**.

---

## Prerequisites
To set up and run the Webook project, ensure the following tools and dependencies are installed on your system:

### **Tools Required**
1. **Java Development Kit (JDK)**:
   - Version: **15**
   - Configure the `JAVA_HOME` environment variable.
2. **Maven**:
   - Ensure Maven is installed and added to the system `PATH`.
3. **Integrated Development Environment (IDE)**:
   - Recommended: **IntelliJ IDEA** (or any IDE that supports Java and Maven).
4. **Appium**:
   - Install Appium server (version 2.x recommended).
   - Ensure Appium is configured and running.
5. **Mobile Device or Emulator**:
   - Supported Platforms: Android and iOS.
   - Install appropriate device drivers (e.g., Android SDK, Xcode for iOS).
6. **Git**:
   - Clone the repository using Git.

---

## Project Structure
```
Webook/
├── src/
│   ├── main/
│   │   ├── java/org/example/
│   │   │   ├── BasePage.java
│   │   │   ├── HomePage.java
│   │   │   ├── UserProfile.java
│   │   │   ├── LoginPage.java
|   |   |   |__json.java
│   │   └── resources/
│   │       ├── data.json
│   │       └── testng.xml
│   └── test/
│       ├── java/org/example/
│       │   ├── BaseTest.java
|       |   |__ editUser.java
│       │   ├── ChangeLanguage.java
│       │   └── UserLogin.java
├── pom.xml
└── README.md
```

### **Key Files**
- **`pom.xml`**: Contains Maven dependencies and build configurations.
- **`testng.xml`**: TestNG configuration file to manage and execute test cases.

---

## Scenarios Implemented
1. **Change Language Test Case**:
   - Automates the process of switching the application language and verifies the updated language.
2. **Login Test Case**:
   - Automates the user login flow, validating successful login with valid credentials.

---

## Setup Instructions
1. **Clone the Repository**:
   ```bash
   git clone https://github.com/mahmoud-anwar16/webook-web.git
   cd webook-web
   ```

2. **Install Dependencies**:
   Run the following Maven command to download and install project dependencies:
   ```bash
   mvn clean install
   ```

3. **Configure Appium**:
   - Start the Appium server using the Appium desktop application or via CLI:
     ```bash
     appium
     ```
   - Update the desired capabilities in the `BaseTest` class to match your device/emulator configuration.

---

## How to Run
1. **Run Test Cases via TestNG**:
   - Open the `testng.xml` file in your IDE.
   - Right-click and select **Run**.

2. **Run Test Cases via Maven**:
   ```bash
   mvn test
   ```

---

## Dependencies
The project uses the following Maven dependencies:
- **Appium Java Client**: Mobile automation library.
- **TestNG**: Testing framework for organizing test cases.

These dependencies are declared in the `pom.xml` file.

---

