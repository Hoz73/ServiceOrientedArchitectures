import { ApolloServer, gql } from "apollo-server-express";
import { resolvers } from "./resolvers";
import { typeDefs } from "./typeDefs";
import express from "express";


const StartServer = async () =>{
    const app = express();

    const mongoose = require('mongoose');

    const server = new ApolloServer({
        typeDefs,
        resolvers
    });
    
    server.applyMiddleware({ app });
    
    mongoose.connect('mongodb://localhost:27017/MarketPlace', {useNewUrlParser: true, useUnifiedTopology: true});

    mongoose.connection.once('open',function(){
        console.log('Connection with mongoDB has been made, ready to work !');
    }).on('error',function(error){
        console.log('Connection error: ',error);
    });

    app.listen({ port: 4000}, () =>
        console.log('Server ready at http://http://localhost:4000/graphql , waiting to connect to mongoDB')
    );
}
StartServer();
