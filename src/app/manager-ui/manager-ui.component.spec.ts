import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ManagerUiComponent } from './manager-ui.component';

describe('ManagerUiComponent', () => {
  let component: ManagerUiComponent;
  let fixture: ComponentFixture<ManagerUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ManagerUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ManagerUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
