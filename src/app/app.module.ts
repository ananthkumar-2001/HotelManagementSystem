import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RoomUiComponent } from './room-ui/room-ui.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { GuestUiComponent } from './guest-ui/guest-ui.component';
import { HomeUiComponent } from './home-ui/home-ui.component';
import { InventoryUiComponent } from './inventory-ui/inventory-ui.component';
import { EmployeeUiComponent } from './employee-ui/employee-ui.component';
import { DepartmentUiComponent } from './department-ui/department-ui.component';
import { BookingUiComponent } from './booking-ui/booking-ui.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { LoginUiComponent } from './login-ui/login-ui.component';
import { ManagerUiComponent } from './manager-ui/manager-ui.component';
import { ReceptionistUiComponent } from './receptionist-ui/receptionist-ui.component';
import { ManagersRoomUiComponent } from './managers-room-ui/managers-room-ui.component';
import { MangersEmployeeUiComponent } from './mangers-employee-ui/mangers-employee-ui.component';
import { ManagersInventoryUiComponent } from './managers-inventory-ui/managers-inventory-ui.component';
import { ReceptionistBookingUiComponent } from './receptionist-booking-ui/receptionist-booking-ui.component';
import { ReceptionistGuestUiComponent } from './receptionist-guest-ui/receptionist-guest-ui.component';


@NgModule({
  declarations: [
    AppComponent,
    RoomUiComponent,
    GuestUiComponent,
    HomeUiComponent,
    InventoryUiComponent,
    EmployeeUiComponent,
    DepartmentUiComponent,
    BookingUiComponent,
    LoginUiComponent,
    ManagerUiComponent,
    ReceptionistUiComponent,
    ManagersRoomUiComponent,
    MangersEmployeeUiComponent,
    ManagersInventoryUiComponent,
    ReceptionistBookingUiComponent,
    ReceptionistGuestUiComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
