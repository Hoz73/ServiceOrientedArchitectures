import { Component } from '@angular/core';

import { Prod } from 'src/app/prod.model';
import { ProdService } from 'src/app/prod.service';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'ClientMarketPlace';

  /*produits: any = [
    {prix: "50", nom: "sac à dos", boolean :false},
    {prix: "12", nom: 'ballon', boolean :false},
    {prix: "3", nom: 'stylo', boolean :false}
  ];*/

  products: any[] | undefined;

  constructor(
    private prodService: ProdService
  ) { }

  ngOnInit(): void {
    this.prodService.getProducts().subscribe(data => {
      this.products = data.map(e => {
        return {
          id: e.payload.doc.id,
          data: e.payload.doc.data(),
        } as Prod;
      })
    });
  }

  create(product: Prod){
    this.prodService.createProduct(product);
  }

  update(product: Prod) {
    this.prodService.updateProduct(product);
  }

  delete(id: string) {
    this.prodService.deleteProduct(id);
  }

}
