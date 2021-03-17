var express = require('express');
var { graphqlHTTP } = require('express-graphql');
var { buildSchema } = require('graphql');

// Construct a schema, using GraphQL schema language
var schema = buildSchema(`
 type Query {
    hello: String
    students:String
 }
`);

var root = {
    hello: () => {
    return "Hello world!, c'est moiiiiiiiiiiiiii :D !!";
    },
   };


   var bd =
   [
        {
            id:1,
            nom: "robin",
            prenom: "wagner"
        },
        {
            id:2,
            nom: "robin",
            prenom: "wagner"
        },
        {
            id:3,
            nom: "robin",
            prenom: "wagner"
        },
    ]

    var students = {
        students : ()=>{
            return bd;
        }
    }

var app = express();
app.use('/graphql', graphqlHTTP({
 schema: schema,
 rootValue: students,
 graphiql: true,
}));


app.listen(4000);
console.log('Running a GraphQL API server at http://localhost:4000/graphql');


