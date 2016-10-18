import { StigmaWebappPage } from './app.po';

describe('stigma-webapp App', function() {
  let page: StigmaWebappPage;

  beforeEach(() => {
    page = new StigmaWebappPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
