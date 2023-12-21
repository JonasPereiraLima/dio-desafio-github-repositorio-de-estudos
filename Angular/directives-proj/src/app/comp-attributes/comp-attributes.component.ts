import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-comp-attributes',
  templateUrl: './comp-attributes.component.html',
  styleUrls: ['./comp-attributes.component.css'],
})
export class CompAttributesComponent implements OnInit {
  estilo: string = 'disable';
  corFundo: string = '#ff0';
  corFont: string = '#0f8';
  item: string = '';
  lista: string[] = [];
  constructor() {}

  trocar() {
    if (this.estilo === 'disable') {
      this.estilo = 'enable';
    } else if (this.estilo === 'enable') {
      this.estilo = 'disable';
    }
  }

  adicionarLista(item: string) {
    this.lista.push(item);
  }

  ngOnInit(): void {}
}
