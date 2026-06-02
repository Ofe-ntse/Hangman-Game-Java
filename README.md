# Hangman Game - Java

A classic Hangman game implemented in Java using Swing for the graphical user interface.

## Overview

This project is a GUI-based Hangman game where players guess letters to figure out a hidden word within a limited number of attempts.

## Features

- Interactive GUI: Built with Java Swing for a user-friendly interface
- Word Guessing: Guess one letter at a time to reveal the hidden word
- Attempt Tracking: Keep track of remaining attempts
- Input Validation: 
  - Prevents empty guesses
  - Allows only single letter input
  - Prevents duplicate letter guesses
- Win/Lose Conditions: 
  - Win by revealing all letters before running out of attempts
  - Lose when attempts reach zero

## How to Play

1. Run the application
2. A hidden word will be displayed as dashes (e.g., `-----`)
3. Enter a single letter in the text field and click "Guess"
4. Correct guesses will reveal the letter's positions in the word
5. Incorrect guesses will reduce your attempt count
6. Win by revealing all letters or lose when attempts reach zero

## Game Rules

- You start with 5 attempts
- Each guess must be a single letter (case-insensitive)
- You cannot guess the same letter twice
- The game ends when you either:
  - Successfully reveal all letters (WIN)
  - Run out of attempts (GAME OVER)

## Project Structure

- `GUI.java` - Main class containing the game logic and GUI implementation

## Current Settings

- Secret word: "APPLE"
- Starting attempts: 5
- Window size: 600x500 pixels

## Future Enhancements

- Multiple word difficulty levels
- Random word selection from a word list
- Score tracking
- Replay functionality
- Hangman drawing progression

## Requirements

- Java SE 8 or higher
- Swing library (included in JDK)

## Author

Ofentse Nkosi
