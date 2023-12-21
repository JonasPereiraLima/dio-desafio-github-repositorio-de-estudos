import { Component, OnInit } from '@angular/core';
import { PokemonData } from 'src/app/models/pokemonData';
import { PokemonService } from 'src/app/services/pokemon.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css'],
})
export class CardComponent implements OnInit {
  pokemon?: PokemonData;

  constructor(private service: PokemonService) {}

  ngOnInit(): void {
    this.getPokemon('pikachu');
  }

  getPokemon(searchPokemon: string) {
    this.service.getPokemon(searchPokemon).subscribe({
      next: (res) => {
        (this.pokemon = {
          name: res.name,
          id: res.id,
          sprites: { front_default: res.sprites.front_default },
          types: res.types,
        }),
          console.log(this.pokemon);
      },
      error: (err) => console.log(err),
    });
  }
}
