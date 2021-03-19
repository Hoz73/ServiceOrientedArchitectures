from flask import Flask
from graphene import ObjectType, String, Schema, Int, ID, List
import json
from flask import request
from zeep import Client
from flask_cors import CORS

app = Flask(__name__)
CORS(app)

class Product(ObjectType):
    id = ID()
    name = String()
    price = Int()

class Query(ObjectType):
    hello = String(name=String(default_value="stranger"), age=Int(default_value=10))
    goodbye = String()

    products = List(Product)

    def resolve_hello(root, info, name, age):
        return 'Hello {}, you are {} years old'.format(name,age)
    
    def resolve_goodbye(root, info):
        return 'See ya!'

    def resolve_products(root, info):
        return[
            Product(name='ecran FHD', price=1500),
            Product(name='ecran UHD', price=2000),
            Product(name='ecarn QLED UHD', price=3500),
            Product(name='ecran QLED FHD', price=3000),
        ]

def main():
    schema = Schema(query=Query)

    #sans arguments
    query_hello = '{ hello(name: "gregory", age: 21) }'
    result = schema.execute(query_hello)
    print(result.data['hello'])

    #avec arguments
    query_with_argument = '{ hello(name: "GraphQL") }'
    result = schema.execute(query_with_argument)
    print(result.data['hello'])

    query_goodbye = '{ goodbye }'
    result = schema.execute(query_goodbye)
    print(result.data['goodbye'])

    query_products = '{ products{name price} }'
    result = schema.execute(query_products)
    items = dict(result.data.items())
    print(json.dumps(items, indent=4))

@app.route("/",methods=['GET'])
def welcome():
    return "welcome to python web service"

@app.route("/main",methods=['GET'])
def test():
    schema = Schema(query=Query)

    #sans arguments
    query_hello = '{ hello(name: "gregory", age: 21) }'
    result = schema.execute(query_hello)
    print(result.data['hello'])

    #avec arguments
    query_with_argument = '{ hello(name: "GraphQL") }'
    result = schema.execute(query_with_argument)
    print(result.data['hello'])

    query_goodbye = '{ goodbye }'
    result = schema.execute(query_goodbye)
    print(result.data['goodbye'])

    query_products = '{ products{name price} }'
    result = schema.execute(query_products)
    items = dict(result.data.items())
    print(json.dumps(items, indent=4))

@app.route("/products",methods=['GET'])
def getProducts():
    schema = Schema(query=Query)
    query_products = '{ products{name price} }'
    result = schema.execute(query_products)
    items = dict(result.data.items())
    print(items)
    return json.dumps(items, indent=4)

#if __name__ == '__main__':
    #main()
    #app.run()