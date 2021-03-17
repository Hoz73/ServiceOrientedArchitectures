import { gql } from "apollo-server-express";

export const typeDefs = gql`
    type Query {
        hello: String!
        products: [Product!]!
    }

    type Product {
        id: ID!
        name: String!
        price: String!
    }

    type Mutation {
        createProduct(name: String!, price: String!): Product!
    }
`;