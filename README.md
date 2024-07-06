
# Student Management Application

This project is a simple student management application built using React for the frontend and Spring Boot with MongoDB for the backend. The application allows you to add, view, and manage student information.

## Table of Contents

- [Description](#description)
- [Technologies Used](#technologies-used)
- [Setup](#setup)
- [Usage](#usage)
- [Proof of Functionality](#proof-of-functionality)


## Description

The Student Management Application enables users to:
- Add new students with their name, email, date of birth, and program.
- View a list of all registered students.
- Calculate and display the age of each student based on their date of birth.

## Technologies Used

- **Frontend**: React
- **Backend**: Spring Boot
- **Database**: MongoDB

## Setup

### Backend (Spring Boot)

1. Clone the repository:
    ```sh
    git clone <repository-url>
    cd <repository-folder>
    ```

2. Configure MongoDB connection in `application.properties`:
    ```properties
    spring.application.name=MongoProject
    spring.data.mongodb.uri=mongodb+srv://<username>:<password>@cluster0.ofr17lj.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0
    ```

3. Build and run the Spring Boot application:
    ```sh
    mvn clean install
    mvn spring-boot:run
    ```

### Frontend (React)

1. Navigate to the frontend directory:
    ```sh
    cd frontboard
    ```

2. Install dependencies:
    ```sh
    npm install
    ```

3. Start the React development server:
    ```sh
    npm start
    ```

## Usage
1. run both projects, Using mvn spring-boot:run for the back and npm install, npm start for front
2. Open your web browser and navigate to `http://localhost:3000`.
2. Use the form to add new students by entering their name, email, date of birth, and program.
3. View the list of students in the table below the form. The table displays the student's name, email, date of birth, and calculated age.


## Proof of Functionality


1. **Proof 1**: Adding a new student and verifying it in MongoDB.
![image](https://github.com/juaneortiz1/MongoDBProject/assets/97971732/2b55f24c-dfb1-4d7b-b3e8-368e4a515ab2)
![image](https://github.com/juaneortiz1/MongoDBProject/assets/97971732/b5e65407-00ba-4df6-ac60-540dbd41aaa3)


2. **Proof 2**: Viewing the student list with calculated ages.
![image](https://github.com/juaneortiz1/MongoDBProject/assets/97971732/ebe9a50b-f362-42b5-ba51-f9987ba384e1)
![image](https://github.com/juaneortiz1/MongoDBProject/assets/97971732/39eac5ed-b15e-4f79-a982-1fc0734b4027)



## Author

**Juan Esteban Ortiz Pastrana**

