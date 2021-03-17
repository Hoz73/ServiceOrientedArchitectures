import requests
import json
from time import sleep


creerEtudiant = requests.post("http://localhost:8080/ServiceREST-1.0-SNAPSHOT/api/etudiant/creerEtudiant/ben/ten")
#size = requests.get("http://localhost:8080/ServiceREST-1.0-SNAPSHOT/api/etudiant/size")
liste = requests.get("http://localhost:8080/ServiceREST-1.0-SNAPSHOT/api/etudiant/liste")
#etu = requests.get("http://localhost:8080/ServiceREST-1.0-SNAPSHOT/api/etudiant/1")

mongo = requests.get("https://api.sandbox.mangopay.com/nH8LKajWZ6YT9yja96J9UViThDR1FR0MFtXFwU7KBvQ1rkzZ44")

if __name__ == "__main__":
    #print(creerEtudiant.content)
    #print(liste.content)
    print(mongo)
    
