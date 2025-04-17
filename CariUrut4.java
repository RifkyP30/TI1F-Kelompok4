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

    
  }
}