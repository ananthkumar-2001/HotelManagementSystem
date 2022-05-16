import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagersInventoryUiComponent } from './managers-inventory-ui.component';

describe('ManagersInventoryUiComponent', () => {
  let component: ManagersInventoryUiComponent;
  let fixture: ComponentFixture<ManagersInventoryUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManagersInventoryUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagersInventoryUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
