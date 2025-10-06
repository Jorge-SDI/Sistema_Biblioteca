#include <iostream>
using namespace std;

int main(){
	int opcion;

	do {
	cout << "Menu" << endl;
	cout << "0.Salir" << endl;
	cout << "1.Tortas" << endl;
	cout << "2.Palomitas" << endl;
	cout << "3.Agua" << endl;
	cout << "Por favor seleccione una opcion: ";
	cin >> opcion;
	
	if (opcion == 1){
		cout << "Ha seleccionado tortas: 5$" << endl;
	}
	else if (opcion == 2) {
		cout << "Ha seleccionado palomitas: 4$" << endl;
	}
		else if (opcion == 3){
			cout << "Ha seleccionado agua: 2$" << endl;
		}
			else if (opcion == 0){
				cout << "Saliendo del programa..." << endl;
				break;
			}
	else {
		cout << "Opcion invalida, ingrese de nuevo..." << endl;
		}

	} while (opcion != 0);

	return 0;
}