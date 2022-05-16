import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagersRoomUiComponent } from './managers-room-ui.component';

describe('ManagersRoomUiComponent', () => {
  let component: ManagersRoomUiComponent;
  let fixture: ComponentFixture<ManagersRoomUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManagersRoomUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagersRoomUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
