import { StimuliClientPage } from './app.po';

describe('stimuli-client App', function() {
  let page: StimuliClientPage;

  beforeEach(() => {
    page = new StimuliClientPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
