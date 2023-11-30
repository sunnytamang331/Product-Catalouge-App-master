import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router: Router, private userService: UserService) { }

  ngOnInit(): void {
    this.userService.reloadUser();
  }

  login(data:any):void{
    this.userService.userLogin(data).subscribe((result)=>{
      console.warn(result)
      if(result){
        localStorage.setItem('user',JSON.stringify(result));
        this.router.navigate(['product'])
      }
    })
  }
}
