import { Component, Input, OnInit } from '@angular/core';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.scss']
})
export class ProductComponent implements OnInit {

  @Input() produitNom :string | undefined;
  @Input() produitPrix :string | undefined;
  @Input() checked :boolean | undefined;
  achteurNom = "";
  //produitPrix = 50;
  distance = 0;

  prixTotals: any | undefined;

  posts : Observable<any> | undefined

  postsCarte : Observable<any> | undefined


  rates: any[] | undefined;
  loading = true;
  error: any; 

  afficheCarte = true;

  numeroCarte ="";

  expiryJour="";

  expiryMois="";

  cvv="";

  resPayment: string | undefined;

  resPaymentToogle = false;

  constructor(
    private http: HttpClient,
  ) { }

  ngOnInit(): void {

  }

  getProduit(){
    return this.produitNom;
  }

  getPrix(){
    return this.produitPrix;
  }

  getachteurNom(){
    return this.achteurNom;
  }

  getDistance(){
    return this.distance;
  }

  getPrixTotal(){
    //return Number(this.produitPrix) + (this.distance  * 1/8);
    return this.prixTotals; 
  }

  getNumeroCarte(){
    return this.numeroCarte;
  }

  getREST(){
    var url = "https://mp-api-rest.azurewebsites.net/soap/"
    url = url.concat(this.getPrix()?.toString() + "/" + this.getDistance().toString());
    this.posts = this.http.get(url);
    this.posts.forEach(async (value) => {
      this.prixTotals = value[0];
      this.delay(1);
      console.log(this.prixTotals); 
    });        
  }

  delay(ms: number) {
    return new Promise( resolve => setTimeout(resolve, ms) );
  }

  getRestPayer(){
    var url = "https://mp-api-rest.azurewebsites.net/carteVerification/";
    url = url.concat(this.getNumeroCarte() + "/" + this.expiryJour + "/" + this.expiryMois + "/" + this.cvv);
    this.postsCarte = this.http.get(url,{responseType: 'text'});
    this.postsCarte.forEach(async (value) => {
      this.resPayment = value;
      this.delay(1);
      console.log(this.resPayment); 
    });     
  }

  afficheToogleCarte(){
    this.afficheCarte = !this.afficheCarte;
  }

  afficheToogleResPayment(){
    this.resPaymentToogle = !this.resPaymentToogle;
  }

  getResPayment(){
    return this.resPayment;
  }

}
