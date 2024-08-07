package org.example;

import java.util.Random;
import java.util.Scanner;

public class homework_fromKosta {
    public static void main(String[] args) {
        /*Как се генерират числа в Java?  - s Math
        1.1. Генерирай числата от 0 до 9 на случаен принцип - с формула

        Как се задава background?
        2.1. Генерирай "Зелен" или "Червен" фон
        2.2. Ако фона е зелен добави числото към предишното
        2.3. Ако фона е червен извади числото*/

                Scanner scanner = new Scanner(System.in);
                Random rand = new Random();

                boolean correct = true;
                int currentNumber = rand.nextInt(10);

                while (correct) {
                    boolean isAddition = rand.nextBoolean();
                    int randomNumber = rand.nextInt(10);

                    int expectedResult;
                    if (isAddition) {
                        expectedResult = currentNumber + randomNumber;
                        System.out.println("Calculate: " + currentNumber + " + " + randomNumber);
                    } else {
                        expectedResult = currentNumber - randomNumber;
                        System.out.println("Calculate: " + currentNumber + " - " + randomNumber);
                    }
                    if (expectedResult < 0) {
                        expectedResult = 0;
                    } else if (expectedResult > 9) {
                        expectedResult = 9;
                    }
                    System.out.print("Your answer (0-9): ");
                    int userAnswer = scanner.nextInt();

                    if (userAnswer == expectedResult) {
                        System.out.println("Correct!");
                        currentNumber = expectedResult;
                    } else {
                        System.out.println("Incorrect. The correct answer was: " + expectedResult);
                        correct = false;
                    }
                }
                scanner.close();
                System.out.println("Game over!");
            }
        }