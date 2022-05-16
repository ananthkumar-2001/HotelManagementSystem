import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RoomUiComponent } from './room-ui.component';

describe('RoomUiComponent', () => {
  let component: RoomUiComponent;
  let fixture: ComponentFixture<RoomUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RoomUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(RoomUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});