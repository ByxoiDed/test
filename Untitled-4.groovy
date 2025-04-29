
int getRandomNumber(int min, int max) {
    return min + rand() % (max - min + 1);
}
void playHiLoGame() {
    srand(static_cast<unsigned int>(time(0))); 
    rand(); 

    const int targetNumber = getRandomNumber(1, 100);
    int attemptsLeft = 7;

    std::cout << "Давайте пограємо! Я загадав число. У вас " << attemptsLeft << " спроб, щоб його вгадати.\n";

    while (attemptsLeft > 0) {
        std::cout << "Спроба #" << (8 - attemptsLeft) << ": ";
        int guess;
        std::cin >> guess;

        if (guess == targetNumber) {
            std::cout << "Вірно! Ви виграли!\n";
            return;
        } else if (guess > targetNumber) {
            std::cout << "Ваше число занадто велике.\n";
        } else {
            std::cout << "Ваше число занадто мале.\n";
        }

        --attemptsLeft;
    }

    std::cout << "Вибачте, ви програли. Загадане число було " << targetNumber << ".\n";
}
int main() {
    char playAgain = 'y';

    while (playAgain == 'y') {
        playHiLoGame();

        std::cout << "Бажаєте зіграти ще раз (y/n)? ";
        std::cin >> playAgain;

        while (playAgain != 'y' && playAgain != 'n') {
            std::cout << "Некоректне введення. Бажаєте зіграти ще раз (y/n)? ";
            std::cin >> playAgain;
        }
    }

    std::cout << "Дякуємо за гру!\n";
    return 0;
}