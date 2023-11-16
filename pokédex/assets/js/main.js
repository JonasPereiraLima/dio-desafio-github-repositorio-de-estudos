const pokemons = document.querySelector("ol.pokemons");

// buscarInfoDosPokemons(listaDasUrlsDosPokemons);

async function buscarPokemons() {
  try {
    const data = await fetch("https://pokeapi.co/api/v2/pokemon");
    const resposta = await data.json();

    return buscarInfoDosPokemons(resposta.results);
    // console.log(resposta.results);
  } catch (error) {
    console.log(error);
  } finally {
    console.log("Tarefa de busca de pokémons finalizada!");
    // console.log(listaDasUrlsDosPokemons);
  }
}

async function buscarInfoDosPokemons(listaDosPokemons) {
  return listaDosPokemons.map(async (v) => {
    const data = await fetch(v.url);
    const resposta = await data.json();

    const liPokemon = document.createElement("li");
    liPokemon.className = "pokemon";

    const spanNumber = document.createElement("span");
    spanNumber.textContent = "#001";
    const spanName = document.createElement("span");
    spanName.textContent = resposta.name;
    spanNumber.className = "number";
    spanName.className = "name";

    const divDetail = document.createElement("div");
    divDetail.className = "detail";
    const olTypes = document.createElement("ol");
    olTypes.className = "types";

    // console.log(resposta.types[0].type.name);
    resposta.types.forEach((info) => {
      const liType = document.createElement("li");
      liType.className = "type";
      liType.textContent = info.type.name;
      olTypes.appendChild(liType);
    });

    const img = document.createElement("img");
    img.src = resposta.sprites.other.dream_world.front_default;
    img.alt = resposta.name;

    divDetail.appendChild(olTypes);
    divDetail.appendChild(img);

    liPokemon.appendChild(spanNumber);
    liPokemon.appendChild(spanName);
    liPokemon.appendChild(divDetail);
    pokemons.appendChild(liPokemon);
  });
}

const listaPokemons = buscarPokemons();
