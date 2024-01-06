import { Component } from '@angular/core';
import { LoginService } from '../../services/login.service';
import { FormsModule } from '@angular/forms';
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import {MatButtonModule} from '@angular/material/button';
import { error } from 'console';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone:true,
  imports: [FormsModule,MatButtonModule,MatCardModule,MatInputModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  constructor(private service:LoginService, private router:Router){}
  public loginData={
    username: "",
    password: ""
  }

  public login(){
    this.service.login(this.loginData).subscribe(
      (data:any)=>{
        if(data==true){
          this.router.navigateByUrl("/dashboard")
        }
        else{
          alert("Wrong Credentials")
        }
      },
    (error)=>{
      alert("Something went wrong")
    }
    )
    
    
  }


}
