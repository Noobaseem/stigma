import { Component } from '@angular/core';
import { Constants } from '../utilities/constants';

@Component({
  selector: 'stimuli-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent {
	appTitle = Constants.APP_TITLE;
}