Cuando lo subas, puedes dejar en el README algo así:

markdown
# Proyecto Seguridad 🚀

## Servicios
- **Backend (Spring Boot + JWT)**: Autenticación y autorización con tokens.
- **Base de datos (MySQL 8 en Docker)**: Persistencia de usuarios.
- **Frontend (React)**: Consumo de API.

## Cómo correrlo
bash
mvn clean package -DskipTests
docker-compose up -d --build

## Endpoints principales
POST /auth/register → Crear usuario
  POST /auth/login → Obtener JWT
  GET /api/protegido → Requiere token
