import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './pages/login/login.component';
import { DashboardComponent } from './pages/dashboard/dashboard.component';
import { AddTaskComponent } from './pages/add-task/add-task.component';

const routes: Routes = [
  {
    path: "",
    component: LoginComponent,
    pathMatch:"full"
  },
  {
    path:"dashboard",
    component:DashboardComponent,
    pathMatch:"full"
  },{
    path:"add-task",
    component:AddTaskComponent,
    pathMatch:"full"
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
