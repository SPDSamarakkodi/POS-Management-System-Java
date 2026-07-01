# Java POS Management System

A desktop-based Point of Sale (POS) Management System developed using Java Swing and MySQL. The application follows the MVC (Model-View-Controller) architecture and provides separate login interfaces for Administrators and Cashiers.

---

## Project Overview

This system was developed as an academic project to demonstrate desktop application development using Java, database connectivity with MySQL, and the MVC software architecture.

The application provides authentication, inventory management, cashier operations, and administrator functionalities within a user-friendly graphical interface.

---

## Features

### Administrator

- Secure Admin Login
- User Account Management
- Update Administrator Information
- Inventory Management
- Product Management
- Sales Monitoring
- Database Connectivity
- Session Timeout Protection

### Cashier

- Secure Cashier Login
- Sales Processing
- Product Searching
- Customer Billing
- Password Recovery Information
- Automatic Session Timeout

---

## Technologies Used

| Technology | Description |
|------------|-------------|
| Java | Programming Language |
| Java Swing | GUI Development |
| JDBC | Database Connectivity |
| MySQL | Database |
| NetBeans IDE | Development Environment |
| MVC | Software Architecture |
| MigLayout | GUI Layout Manager |
| Swing Animation Timing Framework | UI Animation |

---

## Project Structure

```
src
│
├── Button
├── Component
├── Controller
├── Databases
├── Model
├── View
└── Main.java
```

---

## Login System

The application provides two separate login portals.

- Administrator Login
- Cashier Login

The login interface includes smooth animated transitions between both panels.

---

## Security Features

- Session timeout (60 seconds)
- Password authentication
- MVC-based separation
- Database validation
- User input validation

---

## Database

Database: MySQL

The application communicates with MySQL using JDBC.

You should import the provided SQL database before running the application.

---

## Requirements

- Java JDK 17 or later
- NetBeans IDE
- MySQL Server
- MySQL Connector/J
- MigLayout Library
- Timing Framework Library

---

## Installation

### Clone Repository

```bash
git clone https://github.com/SPDSamarakkodi/Java-POS-Management-System.git
```

### Open Project

Open the project using NetBeans IDE.

### Configure Database

1. Create a MySQL database.
2. Import the provided SQL file.
3. Update the database connection settings inside the project.

### Run

Run

```
Main.java
```

---

## Screenshots

You can place screenshots inside

```
Images/
```

Example:

- Login Screen
- Admin Dashboard
- Cashier Dashboard
- Product Management
- Billing Screen

---

## Future Improvements

- Barcode Scanner Support
- Receipt Printing
- PDF Invoice Generation
- Sales Reports
- Customer Management
- Email Notifications
- Backup & Restore
- Multi-user Access
- Role-based Permissions

---

## Project Architecture

```
MVC Architecture

View
↓

Controller
↓

Model
↓

Database (MySQL)
```

---

## Author

**Pavan Samarakkodi**

GitHub:
https://github.com/SPDSamarakkodi

---

## Acknowledgements

- NetBeans IDE
- Oracle Java
- MySQL
- MigLayout
- Swing Timing Framework

---

## License

This project is licensed under the MIT License.

---

⭐ If you found this project useful, consider giving it a star.
