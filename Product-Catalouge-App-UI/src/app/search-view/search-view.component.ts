import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-search-view',
  templateUrl: './search-view.component.html',
  styleUrls: ['./search-view.component.css'],
})
export class SearchViewComponent implements OnInit {
  productList: any = [];
  constructor(private productService: ProductService) {}

  ngOnInit(): void {}

  searchProduct(data: any) {
    this.productService.searchProduct(data).subscribe((result) => {
      this.productList = result;
      console.warn(result);
    });
  }
  onSortDirection() {
    this.productList = this.productList.sort((a: any, b: any) =>
      a.productPrice > b.productPrice ? -1 : 1
    );
    return this.productList;
  }

  onSortDirectionOpp() {
    this.productList = this.productList.sort((a: any, b: any) =>
      a.productPrice < b.productPrice ? -1 : 1
    );
    return this.productList;
  }
}
