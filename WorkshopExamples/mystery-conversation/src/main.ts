import { QuestionNode } from "./models/QuestionNode";
import { WitnessService } from "./services/WitnessService";

const questionDiv = document.getElementById("question")!;
const answersDiv = document.getElementById("answers")!;

let rootNode: QuestionNode | null = null; // Store the root node
let currentNode: QuestionNode | null = null;

function displayQuestion(node: QuestionNode) {
  questionDiv.textContent = node.question;
  answersDiv.innerHTML = ""; 
  node.answers.forEach((answer, index) => {
    const answerBtn = document.createElement("div");
    answerBtn.textContent = `${index + 1}. ${answer.response}`;
    answerBtn.className = "answer";
    answerBtn.onclick = () => handleAnswer(index);
    answersDiv.appendChild(answerBtn);
  });
}

function handleAnswer(answerIndex: number) {
  const selectedAnswer = currentNode?.answers[answerIndex];
  if (selectedAnswer?.nextNode) {
    currentNode = selectedAnswer.nextNode;
    displayQuestion(currentNode);
  } else {
    // Add a reset option when the conversation ends
    questionDiv.textContent = "The Countess has stopped talking.";
    answersDiv.innerHTML = "";
    const resetBtn = document.createElement("div");
    resetBtn.textContent = "Return to the beginning of the conversation";
    resetBtn.className = "answer";
    resetBtn.onclick = () => {
      if (rootNode) {
        currentNode = rootNode; // Reset to the root node
        displayQuestion(currentNode);
      }
    };
    answersDiv.appendChild(resetBtn);
  }
}

async function startInterview() {
  questionDiv.textContent = "Loading the Countess's responses...";
  rootNode = await WitnessService.getCountessData(); // Fetch and store the root node
  currentNode = rootNode; // Initialize currentNode with the root node
  displayQuestion(currentNode);
}

startInterview();
