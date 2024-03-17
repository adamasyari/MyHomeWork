#include <iostream>
using namespace std;

int main() {
    char exit;
    do {
        int paket;
        cout << "******************************************" << endl;
        cout << "*   Silahkan Pilih Kartu Internet Anda   *" << endl;
        cout << "******************************************" << endl;
        cout << "1. Telkomsel" << endl;
        cout << "2. Indosat" << endl;
        cout << "3. Keluar" << endl;
        cout << "Pilihan anda: ";
        cin >> paket;
        switch (paket) {
            case 1: {
                int a;
                do {
                    cout << "Telkomsel" << endl << endl;
                    cout << "1. Paket 10GB 30 hari" << endl;
                    cout << "2. Paket 5GB 30 hari" << endl;
                    cout << "3. Paket 7GB 7 hari" << endl;
                    cout << "4. Kembali ke menu utama" << endl;
                    cout << "Masukan pilihan anda: ";
                    cin >> a;
                    switch (a) {
                        case 1:
                            cout << "Harga paket ini 50rb";
                            break;
                        case 2:
                            cout << "Harga paket ini 30rb";
                            break;
                        case 3:
                            cout << "Harga paket ini 25rb";
                            break;
                        case 4:
                            system("cls");
                            main();
                            break;
                        default:
                            cout << "Kode tidak valid" << endl;
                            continue;
                    }
                    char beli;
                    cout << "\nBeli paket (y/t): ";
                    cin >> beli;
                    if (beli == 'y' || beli == 'Y') {
                        cout << "Selamat anda telah membeli paket ini" << endl;
                    }else
                        cout << "Silahkan pilih lagi" << endl;
                } while (a != 4);
                break;
            }
            case 2: {
                int a;
                do {
                    cout << "Indosat" << endl << endl;
                    cout << "1. Paket 15GB 30 hari" << endl;
                    cout << "2. Paket 10GB 30 hari" << endl;
                    cout << "3. Paket 15GB 5 hari" << endl;
                    cout << "4. Kembali ke menu utama" << endl;
                    cout << "Masukan pilihan anda: ";
                    cin >> a;
                    switch (a) {
                        case 1:
                            cout << "Harga paket ini 60rb";
                            break;
                        case 2:
                            cout << "Harga paket ini 40rb";
                            break;
                        case 3:
                            cout << "Harga paket ini 30rb";
                            break;
                        case 4:
                            system("cls");
                            main();
                            break;
                        default:
                            cout << "Kode tidak valid" << endl;
                            continue;
                    }
                    char beli;
                    cout << "\nBeli paket (y/t): ";
                    cin >> beli;
                    if (beli == 'y' || beli == 'Y') {
                        cout << "Selamat anda telah membeli paket ini" << endl;
                    }else
                        cout << "Silahkan pilih lagi" << endl;
                } while (a != 4);
                break;
            }
            case 3:
                break;
            default:
                cout << "Pilihan tidak valid";
                break;
        }
        if (paket != 3) {
            cout << "\n\nYakin ingin keluar? (y/t): ";
            cin >> exit;
            system("cls");
        }
    } while (exit == 't' || exit == 'T');
    cout << "Terimakasih";

}
