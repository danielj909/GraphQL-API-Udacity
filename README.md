# Spring Boot GraphQL Demo with Dog Repository


This is a simple Spring Boot application demonstrating how to integrate GraphQL with the 'Dog' repository. GraphQL is a query language that allows clients to request specific data from an API. This demo application includes a Dog repository with a pre-populated list of dogs.

## Prerequisites

To run this demo, you'll need the following tools:

- [Java](https://www.oracle.com/java/technologies/javase-downloads.html) (version 11 or later)
- [Maven](https://maven.apache.org/install.html)
- [Postman](https://www.postman.com/downloads/)
- [GraphiQL](https://www.electronjs.org/apps/graphiql)

## Getting Started

1. Clone this repository: git clone https://github.com/danielj909/GraphQL-API-Udacity.git

2. Change into the project directory: cd GraphQL-API-Udacity

3. Build the project: mvn clean install

4. Run the application: mvn spring-boot:run

## Testing

To test the Spring Boot application using GraphQL, you can use tools like Postman or GraphiQL. Here are the steps to test the application using both of these tools:

### Testing GraphQL via Postman

1. Open Postman and create a new request.

2. Set the request method to `POST` and the request URL to `http://localhost:8080/graphql`.

3. In the request body, set the content type to `application/json` and add the GraphQL query as desired (check schema)

4. Click the "Send" button to make the request and receive a response.

5. The response should show the details of the dog in the JSON format per the query.

![Testing GraphQL via Postman](https://i.imgur.com/X9nebfZ.png)

### Testing GraphQL via GraphiQL

1. Open a web browser and navigate to `http://localhost:8080/graphiql`.

2. In the left-hand panel, add the GraphQL query as desired (check Schema)

3. Press the "Play" button to execute the query and receive a response.

4. The response should show the details of the dog in the JSON format per the query.

![Testing GraphQL via GraphiQL](https://i.imgur.com/j476UhI.png)

