import { Component, OnInit } from '@angular/core';
import { OwnersUiService } from '../owners-ui.service';
import { Room } from '../room';


@Component({
  selector: 'app-room-ui',
  templateUrl: './room-ui.component.html',
  styleUrls: ['./room-ui.component.css']
})
export class RoomUiComponent implements OnInit {

  room: Room=new Room("",0,false,0);

  rooms:any;
  roomId: number | undefined;

  constructor(private service:OwnersUiService) { }


  public addNow(){
  let resp=this.service.addRoom(this.room);
    resp.subscribe((data)=>this.rooms=data);
  }

  ngOnInit(){
    let resp=this.service.getRooms();
    resp.subscribe((data)=>this.rooms=data);
  }

  public deleteRoom(roomId:number){
    let resp = this.service.deleteRoom(roomId).subscribe({
      next:(result)=>{
        console.log(result);
        
      },error:(err)=>{
        console.log(err);
        
      }
    })
  }

}
