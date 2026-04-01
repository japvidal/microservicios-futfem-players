# microservicios-futfem-players

`microservicios-futfem-players` is the main player catalog service of the Tikitakas Women Football backend. It stores player profiles and exposes the REST endpoints used by the platform to manage footballer data such as identity, sporting attributes, metadata, and profile image references.

The project is implemented with Java 21, Spring Boot, Spring Data JPA, MySQL, Springdoc OpenAPI, and Maven Wrapper. It builds on `microservicios-common` for generic CRUD behavior, registers itself in Eureka, and is intended to be consumed through the gateway route rather than directly from the browser. This approach centralizes CORS, routing, and service discovery concerns.

Typical local execution:

```bash
./mvnw spring-boot:run
```

Gateway route:

- `/api/futfem/players/**`

In `v0.1.0`, the repository also includes Docker-friendly packaging, Jenkins pipeline automation, and gateway-aware Swagger server configuration. That means the generated OpenAPI document now works correctly from the shared gateway UI and points to the public route used in deployments.

If you want to extend Tikitakas with player enrichment, external football data, or advanced search, this repository is the natural place to do it because it is the canonical service for player-domain information.
