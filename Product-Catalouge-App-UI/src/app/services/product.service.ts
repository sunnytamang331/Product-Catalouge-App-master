import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http: HttpClient) { }
  getProducts(){
    return this.http.get<any[]>('http://localhost:8080/product');
  }

  searchProduct(data:any){
    return this.http.post<any[]>('http://localhost:8080/search',data);
  }
  
  getProduct(id:any){
    return this.http.get<any>("http://localhost:8080/product/"+`${id}`);
  }
}
