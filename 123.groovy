double getInitialHeight() {
    std::cout << "Введіть висоту вежі в метрах: ";
    double initialHeight;
    std::cin >> initialHeight;
    return initialHeight;
}

double calculateHeight(double initialHeight, int seconds) {
    double distanceFallen = (myConstants::gravity * seconds * seconds) / 2;
    double currentHeight = initialHeight - distanceFallen;
    return currentHeight > 0.0 ? currentHeight : 0.0; 
}
void printHeight(double height, int seconds) {
    if (height > 0.0) {
        std::cout << "Через " << seconds << " секунд, м'ячик знаходиться на висоті:\t" << height << " метрів\n";
    } else {
        std::cout << "Через " << seconds << " секунд, м'ячик торкнувся землі.\n";
    }
}
int main() {
    double initialHeight = getInitialHeight();
    int seconds = 0;

    while (true) {
        double height = calculateHeight(initialHeight, seconds);
        printHeight(height, seconds);

        if (height == 0.0) 
            break; 

        ++seconds;
    }

    return 0;
}