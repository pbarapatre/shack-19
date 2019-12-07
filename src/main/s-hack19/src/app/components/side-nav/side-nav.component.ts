import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.css']
})
export class SideNavComponent implements OnInit {

  entityItems: any[] = [
    {
      name: 'Leads',
      icon: 'grid-view',
      entity_type: 'Lead'
    },
    {
      name: 'Reports',
      icon: 'view-list',
      entity_type: 'Product'
    }
  ];

  //dashboardItems: EntityList[] = [];
  // errorMessage = '';
  // collapsed = false;

  constructor() { }

  ngOnInit() {
  }

}
