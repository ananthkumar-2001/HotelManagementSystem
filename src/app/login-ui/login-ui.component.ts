import { Component, OnInit } from '@angular/core';
import { Login } from '../login';
import {Router} from '@angular/router'; 

@Component({
  selector: 'app-login-ui',
  templateUrl: './login-ui.component.html',
  styleUrls: ['./login-ui.component.css']
})
export class LoginUiComponent implements OnInit {

  login : Login = new Login("","");

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  public jumpTo(){
    var username=this.login.username;
    var password=this.login.password;
    if(username=="owner"&&password=="MyHotel@143"){
      this.router.navigate(['/home']);
    }
    else if(username=="manager"&&password=="MyDuty@143"){
      this.router.navigate(['/manager']);
    }
    else if(username=="receptionist"&&password=="MyService@143"){
      this.router.navigate(['/receptionist']);
    }
    else{
      alert("Invalid Credentials");
    }
  }

}
function http(http: any) {
  throw new Error('Function not implemented.');
}

