# 🌦️ Weather Forecast Application

A real-time weather forecasting web application built using **Java Spring Boot** and **Thymeleaf** that provides current weather information for any city around the world using the **OpenWeather API**.

The application allows users to search for a city and view live weather details including temperature, humidity, wind speed, and weather conditions with a clean and responsive user interface.

---

## 🚀 Features

✅ Search weather by city name
✅ Real-time weather data using OpenWeather API
✅ Displays temperature information
✅ Shows humidity and wind speed
✅ Dynamic weather condition icons
✅ Loading indicator while fetching data
✅ Responsive glassmorphism UI design
✅ Simple and user-friendly interface

---

## 🛠️ Technologies Used

### Backend

* Java
* Spring Boot
* Spring MVC
* REST API Integration

### Frontend

* HTML5
* CSS3
* Thymeleaf

### API

* OpenWeather API

### Build Tool

* Maven

---

## 📂 Project Structure

```
weatherforecast
│
├── src/main/java/com/saurabh/weatherforecast
│
│   ├── controller
│   │      └── WeatherController.java
│   │
│   ├── service
│   │      └── WeatherService.java
│   │
│   ├── model
│   │      └── WeatherResponse.java
│   │
│   └── WeatherforecastApplication.java
│
├── src/main/resources
│
│   ├── templates
│   │      ├── index.html
│   │      └── weather.html
│   │      └── error.html
│   └── application.properties
│
└── pom.xml
```

---

## ⚙️ Installation & Setup

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/weatherforecast.git
```

### 2. Open Project

Open the project in:

* IntelliJ IDEA
* Eclipse
* VS Code

---

### 3. Configure OpenWeather API

Create an account on OpenWeather and generate an API key.

Add your API key in:

```
application.properties
```

Example:

```properties
weather.api.key=YOUR_API_KEY
```

For security, use environment variables before pushing to GitHub.

---

### 4. Run Application

Using Maven:

```bash
mvn spring-boot:run
```

or run:

```
WeatherforecastApplication.java
```

---

## 🌐 Application URL

After starting the server, open:

```
http://localhost:8080/
```

---

## 📸 Screenshots

### 🏠 Home Page

![Home Page](Screenshot%202026-07-13%20152227.png)


### 🌦️ Weather Result Page

![Weather Result](Screenshot%202026-07-13%20152247.png)

![Weather Result](Screenshot%202026-07-13%20152310.png)

---
## 🔄 Application Workflow

```
User enters city name
          |
          ↓
Spring Boot Controller receives request
          |
          ↓
Weather Service calls OpenWeather API
          |
          ↓
JSON response is converted into Java object
          |
          ↓
Thymeleaf displays weather information
```

---

## 🎯 Learning Outcomes

* Understanding Spring Boot MVC architecture
* Working with REST APIs
* JSON data handling
* Thymeleaf template engine
* Maven project management
* Building a complete Java web application

---

## 👨‍💻 Developer

**Saurabh Kumar**

Java Developer Intern | Spring Boot Developer

Technologies:

```
Java | Spring Boot | Thymeleaf | REST API | OpenWeather API
```

---

## 📌 Future Improvements

* Weather history tracking
* User authentication
* Weather alerts
* Database integration

---

⭐ If you like this project, consider giving it a star!
