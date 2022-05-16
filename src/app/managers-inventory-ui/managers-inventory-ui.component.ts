import { Component, OnInit } from '@angular/core';
import { Inventory } from '../inventory';
import { OwnersUiService } from '../owners-ui.service';

@Component({
  selector: 'app-managers-inventory-ui',
  templateUrl: './managers-inventory-ui.component.html',
  styleUrls: ['./managers-inventory-ui.component.css']
})
export class ManagersInventoryUiComponent implements OnInit {

  inventory : Inventory = new Inventory("","",0);

  inventorys : any;

  constructor(private service:OwnersUiService) { }


  public addInventory(){
  let resp=this.service.addInventory(this.inventory);
    resp.subscribe((data)=>this.inventorys=data);
  }

  ngOnInit(){
    let resp=this.service.getInventorys();
    resp.subscribe((data: any)=>this.inventorys=data);

  }

  public deleteInventory(inventoryId:number){
    let resp = this.service.deleteInventory(inventoryId).subscribe({
      next:(result)=>{
        console.log(result);
        
      },error:(err)=>{
        console.log(err);
        
      }
    })
  }


}
