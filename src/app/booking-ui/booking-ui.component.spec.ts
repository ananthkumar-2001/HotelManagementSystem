import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BookingUiComponent } from './booking-ui.component';

describe('BookingUiComponent', () => {
  let component: BookingUiComponent;
  let fixture: ComponentFixture<BookingUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BookingUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BookingUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
