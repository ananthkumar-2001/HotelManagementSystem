import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReceptionistGuestUiComponent } from './receptionist-guest-ui.component';

describe('ReceptionistGuestUiComponent', () => {
  let component: ReceptionistGuestUiComponent;
  let fixture: ComponentFixture<ReceptionistGuestUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReceptionistGuestUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReceptionistGuestUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
