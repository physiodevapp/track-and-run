# 🏃‍♂️ **Track & Run**  
**Track & Run** es un sistema basado en microservicios diseñado para gestionar usuarios y registrar sus actividades de carrera. El proyecto permite a los usuarios almacenar datos de sus carreras, incluyendo la distancia total recorrida, el tiempo total, y la velocidad media.

---

## 🚀 **Características**
- 👥 **Gestión de usuarios**: CRUD completo para manejar la información de los usuarios.
- 🏃 **Registro de carreras**: Almacena y consulta datos de las carreras de los usuarios.
- 🔄 **Arquitectura basada en microservicios**: Diseñado para escalabilidad y modularidad.
- 📊 **Análisis de datos de rendimiento** (futuro): Calcular estadísticas avanzadas basadas en los datos de las carreras.

---

## 🛠️ **Tecnologías usadas**
- **Backend**: 
  - 🌱 Spring Boot (Java)
  - 🛢️ H2 Database (desarrollo) / MySQL (producción)
- **Comunicación**:
  - REST APIs con Spring Web
- **Contenedores**:
  - 🐳 Docker y Docker Compose

## 🌟 **Próximos pasos**
- 🏃 **Crear el microservicio de carreras (`raceservice`)**:
  - Diseñar un microservicio que permita registrar y consultar las carreras de los usuarios con datos como:
    - Distancia total recorrida.
    - Tiempo total.
    - Velocidad promedio.

- 📡 **Implementar comunicación entre microservicios con eventos**:
  - Utilizar un sistema de mensajería como RabbitMQ o Kafka para comunicar `userservice` y `raceservice`.
