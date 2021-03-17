from zeep import Client

#client = Client('http://localhost:8080/ServerSOAP-1.0-SNAPSHOT/services/ServerSOAP?wsdl')

#client = Client('https://app-serversoap-210111202540.azurewebsites.net/services/ServerSOAP?wsdl')

client = Client('https://marketplacehamzealrasheed.azurewebsites.net/?wsdl')

if __name__ == "__main__":

    print(client.service.livraison(14,3))
