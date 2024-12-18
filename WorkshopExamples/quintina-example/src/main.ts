import { Deck } from "./models/Deck";
import { deckService } from "./services/DeckService";

let currentDeck: Deck | null = null;
let currentCardIndex = 0;
let showingAnswer = false;

async function loadDecks() {
    const dropdown = document.getElementById("deck-dropdown") as HTMLSelectElement;
    const decks = await deckService.getAllDecks();

    decks.forEach((deck) => {
        const option = document.createElement("option");
        option.value = deck.id.toString();
        option.textContent = deck.name;
        dropdown.appendChild(option);
    });

    dropdown.addEventListener("change", () => {
        const selectedDeckId = parseInt(dropdown.value);
        currentDeck = decks.find((deck) => deck.id === selectedDeckId) || null;
        currentCardIndex = 0;
        showingAnswer = false;
        updateFlashcard();
        updateButtons();
    });
}

function updateFlashcard() {
    const flashcardElement = document.getElementById("flashcard")!;
    const messageElement = document.getElementById("message")!;

    if (currentDeck && currentDeck.cards.length > 0) {
        const currentCard = currentDeck.cards[currentCardIndex];
        flashcardElement.textContent = showingAnswer ? currentCard.answer : currentCard.question;
        flashcardElement.classList.remove("empty");
        messageElement.textContent = "";
    } else {
        flashcardElement.textContent = "Please select a deck to start.";
        flashcardElement.classList.add("empty");
        messageElement.textContent = "";
    }
}

function updateButtons() {
    const prevBtn = document.getElementById("prev-btn") as HTMLButtonElement;
    const flipBtn = document.getElementById("flip-btn") as HTMLButtonElement;
    const nextBtn = document.getElementById("next-btn") as HTMLButtonElement;

    if (currentDeck && currentDeck.cards.length > 0) {
        prevBtn.disabled = currentCardIndex === 0;
        flipBtn.disabled = false;
        nextBtn.disabled = currentCardIndex === currentDeck.cards.length - 1;
    } else {
        prevBtn.disabled = true;
        flipBtn.disabled = true;
        nextBtn.disabled = true;
    }
}

document.addEventListener("DOMContentLoaded", async () => {
    await loadDecks();

    document.getElementById("flip-btn")!.addEventListener("click", () => {
        showingAnswer = !showingAnswer;
        updateFlashcard();
    });

    document.getElementById("prev-btn")!.addEventListener("click", () => {
        if (currentCardIndex > 0) {
            currentCardIndex--;
            showingAnswer = false;
            updateFlashcard();
            updateButtons();
        }
    });

    document.getElementById("next-btn")!.addEventListener("click", () => {
        if (currentDeck && currentCardIndex < currentDeck.cards.length - 1) {
            currentCardIndex++;
            showingAnswer = false;
            updateFlashcard();
            updateButtons();
        } else {
            const messageElement = document.getElementById("message")!;
            messageElement.textContent = "No more cards. Please pick another deck.";
        }
    });
});