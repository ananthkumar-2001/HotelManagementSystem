import { ComponentFixture, TestBed } from '@angular/core/testing';

import { InventoryUiComponent } from './inventory-ui.component';

describe('InventoryUiComponent', () => {
  let component: InventoryUiComponent;
  let fixture: ComponentFixture<InventoryUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ InventoryUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(InventoryUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
