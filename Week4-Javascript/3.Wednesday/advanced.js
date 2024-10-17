function buildCard(card) {
    let cardTextTag = document.createElement("p");
    cardTextTag.classList.add("card-text");
    cardTextTag.textContent = card.description; 

    let smallTag = document.createElement("small");
    smallTag.classList.add("text-body-secondary");
    smallTag.textContent = card.updatedAt; 

    cardTextTag.appendChild(smallTag);

    let firstCardTextTag = document.createElement("p");
    firstCardTextTag.classList.add("card-text");
    firstCardTextTag.textContent = card.additionalText; 

    let cardDiv = document.createElement("div");
    cardDiv.classList.add("card", "mb-3");
    cardDiv.style.maxWidth = "540px";

    let rowDiv = document.createElement("div");
    rowDiv.classList.add("row", "g-0");

    let colDiv = document.createElement("div");
    colDiv.classList.add("col-md-4");

    let imgTag = document.createElement("img");
    imgTag.src = card.imageUrl;
    imgTag.classList.add("img-fluid", "rounded-start");
    imgTag.alt = card.imgAlt;

    let rightColDiv = document.createElement("div");
    rightColDiv.classList.add("col-md-8");

    let cardBodyDiv = document.createElement("div");
    cardBodyDiv.classList.add("card-body");

    let headerTag = document.createElement("h5");
    headerTag.classList.add("card-title");
    headerTag.textContent = card.title; 

    colDiv.appendChild(imgTag);
    rowDiv.appendChild(colDiv);
    rowDiv.appendChild(rightColDiv);
    cardBodyDiv.appendChild(headerTag);
    cardBodyDiv.appendChild(firstCardTextTag);
    cardBodyDiv.appendChild(cardTextTag);
    rightColDiv.appendChild(cardBodyDiv);
    cardDiv.appendChild(rowDiv);

    document.body.appendChild(cardDiv); 
}
