import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css'],
})
export class CardComponent implements OnInit {
  produtos: string[] = [];
  menuType: string = 'superuserasd';
  constructor() {
    this.produtos = [
      'mouse',
      'teclado',
      'mousepad',
      'head-phone',
      'mesa',
      'cadeira',
      'laptop',
    ];
  }

  remover(i: number) {
    this.produtos.splice(i, 1);
  }

  adicionar() {
    this.produtos.push('Jonas');
    this.produtos = this.produtos.sort(
      (a, b) => a.charCodeAt(1) + b.charCodeAt(1)
    );
  }

  ngOnInit(): void {}
}
