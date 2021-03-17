import { Injectable } from '@angular/core';
import { AngularFirestore } from '@angular/fire/firestore';
import { Prod } from 'src/app/prod.model';

@Injectable({
  providedIn: 'root'
})
export class ProdService {

  constructor(private firestore: AngularFirestore) { }

  getProducts() {
    return this.firestore.collection('products').snapshotChanges();
  }

  createProduct(product: Prod){
    return this.firestore.collection('products').add(product);
  }

  updateProduct(product: Prod){
    delete product.id;
    this.firestore.doc('products/' + product.id).update(product);
  }

  deleteProduct(productId: string){
    this.firestore.doc('products/' + productId).delete();
  }
}
