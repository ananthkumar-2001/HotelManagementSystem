import { Component, OnInit } from '@angular/core';
import { Booking } from '../Booking';
import { OwnersUiService } from '../owners-ui.service';

@Component({
  selector: 'app-receptionist-booking-ui',
  templateUrl: './receptionist-booking-ui.component.html',
  styleUrls: ['./receptionist-booking-ui.component.css']
})
export class ReceptionistBookingUiComponent implements OnInit {

  booking : Booking = new Booking(0,0,"","",false);

  bookings: any;

  constructor(private service:OwnersUiService) { }


  public addBooking(){
  let resp=this.service.addBooking(this.booking);
    resp.subscribe((data: any)=>this.bookings=data);
  }

  ngOnInit(){
    let resp=this.service.getBookings();
    resp.subscribe((data: any)=>this.bookings=data);

  }

  public deleteBooking(bookingId:string){
    let resp = this.service.deleteBooking(bookingId).subscribe({
      next:(result)=>{
        console.log(result);
        
      },error:(err)=>{
        console.log(err);
        
      }
    })
  }

}