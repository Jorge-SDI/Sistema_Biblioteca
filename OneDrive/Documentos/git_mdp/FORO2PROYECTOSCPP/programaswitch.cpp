#include <iostream>
using namespace std;

int main() {
    int opcion;

    do {
    cout << "Menu" << endl;
    cout << "0.Salir" << endl;
    cout << "1.Tortas" << endl;
    cout << "2.Palomitas" << endl;
    cout << "3.Agua" << endl;
    cout << "Por favor seleccione una opcion: ";
    cin >> opcion;

    switch (opcion) {
    case 0:
        cout << "Saliendo del programa..." << endl;
        break;
    case 1:
        cout << "Ha seleccionado tortas: 5$" << endl;
        break;
    case 2:
        cout << "Ha seleccionado palomitas: 4$" << endl;
        break;
    case 3:
        cout << "Ha seleccionado agua: 2$" << endl;
        break;
    default:
        cout << "Opcion invalida, ingrese de nuevo..." << endl;
        break;
    }
} while (opcion != 0);
    
    return 0;
}