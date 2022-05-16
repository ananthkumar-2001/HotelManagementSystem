import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReceptionistBookingUiComponent } from './receptionist-booking-ui.component';

describe('ReceptionistBookingUiComponent', () => {
  let component: ReceptionistBookingUiComponent;
  let fixture: ComponentFixture<ReceptionistBookingUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReceptionistBookingUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReceptionistBookingUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
