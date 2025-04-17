public class CariUrut4 {
  void urutNilaiAkhir(Penilaian4[] arrayPenilaian) {
    // urut menggunakan insertion sort
    for (int i = 1; i < arrayPenilaian.length; i++) {
      Penilaian4 temp = arrayPenilaian[i];
      int j = i;

      while (j > 0 && arrayPenilaian[j - 1].nilaiAkhir < temp.nilaiAkhir) {
        arrayPenilaian[j] = arrayPenilaian[j - 1];
        j--;
      }

      arrayPenilaian[j] = temp;
    }

    // menampilkan hasil
    for (int i = 0; i < arrayPenilaian.length; i++) {
      System.out.printf("%-30s %-30s %.1f\n", arrayPenilaian[i].mahasiswa.nama, arrayPenilaian[i].mataKuliah.namaMK, arrayPenilaian[i].nilaiAkhir);
    }

    void cariNimMahasiswa(Mahasiswa4[] arrayMahasiswa, String nimDicari) {
        //mencari data NIM
        boolean ketemu = false;
        for (int i = 0; i < arrayMahasiswa.length; i++) {
          if (arrayMahasiswa[i].NIM.equals(nimDicari)) {
            ketemu = true;
            System.out.println("Data ditemukan:");
            System.out.println("NIM: " + arrayMahasiswa[i].NIM + " | Nama: " + arrayMahasiswa[i].nama + " | Prodi: " + arrayMahasiswa[i].prodi);
          }
        }
      } 
  }
}