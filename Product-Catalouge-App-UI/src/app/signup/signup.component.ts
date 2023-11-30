import { Component, OnInit } from '@angular/core';
import { UserService } from '../services/user.service';
import {Router} from '@angular/router'

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

  constructor(private userSevice : UserService,private route: Router) { }

  ngOnInit(): void {
    this.userSevice.reloadUser();
  }
  signUp(data:object):void{
    this.userSevice.userSignUp(data).subscribe((result)=>{
      if(result){
        console.warn(result);
        this.route.navigate(['product']);
      }
    });
  }
}
