// Possible choices
const choices = ["rock", "paper", "scissors"];

// Function to get the computer's choice
function getComputerChoice() {
    const randomIndex = Math.floor(Math.random() * 3);
    return choices[randomIndex];
}

// Function to determine the winner
function determineWinner(playerChoice, computerChoice) {
    if (playerChoice === computerChoice) {
        return "It's a tie!";
    } else if ((playerChoice === "rock" && computerChoice === "scissors") ||
               (playerChoice === "paper" && computerChoice === "rock") ||
               (playerChoice === "scissors" && computerChoice === "paper")) {
        return "You win!";
    } else {
        return "Computer wins!";
    }
}

// Function to display the game result
function displayResult(playerChoice, computerChoice, result) {
    document.getElementById("player-choice").src = `images/${playerChoice}.png`;
    document.getElementById("computer-choice").src = `images/${computerChoice}.png`;
    document.getElementById("result").innerHTML = result;
}

// Function to start the game
function startGame() {
    const playerChoice = prompt("Enter your choice (rock, paper, or scissors):").toLowerCase();
    if (choices.includes(playerChoice)) {
        const computerChoice = getComputerChoice();
        const result = determineWinner(playerChoice, computerChoice);
        displayResult(playerChoice, computerChoice, result);
    } else {
        alert("Invalid choice. Please choose rock, paper, or scissors.");
    }
}

// Function to initialize the game
function initGame() {
    document.getElementById("game").style.display = "block";
}

// Initialize the game when the page loads
window.onload = initGame;
