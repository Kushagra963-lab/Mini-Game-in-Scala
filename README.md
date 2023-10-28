# Prime Time App

## Description

This is a Scala program that generates a list of prime numbers within a specified range and plays a game with the user. The game involves asking the user to determine whether random numbers within the range are prime or not. It provides feedback on the correctness of their answers and allows the user to exit the game.

## Features

- Generates a list of prime numbers in the range of 201 to 499.
- Plays an interactive game that challenges the user to identify prime numbers.
- Provides feedback on the user's answers, indicating whether they are correct.
- Allows the user to exit the game at any time.

## Prerequisites

- Scala (Make sure you have Scala installed on your system)
- No additional libraries or dependencies are required.

## How to Run

1. Save the provided Scala code to a file, e.g., `PrimeTimeApp.scala`.
2. Compile the program using the Scala compiler:

   ```shell
   scalac PrimeTimeApp.scala
Run the program:

shell
Copy code
scala PrimeTimeApp
Follow the on-screen instructions to play the game.

## Gameplay

- The program generates a list of prime numbers between 201 and 499.
- It will repeatedly generate random numbers within this range and ask the user if the number is prime.
- The user can respond with "Y" for yes (if they believe it's prime), "N" for no (if they believe it's not prime), or "X" to exit the game.
- After each guess, the program will reveal whether the user's answer was correct and display if the number is indeed prime or not.

## Rules

- The program avoids generating even or multiples of 5 as the target numbers to ensure a fair game.
- The game continues until the user chooses to exit by typing "X."

## Files
- PrimeTimeApp.scala: The main Scala script for the game.
No additional files are required to run the program.

## Acknowledgments
Developed by [Kushagra Singh Gaur]
Special thanks to the Scala and programming community for their support and inspiration.

## Contact

For questions or issues, please contact [kushagrasingh.gaur2022@vitstudent.ac.in].


