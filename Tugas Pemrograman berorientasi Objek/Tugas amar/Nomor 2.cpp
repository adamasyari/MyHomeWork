#include <iostream>
using namespace std;

int main() {
    float IP;
    int sks;

    // Meminta input IP dari pengguna
    cout << "Masukkan IP Anda: ";
    cin >> IP;

    // Menentukan jumlah SKS berdasarkan IP
    if (IP >= 0.00 && IP <= 1.49) {
        sks = 12;
    } else if (IP >= 1.50 && IP <= 1.99) {
        sks = 15;
    } else if (IP >= 2.00 && IP <= 2.49) {
        sks = 18;
    } else if (IP >= 2.50 && IP <= 2.99) {
        sks = 21;
    } else if (IP >= 3.00 && IP <= 4.00) {
        sks = 24;
    } else {
        cout << "IP yang dimasukkan tidak valid." << endl;
        return 1; // Keluar dari program dengan kode error
    }

    // Menampilkan jumlah SKS yang dapat diambil
    cout << "Anda dapat mengambil " << sks << " SKS." << endl;

    return 0;
}
