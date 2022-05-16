import { Component, OnInit } from '@angular/core';
import { Department } from '../department';
import { OwnersUiService } from '../owners-ui.service';

@Component({
  selector: 'app-department-ui',
  templateUrl: './department-ui.component.html',
  styleUrls: ['./department-ui.component.css']
})
export class DepartmentUiComponent implements OnInit {

  department : Department = new Department("",0,0);

  departments : any;
  
  constructor(private service:OwnersUiService) { }


  public addDepartment(){
  let resp=this.service.addDepartment(this.department);
    resp.subscribe((data: any)=>this.departments=data);
  }

  ngOnInit(){
    let resp=this.service.getDepartments();
    resp.subscribe((data: any)=>this.departments=data);

  }

  public deleteDepartment(departmentId:number){
    let resp = this.service.deleteDepartment(departmentId).subscribe({
      next:(result)=>{
        console.log(result);
        
      },error:(err)=>{
        console.log(err);
        
      }
    })
  }

}
