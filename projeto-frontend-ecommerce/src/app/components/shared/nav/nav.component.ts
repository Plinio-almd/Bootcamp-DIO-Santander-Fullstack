import { Component, OnInit } from '@angular/core';
import { faBasketShopping } from '@fortawesome/free-solid-svg-icons'

@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.css']
})
export class NavComponent implements OnInit {
  basketIcon = faBasketShopping;



  constructor() { }

  ngOnInit(): void {
  }

}
