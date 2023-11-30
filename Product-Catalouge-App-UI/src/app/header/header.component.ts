import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css'],
})
export class HeaderComponent implements OnInit {
  menuType: string = 'default';
  userName: string = '';
  constructor(private router: Router) {}

  ngOnInit(): void {
    this.router.events.subscribe((val: any) => {
      if (val.url) {
        if (localStorage.getItem('user')) {
          this.menuType = 'user';
          if (localStorage.getItem('user')) {
            let userStore = localStorage.getItem('user');
            let userData = userStore && JSON.parse(userStore);
            this.userName = userData.firstName;
          }
        } else {
          this.menuType = 'default';
        }
      }
    });
  }
  logout() {
    localStorage.removeItem('user');
    this.router.navigate(['login']);
  }
}