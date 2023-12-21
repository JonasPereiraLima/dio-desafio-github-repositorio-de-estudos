import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css'],
})
export class CardComponent implements OnInit {
  constructor(private activeRoute: ActivatedRoute, private router: Router) {
    // http://localhost:4200/portfolio/2
    this.activeRoute.params.subscribe((res) => console.log(res));
    this.activeRoute.firstChild?.params.subscribe((res) => console.log(res));
    //http://localhost:4200/portfolio/2?{name=jonas&age=21}
    this.activeRoute.queryParams.subscribe((res) => console.log(res));
  }

  ngOnInit(): void {
    // setInterval(() => {
    //   // força um redirecionamento para esta rota
    //   this.router.navigate(['/']);
    // }, 5000);
  }
}
