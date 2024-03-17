#include <iostream>
using namespace std;

// Fungsi untuk menentukan apakah suatu tahun adalah tahun kabisat
bool isLeapYear(int year) {
    if (year % 4 == 0) {
        if (year % 100 == 0) {
            if (year % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    } else {
        return false;
    }
}

int main() {
    int daysOfWeek = 1; // 1 Januari 1901 adalah hari Selasa (1 = Senin, 2 = Selasa, dst.)
    int sundaysOnFirst = 0;

    // Iterasi melalui setiap tahun dalam abad ke-20
    for (int year = 1901; year <= 2000; ++year) {
        // Iterasi melalui setiap bulan dalam tahun tertentu
        for (int month = 1; month <= 12; ++month) {
            // Jika hari pertama bulan ini adalah Minggu (hari ke-7 dalam minggu)
            if (daysOfWeek == 7) {
                ++sundaysOnFirst;
            }

            // Menentukan jumlah hari dalam bulan ini
            int daysInMonth;
            if (month == 4 || month == 6 || month == 9 || month == 11) {
                daysInMonth = 30;
            } else if (month == 2) {
                if (isLeapYear(year)) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
            } else {
                daysInMonth = 31;
            }

            // Mengupdate hari dalam seminggu untuk bulan berikutnya
            daysOfWeek = (daysOfWeek + daysInMonth) % 7;
        }
    }

    cout << "Jumlah hari Minggu yang jatuh pada tanggal pertama setiap bulan selama abad ke-20 adalah: " << sundaysOnFirst << endl;

    return 0;
}
