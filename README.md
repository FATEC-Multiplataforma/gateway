# Fretec - API Gateway

**Fretec** é a porta de entrada para todos os serviços da nossa aplicação de frete. Ele atua como um **API Gateway** centralizado, roteando requisições para os microsserviços internos, aplicando autenticação, controle de tráfego e políticas de segurança.

---

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot 3.x**
- **Spring Cloud 2025.0.0**
- **Spring Cloud Gateway**
- **JWT Authentication**
- **Docker**

---

## Funcionalidades

- Roteamento inteligente para microsserviços de frete
- Autenticação via JWT
- Filtro de requisições e logging
- Suporte a CORS
- Resiliência com fallback (opcional com Resilience4j)

