#include <iostream>
using namespace std;

int main() {
    float ipk;

    // Meminta input IPK dari pengguna
    cout << "Masukkan IPK Anda: ";
    cin >> ipk;

    // Fungsi untuk menentukan klasifikasi kelulusan berdasarkan IPK
    if (ipk == 4) {
        cout << "Cumlaude ";
    } else if (ipk == 3 && ipk > 2) {
        cout << "Memuaskan";
    } else if (ipk > 2) {
        cout << "Lulus ";
    } else {
        cout << "Tidak lulus ";
    }

    // Memanggil fungsi untuk menentukan klasifikasi kelulusan dan menampilkan hasilnya
    cout << "Klasifikasi kelulusan Anda: " << ipk << endl;

    return 0;
}
