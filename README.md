# Photographers' Booking and Portfolio Hub Backend

## Project Description
The **Photographers' Booking and Portfolio Hub** is a platform that enables photographers to showcase their portfolios, manage bookings, and connect with clients seamlessly. Clients can book services, view portfolios, and communicate with photographers. This web application provides photographers with the tools they need to grow their businesses while giving clients an intuitive experience when searching for photography services.

## Features
### For Photographers:
- Customizable portfolio pages with categorized galleries (e.g., Weddings, portraits, events).
- A booking system integrated with a calendar for real-time availability.
- Profile pages with bios, pricing, and contact information.
- Automated invoices and payment management.
- Communication tools for client inquiries and shoot references.

### For Clients:
- Search functionality to find photographers by location, category, and budget.
- Booking interface with real-time availability.
- Notifications and reminders for upcoming sessions.
- Option to leave reviews and rate services.

### Additional Features:
- Blog/Community Section: A platform for photographers to share tips, insights, and experiences.
- Nearby Events Map: Display of local public events where photographers can offer services.
- Sustainable Options: Highlight eco-conscious photographers and services.

## Technologies Used
- **Frontend**: React, HTML, CSS, JavaScript
- **Backend**: Java(Spring Boot), PostgreSQL, MongoDB
- **API**: GraphQL, REST
- **Payment Integration**: Stripe, Paypal
- **Hosting**: Google Cloud Platform

## Getting Started (with the backend)

### Pre-requisites
Before you begin, ensure you have the following installed:
- Java (JDK 21 or higher)
- PostgreSQL 17
- MongoDB

### Setup Instructions
1. Clone the repository:
    ```bash
    git clone https://github.com/DennisN22042003/PH.git

2. Navigate to the project directory:
    ```bash
    cd PhotographerHubBackend

3. Create a `.env` file in the root of the project.

4. Add the necessary configurations to the `.env` file, such as;
    - Database credentials
    - API Keys for third-party services (e.g., Stripe, PayPal)

### Running the application:
#### For each backend micro-service:
1.  Navigate to the project folder of the micro-service you want to run and run the following command:
    ```bash
    ./gradlew test

2. After all tests are passed for the service you want to build, run the following command to build the Spring Boot application for the service:
    ```bash
    ./gradlew build

3. Run the following command to run the Spring Boot Application you've just built in step 1:
    ```bash
    ./gradlew bootRun

## Contributing
### We welcome contributions! To contribute:

**TO BE EXPLAINED**