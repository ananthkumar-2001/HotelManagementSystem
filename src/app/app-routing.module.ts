import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookingUiComponent } from './booking-ui/booking-ui.component';
import { DepartmentUiComponent } from './department-ui/department-ui.component';
import { EmployeeUiComponent } from './employee-ui/employee-ui.component';
import { GuestUiComponent } from './guest-ui/guest-ui.component';
import { HomeUiComponent } from './home-ui/home-ui.component';
import { InventoryUiComponent } from './inventory-ui/inventory-ui.component';
import { LoginUiComponent } from './login-ui/login-ui.component';
import { ManagerUiComponent } from './manager-ui/manager-ui.component';
import { ManagersInventoryUiComponent } from './managers-inventory-ui/managers-inventory-ui.component';
import { ManagersRoomUiComponent } from './managers-room-ui/managers-room-ui.component';
import { MangersEmployeeUiComponent } from './mangers-employee-ui/mangers-employee-ui.component';
import { ReceptionistBookingUiComponent } from './receptionist-booking-ui/receptionist-booking-ui.component';
import { ReceptionistGuestUiComponent } from './receptionist-guest-ui/receptionist-guest-ui.component';
import { ReceptionistUiComponent } from './receptionist-ui/receptionist-ui.component';
import { RoomUiComponent } from './room-ui/room-ui.component';

const routes: Routes = [
  {path:"",redirectTo:"login",pathMatch:"full"},
  {path:"login",component:LoginUiComponent},
  {path:"home",component:HomeUiComponent},
  {path:"room",component:RoomUiComponent},
  {path:"guest",component:GuestUiComponent},
  {path:"booking",component:BookingUiComponent},
  {path:"employee",component:EmployeeUiComponent},
  {path:"inventory",component:InventoryUiComponent},
  {path:"department",component:DepartmentUiComponent},
  {path:"manager",component:ManagerUiComponent},
  {path:"receptionist",component:ReceptionistUiComponent},
  {path:"manager-room",component:ManagersRoomUiComponent},
  {path:"manager-employee",component:MangersEmployeeUiComponent},
  {path:"manager-inventory",component:ManagersInventoryUiComponent},
  {path:"receptionist-booking",component:ReceptionistBookingUiComponent},
  {path:"receptionist-guest",component:ReceptionistGuestUiComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
