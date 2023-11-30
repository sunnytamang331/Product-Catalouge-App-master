import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import { BehaviorSubject } from 'rxjs';
import { Router } from '@angular/router';
@Injectable({
  providedIn: 'root'
})
export class UserService {
  // url="http://localhost:8080";
  isUserLoggedIn= new BehaviorSubject<boolean>(false);

  constructor(private http:HttpClient,private router:Router) { }
  userSignUp(data:any){
    this.http.post("http://localhost:8080/signup",
    data,
    {observe:'response'}).subscribe((result)=>{
      this.isUserLoggedIn.next(true);
      localStorage.setItem('user',JSON.stringify(result.body));
      this.router.navigate(['product']);
      console.warn('result',result);
    });
    return this.http.post("http://localhost:8080/signup",data);
  }

  reloadUser(){
    if(localStorage.getItem('user')){
      this.isUserLoggedIn.next(true);
      this.router.navigate(['product']);
    }
  }

  userLogin(data:any){
    return this.http.post("http://localhost:8080/login",data);
  }
}
