class CardNews extends HTMLElement {
  constructor() {
    super();

    const shadow = this.attachShadow({ mode: "open" });
    shadow.appendChild(this.build());
    shadow.appendChild(this.styles());
  }

  cardLeft() {
    const cardLeft = document.createElement("div");
    cardLeft.setAttribute("class", "card-left");

    const autor = document.createElement("span");
    autor.textContent = "By " + (this.getAttribute("autor") || "Anonymous");
    const linkTitle = document.createElement("a");
    linkTitle.textContent = this.getAttribute("title");
    linkTitle.href = this.getAttribute("link-url");
    const newsContent = document.createElement("p");
    newsContent.textContent = this.getAttribute("content");

    cardLeft.appendChild(autor);
    cardLeft.appendChild(linkTitle);
    cardLeft.appendChild(newsContent);

    return cardLeft;
  }

  cardRight() {
    const cardRight = document.createElement("div");
    cardRight.setAttribute("class", "card-right");
    const newsImage = document.createElement("img");
    newsImage.src = this.getAttribute("image") || "assets/foto-default.jpg";
    newsImage.alt = "Imagem da noticia";

    cardRight.appendChild(newsImage);

    return cardRight;
  }

  build() {
    const componentRoot = document.createElement("div");
    componentRoot.setAttribute("class", "card");

    componentRoot.appendChild(this.cardLeft());
    componentRoot.appendChild(this.cardRight());
    return componentRoot;
  }

  styles() {
    const style = document.createElement("style");
    style.textContent = `
    
  
  .card {
    width: 80%;
    box-shadow: 8px 8px 43px 3px rgba(0, 0, 0, 0.75);
    -webkit-box-shadow: 8px 8px 43px 3px rgba(0, 0, 0, 0.75);
    -moz-box-shadow: 8px 8px 43px 3px rgba(0, 0, 0, 0.75);
    display: flex;
    justify-content: space-between;
  }
  
  .card-left {
    display: flex;
    flex-direction: column;
    justify-content: center;
    padding-left: 10px;
  }
  
  .card-left > span {
    font-weight: 400;
  }
  
  .card-left > a {
    margin: 15px 0 0;
    font-size: 25px;
    text-decoration: none;
    color: #f00;
  }
  
  .card-left > p {
    color: gray;
  }
  
    `;
    return style;
  }
}

customElements.define("card-news", CardNews);
