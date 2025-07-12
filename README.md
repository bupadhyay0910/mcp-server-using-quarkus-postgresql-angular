_Modern full-stack CRUD application using Quarkus (RESTful backend), PostgreSQL (structured database), and Angular (interactive frontend), seamlessly integrated with the Model Context Protocol (MCP) to enable context-aware interactions with generative AI models_.

## Technologies Used
- Quarkus CLI: `sdk install quarkus`
- JDK 24: `sdk install java 24-open`
- Node.js: `nvm install 24` and `nvm use 24`
- Angular CLI: `npm install -g @angular/cli`
- PostgreSQL: Install via docker command:
  ```bash
  docker run --name postgres -e POSTGRES_DB=crud_app -e POSTGRES_PASSWORD=postgres -p 5432:5432 -d postgres
  ```
- Create backend service skaffold:
  ```bash
  quarkus create app --no-code -x rest-client-jackson,qute,mcp-server-stdio dev.bupadhyay.demo:order-service:1.0-SNAPSHOT
  ```
- Create frontend app skaffold:
  ```bash
  ng new order-app --routing --style=scss --prefix=order
  ```
