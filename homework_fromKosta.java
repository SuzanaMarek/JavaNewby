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
        2.3. Ако фона е червен извади числото


        Scanner scanner = new Scanner(System.in);
        int totalSum = 0;
        String continueExecution;

        do {
            int randomNumber = (int) (Math.random() * 10);
            System.out.println("Random number: " + randomNumber);


            Random rand = new Random();
            boolean isGreenBackground = rand.nextBoolean();
            boolean isRedBackground = !isGreenBackground;

            if (isRedBackground) {
                System.out.println("Background is Red");
                totalSum = totalSum + randomNumber;
            } else {
                System.out.println("Background is Green");
                totalSum = totalSum - randomNumber;
            }
            System.out.println("Total Sum is " + totalSum);
            System.out.print("Would you like to continue? (yes/no): ");
            continueExecution = scanner.next();

        } while (continueExecution.equalsIgnoreCase("yes"));*/
                Scanner scanner = new Scanner(System.in);
                Random rand = new Random();

                boolean correct = true;
                int currentNumber = rand.nextInt(10);  // Генериране на начално число между 0 и 9

                while (correct) {
                    // Генериране на случайна операция (+ или -)
                    boolean isAddition = rand.nextBoolean();
                    int randomNumber = rand.nextInt(10);  // Генериране на случайно число между 0 и 9

                    int expectedResult;
                    if (isAddition) {
                        expectedResult = currentNumber + randomNumber;
                        System.out.println("Calculate: " + currentNumber + " + " + randomNumber);
                    } else {
                        expectedResult = currentNumber - randomNumber;
                        System.out.println("Calculate: " + currentNumber + " - " + randomNumber);
                    }

                    // Ако резултатът е извън диапазона (0, 9), коригирайте го
                    if (expectedResult < 0) {
                        expectedResult = 0;
                    } else if (expectedResult > 9) {
                        expectedResult = 9;
                    }
                    // Получаване на отговор от потребителя
                    System.out.print("Your answer (0-9): ");
                    int userAnswer = scanner.nextInt();

                    // Проверка на отговора
                    if (userAnswer == expectedResult) {
                        System.out.println("Correct!");
                        currentNumber = expectedResult;  // Актуализиране на текущото число
                    } else {
                        System.out.println("Incorrect. The correct answer was: " + expectedResult);
                        correct = false;
                    }
                }
                scanner.close();
                System.out.println("Game over!");
            }
        }

