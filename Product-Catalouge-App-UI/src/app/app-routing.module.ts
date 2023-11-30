import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { LoginComponent } from './login/login.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { ProductViewComponent } from './product-view/product-view.component';
import { SearchViewComponent } from './search-view/search-view.component';
import { SignupComponent } from './signup/signup.component';

const routes: Routes = [
  {
    path: '',
    component: LoginComponent,
    pathMatch: 'full',
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'signup',
    component: SignupComponent,
  },
  {
    path: 'product',
    component: ProductViewComponent,
    canActivate: [AuthGuard]
  },
  {
    path: 'product-detail/:id',
    component: ProductDetailComponent,
    pathMatch: 'full',
    canActivate: [AuthGuard]
  },
  {
    path: 'search-view',
    component: SearchViewComponent,
    canActivate: [AuthGuard]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
