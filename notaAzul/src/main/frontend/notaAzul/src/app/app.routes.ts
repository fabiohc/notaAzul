import { Routes} from   '@angular/router';
import {LoginComponent} from './Aluno/login/login.component';
import {QuestaoComponent} from './Questao/questao/questao.component';
import {MenuComponent} from './menu/menu.component';

export const ROUTES:Routes = [
    {path:'', component:LoginComponent},
    {path:'questao', component:QuestaoComponent},
    {path:'1', component:MenuComponent}

];