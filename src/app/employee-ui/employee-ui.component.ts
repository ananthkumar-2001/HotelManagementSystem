import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { OwnersUiService } from '../owners-ui.service';

@Component({
  selector: 'app-employee-ui',
  templateUrl: './employee-ui.component.html',
  styleUrls: ['./employee-ui.component.css']
})
export class EmployeeUiComponent implements OnInit {

  employee: Employee=new Employee("",0,"","","",0);

  employees: any;

  constructor(private service:OwnersUiService) { }


  public addEmployee(){
  let resp=this.service.addEmployee(this.employee);
    resp.subscribe((data)=>this.employees=data);
  }

  ngOnInit(){
    let resp=this.service.getEmployees();
    resp.subscribe((data: any)=>this.employees=data);

  }

  public deleteEmployee(employeeId:number){
    let resp = this.service.deleteEmployee(employeeId).subscribe({
      next:(result)=>{
        console.log(result);
        
      },error:(err)=>{
        console.log(err);
        
      }
    })
  }

}
