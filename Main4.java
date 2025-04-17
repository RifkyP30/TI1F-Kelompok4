
public class Main4 {
  public static void main(String[] args) {
    // judul program
    System.out.println("===== SISTEM PENGELOLAAN NILAI MAHASISWA =====");
    // membuat array of object
    Mahasiswa4[] dataMahasiswa = new Mahasiswa4[3];
    MataKuliah4[] dataMataKuliah = new MataKuliah4[5];
    Penilaian4[] dataPenilaian = new Penilaian4[6];
    CariUrut4 dataCariUrut = new CariUrut4();
    // data mahasiswa
    dataMahasiswa[0] = new Mahasiswa4("244107020061", "Muhammad Daniel Assaqovi", "Informatika");
    dataMahasiswa[1] = new Mahasiswa4("244107020096", "Muhammad Rifky Praditya", "Informatika");
    dataMahasiswa[2] = new Mahasiswa4("244107020095", "Rachmad Febriananda", "Informatika");
    // data mata kuliah
    dataMataKuliah[0] = new MataKuliah4("MK001", "Algoritma & Struktur Data", 2);
    dataMataKuliah[1] = new MataKuliah4("MK002", "Aljabar Linier", 2);
    dataMataKuliah[2] = new MataKuliah4("MK003", "Bahasa Inggris", 3);
    dataMataKuliah[3] = new MataKuliah4("MK004", "Desain Antarmuka", 3);
    dataMataKuliah[4] = new MataKuliah4("MK005", "Basis Data", 2);
  }
}
