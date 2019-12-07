/**
 * @copyright Copyright VMware, Inc. All rights reserved. VMware Confidential.
 * @license For licensing, refer to VMware license README
 */

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { LeadComponent } from './components/lead/lead.component';
import { ReportComponent } from './components/report/report.component';

// register routes
const routes: Routes = [
  {
    path: 'home', component: HomeComponent
  },
  {
    path: 'lead',
    component: LeadComponent
  },
  {
    path: 'report',
    component: ReportComponent
  },
  {
    path: 'product',
    component: ReportComponent
  },
  {
    path: 'shack19',
    redirectTo: 'home',
    pathMatch: 'full'
  }, // default route for shack-19
  { path: '', redirectTo: 'home', pathMatch: 'full' },
  { path: '**', redirectTo: 'home' }
];

@NgModule({
  imports: [RouterModule.forRoot(routes, {
    onSameUrlNavigation: 'reload'
  })],
  exports: [RouterModule]
})
export class AppRoutingModule {}
