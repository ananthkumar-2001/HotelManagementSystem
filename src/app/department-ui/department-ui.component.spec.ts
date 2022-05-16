import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DepartmentUiComponent } from './department-ui.component';

describe('DepartmentUiComponent', () => {
  let component: DepartmentUiComponent;
  let fixture: ComponentFixture<DepartmentUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DepartmentUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DepartmentUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
