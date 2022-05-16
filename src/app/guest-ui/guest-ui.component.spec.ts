import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GuestUiComponent } from './guest-ui.component';

describe('GuestUiComponent', () => {
  let component: GuestUiComponent;
  let fixture: ComponentFixture<GuestUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ GuestUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(GuestUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
