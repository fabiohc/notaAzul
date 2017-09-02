import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import {ROUTES} from './app.routes';

import { HttpModule } from "@angular/http";
import { FormsModule, NgForm } from "@angular/forms";
import { AppComponent } from './app.component';
import { LoginComponent } from './Aluno/login/login.component';
import { QuestaoComponent } from './Questao/questao/questao.component';
import { MenuComponent } from './menu/menu.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    QuestaoComponent,
    MenuComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
