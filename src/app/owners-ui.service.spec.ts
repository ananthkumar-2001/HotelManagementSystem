import { TestBed } from '@angular/core/testing';

import { OwnersUiService } from './owners-ui.service';

describe('OwnersUiService', () => {
  let service: OwnersUiService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OwnersUiService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
