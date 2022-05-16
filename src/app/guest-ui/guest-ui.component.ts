import { Component, OnInit } from '@angular/core';
import { Guest } from '../guest';
import { OwnersUiService } from '../owners-ui.service';

@Component({
  selector: 'app-guest-ui',
  templateUrl: './guest-ui.component.html',
  styleUrls: ['./guest-ui.component.css']
})
export class GuestUiComponent implements OnInit {

  guest: Guest = new Guest("", 0, "", "", "");

  guests: any;
  guestId: number | undefined;

  constructor(private service: OwnersUiService) { }

  public addGuest() {
    this.service.addRoom(this.guest);

  }

  ngOnInit() {
    let resp = this.service.getGuests();
    resp.subscribe((data: any) => this.guests = data);
  }

  public deleteGuest(guestId:number){
    let resp = this.service.deleteGuest(guestId).subscribe({
      next:(result)=>{
        console.log(result);
        
      },error:(err)=>{
        console.log(err);
        
      }
    })
  }

}
