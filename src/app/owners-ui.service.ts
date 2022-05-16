import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
@Injectable({
  providedIn: 'root'
})
export class OwnersUiService {
  

  constructor(private http:HttpClient) { }

  public addRoom(room: any){
    return this.http.post("http://localhost:8100/room-service/room/add",room,{responseType:'text' as 'json'});
  }

  public getRooms(){
    return this.http.get("http://localhost:8100/room-service/room/get");
  }

  public deleteRoom(roomId:number){
    return this.http.delete("http://localhost:8100/room-service/room/delete/"+roomId);
  }

  public addGuest(guest: any){
    return this.http.post("http://localhost:8100/guest-service/guest/add",guest,{responseType:'text' as 'json'});
  }

  public getGuests(){
    return this.http.get("http://localhost:8100/guest-service/guest/get");
  }

  public deleteGuest(guestId:number,){
    return this.http.delete("http://localhost:8100/guest-service/guest/delete/"+guestId);
  }

  public addEmployee(employee: any){
    return this.http.post("http://localhost:8100/employee-service/employee/add",employee,{responseType:'text' as 'json'});
  }

  public getEmployees(){
    return this.http.get("http://localhost:8100/employee-service/employee/get");
  }

  public deleteEmployee(employeeId:number){
    return this.http.delete("http://localhost:8100/employee-service/employee/delete/"+employeeId);
  }

  public addBooking(booking: any){
    return this.http.post("http://localhost:8100/booking-service/booking/add",booking,{responseType:'text' as 'json'});
  }

  public getBookings(){
    return this.http.get("http://localhost:8100/booking-service/booking/get");
  }

  public deleteBooking(bookingId:string){
    return this.http.delete("http://localhost:8100/booking-service/booking/delete/"+bookingId);
  }

  public addDepartment(department: any){
    return this.http.post("http://localhost:8100/department-service/department/add",department,{responseType:'text' as 'json'});
  }

  public getDepartments(){
    return this.http.get("http://localhost:8100/department-service/department/get");
  }

  public deleteDepartment(departmentId:number){
    return this.http.delete("http://localhost:8100/department-service/department/delete/"+departmentId);
  }

  public addInventory(inventory: any){
    return this.http.post("http://localhost:8100/inventory-service/inventory/add",inventory,{responseType:'text' as 'json'});
  }

  public getInventorys(){
    return this.http.get("http://localhost:8100/inventory-service/inventory/get");
  }
  
  public deleteInventory(inventoryId:number){
    return this.http.delete("http://localhost:8100/inventory-service/inventory/delete/"+inventoryId);
  }

}
function guest(arg0: string, guest: any, arg2: { responseType: "json"; }) {
  throw new Error('Function not implemented.');
}

