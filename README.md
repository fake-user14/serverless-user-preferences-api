# Serverless User Preferences API

## 📌 Overview
A serverless REST API built using *Amazon API Gateway, **AWS Lambda (Java 11), and **Amazon DynamoDB*.

This project demonstrates how to design cloud-native APIs using a fully serverless architecture.

---

## 🏗️ Architecture

```mermaid
flowchart LR
    A[Client] --> B[API Gateway]
    B --> C[AWS Lambda Java]
    C --> D[DynamoDB]


##  Features
    •	Serverless REST API
	•	AWS Lambda (Java 11)
	•	API Gateway HTTP integration
	•	DynamoDB-ready architecture
	•	AWS SAM template for IaC

## Tech Stack
	•	Java 11
	•	AWS Lambda
	•	API Gateway
	•	DynamoDB
	•	AWS SAM