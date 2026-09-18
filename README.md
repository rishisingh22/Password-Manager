# 🔐 Secure Password Manager (Java)

##  Overview

Secure Password Manager is a Java-based console application designed to help users securely store and manage their credentials. It provides a simple and structured way to add, view, and delete passwords while applying basic encoding for security.

---

##  Problem Statement

Managing multiple passwords manually or storing them in insecure locations (such as notes or browsers) can lead to serious security risks.
This project addresses that issue by offering a secure and organized solution for password management using Java.

---

##  Features

* Master password authentication
* Add new credentials (website, username, password)
* View stored passwords
* Delete saved passwords
* Basic password encoding using Base64
* Simple and user-friendly console interface

---

##  Technologies Used

* Java
* Object-Oriented Programming (OOP)
* File Handling
* Java Collections (Scanner)
* Base64 Encoding

---

##  Project Structure

```
SecurePasswordManager/
│── src/
│   ├── Main.java
│   ├── PasswordService.java
│   ├── FileHandler.java
│
│── data/
│   └── passwords.txt
│
│── README.md
│── .gitignore
```

---

##  Setup Instructions

### 1. Requirements

* Java JDK 8 or above
* Any IDE (VS Code / IntelliJ) or Terminal

### 2. Clone the Repository

```
git clone https://github.com/nisha-181206/secure-password-manager
cd secure-password-manager
```

### 3. Compile the Program

```
javac -d . src/*.java
```

### 4. Run the Program

```
java Main
```

---

##  How to Use

1. Run the program
2. Enter the master password
3. Choose an option from the menu:

   * Add Password
   * View Passwords
   * Delete Password
4. Manage your credentials easily through the console

---

##  How It Works

* The user logs in using a master password
* Passwords are encoded using Base64 before storage
* Data is stored in a file (`data/passwords.txt`)
* File handling is used to read, write, and delete records
* Modular design separates logic into different classes

---

##  Data Handling

* Uses file-based storage (`data/passwords.txt`)
* Data persists even after program restarts
* Each record is stored in a structured format

---

##  Learning Outcomes

* Applied Object-Oriented Programming concepts
* Implemented file handling in Java
* Understood basic encoding techniques
* Learned modular programming
* Improved problem-solving skills

---

##  Future Improvements

* Implement advanced encryption (AES)
* Add search and update functionality
* Build a graphical user interface (GUI)
* Integrate database storage
* Add password strength checker

---

##  Author
Rishi Raushan Singh

- **Name:** Dev
- **Registration Number:** 25BAI10341
-  VIT Bhopal University  
