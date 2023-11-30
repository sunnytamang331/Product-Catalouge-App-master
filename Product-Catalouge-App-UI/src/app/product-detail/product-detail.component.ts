import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { ProductService } from '../services/product.service';

@Component({
  selector: 'app-product-detail',
  templateUrl: './product-detail.component.html',
  styleUrls: ['./product-detail.component.css'],
})
export class ProductDetailComponent implements OnInit {
  id: any;
  value: any;
  msg: any;
  fullmsg: any;
  product: any = {};
  constructor(
    private activatedRoute: ActivatedRoute,
    private productService: ProductService
  ) {}

  ngOnInit(): void {
    this.activatedRoute.params.subscribe((params) => {
      this.id = params['id'];
      console.warn(this.id);
    });

    this.productService.getProduct(this.id).subscribe((result) => {
      console.warn(result);
      this.product = result;
    });
  }

  checkPincode(val:any) {
    
    let value =parseInt(val);

    let pincodes = [123456, 654321, 897622];

    for (let i = 0; i < pincodes.length; i++) {
      if (pincodes[i] == value) {
        console.log('inside if');

        this.msg = 'Yes';

        this.fullmsg = 'Delivery by 22 Jan, Sunday.';

        return;
      } else if (pincodes[i] != value) {
        console.log('inside else');

        this.msg = 'No';

        this.fullmsg = 'Sorry, we do not deliver here.';
      }
    }
  }
}
