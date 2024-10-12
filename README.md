﻿# CardStackingGame
Overview:
The Card Stacking Game is a simple console-based game where the player must stack cards in a specific order (ascending). The player gains points for successfully stacking cards, and the game provides choices whether to push (add) or pop (remove) cards from the stack. The goal is to stack at least five cards in the fewest turns possible.

How the Game Works:
Initial Setup:
The game welcomes the player and shows the card values:
Ace: 1
Jack: 11
Queen: 12
King: 13
Other cards: Numbers from 2-10
The player can choose to continue or quit after each round.
Game Play:
The player has 10 turns per round to stack at least 5 cards.
For each turn, the player is shown a randomly generated card (with values between 1 and 13).
The player then has two options:
Push: Add the card to the top of the stack.
Pop: Remove the top card from the stack.
Pushing Cards:
The card can be pushed onto the stack if:
It is greater than the current top card.
If the card is less than the top card, the player has the option to discard the card or forcefully add it, but at the cost of some points.
Popping Cards:
The player can pop the top card from the stack, reducing the stack's size and decreasing their score.
Win Condition:
The game ends when the player stacks at least 5 cards. If the player successfully does this in fewer than 10 turns, they win.
The game provides feedback based on whether the player won or lost.
Score:
The player earns 2 points for successfully adding a card to the stack.
1 point is deducted when the player forcefully adds a card (if the card's value is less than the top card).

Code Structure:
1. CardStack Class:
Purpose: Implements the stack to manage cards.
Attributes:
top: Points to the top node (card) in the stack.
length: Stores the number of cards in the stack.
score: Stores the player's score.
Methods:
size(): Returns the size of the stack.
isEmpty(): Checks if the stack is empty.
peek(): Returns the top card's value without removing it.
push(int data): Adds a card to the top of the stack and updates the score.
pop(): Removes the top card from the stack and decrements the score.
display(): Prints all the cards currently in the stack.
getCardName(int data): Returns the name of a card based on its value (e.g., 1 is "Ace", 11 is "Jack").
2. PlayingGame Class:
Purpose: The main game loop and logic are implemented here.
Game Flow:
A while loop keeps the game running until the player decides to quit.
In each game round, the player has 10 turns to push or pop cards.
Random cards are generated and presented to the player each turn.
The game checks if the stack has 5 or more cards, at which point the player wins the round.
The player’s score is updated based on their actions.
