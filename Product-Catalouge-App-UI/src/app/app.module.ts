import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { ProductViewComponent } from './product-view/product-view.component';
import { ProductDetailComponent } from './product-detail/product-detail.component';
import { SearchViewComponent } from './search-view/search-view.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LoginComponent,
    SignupComponent,
    ProductViewComponent,
    ProductDetailComponent,
    SearchViewComponent,
  ],
  imports: [BrowserModule, AppRoutingModule, FormsModule,HttpClientModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
