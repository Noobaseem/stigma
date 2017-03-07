import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { LandingComponent } from './landing.component';
import { EventsSidebarComponent } from './events-sidebar/events-sidebar.component';
import { LandingContentComponent } from './landing-content/landing-content.component';

@NgModule({
  declarations: [
    LandingComponent,
    EventsSidebarComponent,
    LandingContentComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  exports: [
    LandingComponent,
    EventsSidebarComponent,
    LandingContentComponent
  ],
  providers: [],
})
export class LandingModule { }
