import { PbkPage } from './app.po';

describe('pbk App', function() {
  let page: PbkPage;

  beforeEach(() => {
    page = new PbkPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
