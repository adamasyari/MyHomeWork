#include <iostream>
using namespace std;

int main() {
    int bilangan1, bilangan2;

    // Meminta input dari pengguna
    cout << "Masukkan bilangan pertama: ";
    cin >> bilangan1;
    cout << "Masukkan bilangan kedua: ";
    cin >> bilangan2;

    // Membandingkan bilangan dan menampilkan yang lebih kecil
    if (bilangan1 < bilangan2) {
        cout << "Bilangan " << bilangan1 << " lebih kecil dari " << bilangan2 << endl;
    } else if (bilangan2 < bilangan1) {
        cout << "Bilangan " << bilangan2 << " lebih kecil dari " << bilangan1 << endl;
    } else {
        cout << "Kedua bilangan sama besar" << endl;
    }

    return 0;
}
