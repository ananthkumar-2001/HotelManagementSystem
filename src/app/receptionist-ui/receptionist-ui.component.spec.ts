import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReceptionistUiComponent } from './receptionist-ui.component';

describe('ReceptionistUiComponent', () => {
  let component: ReceptionistUiComponent;
  let fixture: ComponentFixture<ReceptionistUiComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReceptionistUiComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReceptionistUiComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
