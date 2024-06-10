#! /usr/bin/bash

serve_backend() {
unset JAVA_HOME
cd backend
mvn spring-boot:run
}

serve_frontend() {
cd frontend
php -S localhost:8000
}

serve_backend & serve_frontend
