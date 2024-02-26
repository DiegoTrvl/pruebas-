#include <iostream>

using namespace std;
int main() {
//Ejercicio#3
    //Escribir un programa que calcule e imprima la suma de los primeros 100 números naturales.

    int suma = 0;
    for (int i = 1; i <= 100; i++) {
        suma += i;
    }
    std::cout << "La suma de los primeros 100 números naturales es: " << suma <<endl;
    return 0;
}