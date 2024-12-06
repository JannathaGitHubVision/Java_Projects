# 📋 Comprehensive Java Projects Documentation  

---

## 📝 Programming 1A - Kanban Board Project  

### 🌟 Overview  
A practical implementation of a **Kanban board system**, developed as part of the **Programming 1A (PROG5121)** course. The objective is to create an application to effectively manage tasks using Kanban methodology, emphasizing programming constructs and software development best practices.  

### 🚀 Features  

#### 🔑 User Registration and Login  
- Create accounts with **username**, **password**, **first name**, and **last name**.  
- Input validation with feedback.  

#### 🛠️ Task Management  
- Add tasks post-login.  
- Displays a **welcome message** and a numeric menu for task options.  

#### 📊 Task States  
- Categorized into three:  
  - **To Do**  
  - **Doing**  
  - **Done**  

#### ✅ Unit Testing  
- Includes **JUnit** tests for functionality and code quality.  
- Automated CI testing with **GitHub Actions**.  

### 💻 Technologies Used  
- **Language**: Java  
- **Version Control**: Git, GitHub  
- **Testing Framework**: JUnit  
- **Development Environment**: [Your IDE of choice]  

### 📜 License  
Licensed under the **MIT License** – see `LICENSE` for details.  

### 🙌 Acknowledgments  
- **The Independent Institute of Education (Pty) Ltd** for project guidelines.  
- Resources for **GitHub** and **JUnit** documentation.  

---

## 🛒 Extreme IT Products Management Application  

### 🌟 Project Overview  
A **Java application** for managing product inventory at **Extreme IT Products**, a supplier specializing in IT hardware.  

### 🚀 Features  

#### 📋 Menu Structure  
- Startup menu for navigating product management options.  

#### 🛠️ Product Management  
- **Add Product**: Input details (name, price, stock, warranty).  
- **Update Product**: Modify existing product details.  
- **Delete Product**: Remove items using product codes.  
- **Search Product**: Retrieve details by product code or show errors for invalid entries.  

#### 📊 Reporting  
- Generate reports via a `ReportData` class with **getter** and **setter** methods.  

#### ✨ User Feedback  
- Confirm actions like saving or deleting products with feedback.  

### 💻 Technical Implementation  
- Developed in **Java**, following **OOP principles**.  
- Encapsulated class structure for effective data management.  
- Designed a user-friendly **interface**.  

### 📚 Compliance  
- Original work with proper citations.  
- Adhered to **academic standards** and formatting guidelines.  

### 🎯 Conclusion  
The application meets project requirements, improving operational efficiency and demonstrating programming skills.  

---

## 🏥 Hospital Inspection and Travel Information Java GUI Applications  

### 🌟 Project Overview  
Two Java GUI applications designed for:  
1. Capturing hospital inspection details.  
2. Recording travel information between locations.  

---

### 🏥 Application 1: Hospital Inspection  

#### 🛠️ Features  

- **User Input Fields**:  
  - **JTextField**: Hospital name and location.  
  - **JComboBox**: Select inspection years (1–5).  

- **Buttons**:  
  - **Save**: Store details in an array.  
  - **Print**: Retrieve and display details in a **JList**.  
  - **Clear**: Reset inputs and list.  

- **Menu System**:  
  - File menu for exiting.  
  - Tools menu for saving, printing, and clearing data.  

- **Validation**:  
  - Limits entries to five hospitals, with error messages via `JOptionPane`.  

#### 🏗️ Code Structure  
- Organized with clear classes and methods.  
- Includes comments for better understanding and maintenance.  

---

### ✈️ Application 2: Travel Information  

#### 🛠️ Features  

- **User Input Fields**:  
  - **JComboBox**: Choose start location, end location, and travel type.  
  - **JList**: Display captured travel data.  

- **File Operations**:  
  - Save data to `travel.txt` with `FileWriter`.  
  - Load data on startup and populate the list.  

- **Validation**:  
  - Restricts start/end locations to three options (**Cape Town**, **Durban**, **Port Elizabeth**).  
  - Travel types limited to **Airplane** and **Train**.  
  - Ensures start and end locations differ, with error prompts for invalid choices.  

#### 🏗️ Code Structure  
- Clear methods for functionality and comments for readability.  

### 🎯 Conclusion  
The applications are user-friendly and feature robust data validation and management, demonstrating proficiency in Java GUI development.  

---

### 📜 License  
Licensed under the **MIT License**.  

### 🙌 Acknowledgments  
- **The Independent Institute of Education (Pty) Ltd** for project guidance.  
- Online resources for Java GUI development.  

