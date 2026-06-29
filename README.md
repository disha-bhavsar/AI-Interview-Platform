# 🎯 AI Interview Platform

An AI-powered Mock Interview and Resume Analyzer platform developed using **Java Spring Boot**, **HTML**, **CSS**, **JavaScript**, and **MySQL**.

The platform helps students and job seekers practice technical interviews, analyze resumes, improve communication skills, and receive AI-based evaluation and feedback.

---

# 🚀 Features

## ✅ AI Mock Interview

* Role-based interview selection
* Beginner / Intermediate / Advanced levels
* Dynamic technical questions
* AI-based answer evaluation
* Speech recognition support
* Camera & microphone integration
* Real-time scoring & feedback
* Interview timer system
* Start / Stop interview controls

---

## ✅ Resume Analyzer

* Resume upload functionality
* Technical skill detection
* Resume score generation
* Strength analysis
* Improvement suggestions
* Dynamic AI-style analysis

---

# 🛠️ Technologies Used

## Frontend

* HTML5
* CSS3
* JavaScript

## Backend

* Java
* Spring Boot
* REST API

## Database

* MySQL

## Tools & Platforms

* Maven
* Git & GitHub
* VS Code / IntelliJ IDEA
* XAMPP

---

# 📂 Project Structure

```bash
AI-Interview-Platform
│
├── backend
│   ├── controller
│   ├── model
│   ├── repository
│   ├── service
│   └── application.properties
│
├── frontend
│   ├── login.html
│   ├── dashboard.html
│   ├── interview.html
│   ├── resume.html
│
└── pom.xml
```

---

# ⚙️ Setup Instructions

## 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/AI-Interview-Platform.git
```

---

## 2️⃣ Open Project

Open the project in:

* IntelliJ IDEA
  OR
* VS Code

---

## 3️⃣ Configure Database

Create database:

```sql
CREATE DATABASE ai_interview;
```

Update database credentials in:

```properties
src/main/resources/application.properties
```

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ai_interview
spring.datasource.username=root
spring.datasource.password=your_password
```

---

## 4️⃣ Run Spring Boot Backend

```bash
mvn spring-boot:run
```

Backend runs on:

```bash
http://localhost:8080
```

---

## 5️⃣ Run Frontend

Open:

```bash
login.html
```

using browser or Live Server.

---

# 🧠 AI Evaluation Logic

The platform evaluates answers based on:

* Technical correctness
* Relevant concepts
* Communication quality
* Completeness
* Confidence level

---

# 📸 Screenshots

## 🔹 Login Page

Add screenshot here:

```md
![Login Page](screenshots/login.png)
```

---

## 🔹 Dashboard

Add screenshot here:

```md
![Dashboard](screenshots/dashboard.png)
```

---

## 🔹 AI Interview Page

Add screenshot here:

```md
![Interview Page](screenshots/interview.png)
```

---

## 🔹 Resume Analyzer

Add screenshot here:

```md
![Resume Analyzer](screenshots/resume.png)
```

---

# 🔮 Future Enhancements

* Real AI integration using OpenAI API
* Facial emotion detection
* Voice confidence analysis
* PDF resume parsing
* JWT Authentication

---

# 👩‍💻 Author

## Disha Bhavsar

Computer Engineering Student

### Skills

* Java
* Spring Boot
* MySQL
* HTML/CSS/JavaScript
* Python

---

# 📄 License

This project is developed for educational and learning purposes.

---

# ⭐ GitHub

If you found this project useful, give it a ⭐ on GitHub.
