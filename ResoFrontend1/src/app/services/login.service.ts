import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient, ) { }
  public login(loginData:any){
    //     localStorage.setItem("username",loginData.username)
    // localStorage.setItem("password",loginData.password)
    return this.http.post(`${baseUrl}/task/login`,loginData);
  }
}
