from flask import Flask
from flask import jsonify
from flask import request
from zeep import Client
from flask_cors import CORS
import requests
import json

ProductDB = [
{
'id' : '0',
'name' : 'test1',
'section' : 'A'
},
{
'id' : '1',
'name' : 'test2',
'section' : 'B'
}
]

urlAzureSoap = "https://marketplacesoap.azurewebsites.net/?wsdl"

app = Flask(__name__)
CORS(app)

@app.route("/",methods=['GET'])
def welcome():
    return "welcome to python web service"

'''@app.route("/product/getProducts",methods=['GET'])
def getProducts():
    return jsonify({"products " : ProductDB})

@app.route("/product/getProduct/<name>",methods=['GET'])
def getProduct(name):
    product = [prod for prod in ProductDB if(prod['name'] == name)]
    print(product)
    return jsonify({"product " : product})

@app.route("/product/updateProduct/<name>",methods=['PUT'])
def updateProduct(name) :
    product = [prod for prod in ProductDB if(prod['name'] == name)]

    if('name' in request.json):
        print("Product Avalable")
    if('name' in request.json):
        product[0]['name'] = request.json['name']
    return jsonify({"product " : product[0]})


@app.route("/product/addProduct/",methods=['POST'])
def addProduct():
    product = {
        'id' : request.json['id'],
        'name' : request.json['name'],
        'section' : request.json['section']
    }
    ProductDB.append(product)
    return jsonify({"products " : ProductDB})

@app.route("/product/removeProduct/<name>",methods=['DELETE'])
def removeStudent(name):
    product = [prod for prod in ProductDB if(prod['name'] == name)]
    if(len(product) > 0):
        ProductDB.remove(product[0])
    return jsonify({"product " : product})'''



@app.route("/soap/<prix>/<distance>",methods=['GET'])
def getLivraison(prix, distance):
    client = Client(urlAzureSoap)
    total = client.service.livraison(prix,distance)
    print(total)
    res = [total]
    return str(res)


@app.route("/carteVerification/<numero>/<jour>/<mois>/<cvv>",methods=['GET'])
def carteVerification(numero,jour,mois,cvv):
    if (len(cvv) != 3):
        return "False"
    numero = numero.strip()
    cartNumberTab = list(numero)
    cartNumber=[]
    for x in cartNumberTab:
        if x !=' ':
            cartNumber.append(x)

    checkDigit = cartNumber.pop()
    processedDigits = []

    for index, digit in enumerate(cartNumber):
        if index % 2 == 0:
            doubledDigit = int(digit) * 2
            if doubledDigit > 9:
                doubledDigit - 9
            processedDigits.append(doubledDigit)
        else:
            processedDigits.append(int(digit))

    total = int(checkDigit) + sum(processedDigits)
    if(total % 10 == 0):
        print("Valid cart Number")
        return "True"
    else:
        print("Invalid cart Number")
        return "False"

@app.route("/products",methods=['GET'])
def getProducts():
    urlGraphQL = "https://mp-graphql.azurewebsites.net/products"
    resp = requests.get(urlGraphQL)
    data =  resp.text
    print(data)
    return data

#if(__name__=="__main__"):
    #app.run(port=9876)

