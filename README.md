# Praktikum I/O Java - Latihan A-D

## Deskripsi
Project ini berisi latihan **Input/Output (I/O)** menggunakan Java, mencakup empat latihan dari mudah hingga menengah:

| Latihan | Deskripsi |
|---------|-----------|
| **Latihan A** | Menjumlahkan dua bilangan integer dari input keyboard menggunakan `Scanner`. |
| **Latihan B** | Menghitung jumlah kata dari satu baris teks yang dimasukkan melalui keyboard menggunakan `BufferedReader`. |
| **Latihan C** | Membaca file `input.txt`, menghitung frekuensi setiap kata, dan menyimpan hasil ke `count.txt` menggunakan `Files` dan `BufferedReader/BufferedWriter`. |
| **Latihan D** | Menyalin file biner (misal gambar) dari file sumber ke file tujuan menggunakan `FileInputStream` dan `FileOutputStream`, dengan argumen nama file. |

Semua latihan berada dalam **package `praktikumio`**.

---

## Struktur Project
PraktikumIOProject/
│
├─ src/
│ └─ praktikumio/
│ ├─ LatihanA.java
│ ├─ LatihanB.java
│ ├─ LatihanC.java
│ └─ LatihanD.java
├─ input.txt (untuk Latihan C)
├─ gambar.png (untuk Latihan D)
└─ README.md

---

## Cara Compile & Run

Latihan A
javac -d . src/praktikumio/LatihanA.java
java praktikumio.LatihanA
Input: dua angka integer.
Output: jumlah kedua angka.

Latihan B
javac -d . src/praktikumio/LatihanB.java
java praktikumio.LatihanB
Input: satu kalimat.
Output: jumlah kata.

Latihan C
javac -d . src/praktikumio/LatihanC.java
java praktikumio.LatihanC
Membaca input.txt dari folder project root.
Output: file count.txt berisi frekuensi kata (kata: jumlah).

Latihan D
javac -d . src/praktikumio/LatihanD.java
java praktikumio.LatihanD gambar.png salinan.png
Menyalin file gambar.png menjadi salinan.png.
Pastikan file gambar.png ada di folder project root.
Jika argumen tidak diberikan, program akan menampilkan:
Usage: java LatihanD <gambar> <salinan>

Catatan:
- Semua latihan menggunakan try-with-resources untuk menutup file/stream otomatis.
- Charset file teks: UTF-8.
- Jangan lupa menyesuaikan path file jika file sumber berada di folder berbeda.

Author
Nama: Milla Agustin
NIM: L0324020
