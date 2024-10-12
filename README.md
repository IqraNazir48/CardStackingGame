# Card Stacking Game

## Overview
The **Card Stacking Game** is a simple console-based game where the player must stack cards in ascending order. Players earn points for successfully stacking cards and have the option to either push (add) or pop (remove) cards from the stack. The goal is to stack at least 5 cards in as few turns as possible.

## How the Game Works

### Initial Setup
- The game greets the player and displays the card values:
  - **Ace**: 1
  - **Jack**: 11
  - **Queen**: 12
  - **King**: 13
  - Other cards: Numbers from 2-10
- Players can choose to continue or quit after each round.

### Game Play
- Each round consists of **10 turns** in which the player tries to stack at least **5 cards**.
- For each turn, a randomly generated card (between 1 and 13) is displayed.
- Players are given two choices:
  - **Push**: Add the card to the top of the stack.
  - **Pop**: Remove the top card from the stack.

### Pushing Cards
- A card can be pushed onto the stack if:
  - It is **greater** than the current top card.
  - If it is **less** than the top card, the player has the option to:
    - Discard the card without a score penalty.
    - Forcefully add it to the stack, which will cost points.

### Popping Cards
- The player can choose to pop (remove) the top card, which reduces the stack size and decreases their score.

### Win Condition
- The game ends when the player successfully stacks at least **5 cards**.
- If the player does this in fewer than 10 turns, they win.
- The game provides feedback on whether the player won or lost the round.

### Scoring
- **+2 points** for successfully adding a card to the stack.
- **-1 point** for forcefully adding a card (if its value is less than the top card).

## Code Structure

### 1. `CardStack` Class
The `CardStack` class manages the card stack and the game logic related to adding, removing, and displaying cards.

#### Attributes:
- `top`: Points to the top node (card) in the stack.
- `length`: Tracks the number of cards in the stack.
- `score`: Stores the player's current score.

#### Methods:
- `size()`: Returns the number of cards in the stack.
- `isEmpty()`: Checks if the stack is empty.
- `peek()`: Returns the top card's value without removing it.
- `push(int data)`: Adds a card to the stack and updates the score.
- `pop()`: Removes the top card from the stack and adjusts the score.
- `display()`: Displays all the cards currently in the stack.
- `getCardName(int data)`: Returns the name of a card based on its value (e.g., Ace, Jack, Queen, King).

### 2. `PlayingGame` Class
The `PlayingGame` class contains the main game loop and controls the flow of the game.

#### Game Flow:
- A `while` loop keeps the game running until the player chooses to quit.
- Each game round has 10 turns where the player can push or pop cards.
- Random cards are generated and displayed to the player each turn.
- The game checks if the player has successfully stacked at least 5 cards to determine if they win.
- The score is updated based on the player's actions.

