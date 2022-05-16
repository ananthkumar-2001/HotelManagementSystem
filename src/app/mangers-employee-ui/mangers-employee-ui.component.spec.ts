import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MangersEmployeeUiComponent } from './mangers-employee-ui.component';

describe('MangersEmployeeUiComponent', () => {
  let component: MangersEmployeeUiComponent;
  let fixture: ComponentFixture<MangersEmployeeUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ MangersEmployeeUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(MangersEmployeeUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
