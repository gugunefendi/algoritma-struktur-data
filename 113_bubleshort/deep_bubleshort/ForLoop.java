package deep_bubleshort;

public class ForLoop {
    
    public static void main(String[] args) {
        /*
         * Syntaxis for loop
         * for (initialization, condition, update(increment/decrement)) {
         *  // blok kode yang akan di eksekusi
         * }
         * 
         * Hal yang bisa dilakukan didalam initialization
         * 1. Mendeklarasikan variabel baru
         *      for (int i=0; i<5; i++) {...}
         * 2. Menginisialisasi variabel yang sudah ada
         *      int i;
         *      for (i=0; i<5; i++) {...}
         * 3. Menginisialisasi lebih dari satu variabel (pakai koma)
         *      for (int i=0, j=5; i<j; i++, j--) {...}
         * 4. Mengosongkan bagian initialization (jika sudah di initialization diluar)
         *      int i=0;
         *      for (; i<10; i++) {...}
         * 5. Memanggil function selama hasilnya tetap valid sebagai ekspresi
         *      for (System.out.print("Start: " ), int i=0; i<10; i++) {...}
         * 
         * Hal yang bisa di lakukan didalam condition
         * Bagian condition harus berupa ekspresi yang menghasilkan boolean (true atau false)
         * Jika true loop lanjut jika false loop berhenti
         * Contoh:
         * 1. Membaut ekspresi boolean (paling umum)
         *      for (int i=0; i<10; i++) {...}
         * 2. Menggunakan lebih dari satu kondisi dengan operator logika
         *      for (int i=0; j=10; i<j && j>5; i++, j--) {...}
         * 3. Memanggil fungsi yang mengembalikan nilai boolean
         *      for (int i=0; isValid(i); i++) {...}
         * 4. Menggunakan variabel boolean langsung
         *      boolean running = true;
         *      for (int i=0; i<10; i++) {
         *          if (i == 5) running = false;
         *      }
         * 
         * Hal yang bisa di lakukan didalam update(increment/decrement)
         * 1. Menambah nilai (increment)
         *      for (int i=0; i<10; i++) {...}
         * 2. Mengurangi nilai (decrement)
         *      for (int i=0; i<10; i--) {...}
         * 3. Menambah lebih dari 1
         *      for (int i=0; i<10; i+=2) {...}
         * 4. Mengurangi lebih dari 1
         *      for (int i=0; i<10; i-=2) {...}
         * 5. Menggunakan ekspresi lebih kompleks
         *      for (int i=0; i<10; i*=2) {...}
         * 6. Mengupdate lebih dari satu variabel (pisahkan dengan koma)
         *      for (int i=0, j=10; i<j; i++, j--) {
         *          System.out.println(i + ", " + j);
         *      }
         * 7. Memanggil fungsi (selama returnnya tidak mengganggu)
         *      for (int i=0; i<10; log(i)) {
         *          System.out.println("*");
         *          i++;
         *      }
         * 
         *      void log(int i) {
         *          System.out.println("Iterate: " + i);
         *      }
         * 8. Mengosongkan bagian update (asal di update didalam blok)
         *      for (int i=0; i<10; i++) {
         *          System.out.println(i);
         *          i++;
         *      }
         */

         for (int i=0, j=10; i<=j; i++, j--) {
            System.out.println(i +", " + j);
         }
         /*
          loop 1: i=0 < j=10 = 0
          loop 2: i=1 < j=9 = 1
          loop 3: i=2 < j=8 = 2
          loop 4: i=3 < j=7 = 3
          loop 5: i=4 < j=6 = 4
          loop 6: i=5 = j=5 = 5
          loop 7: i=6 !< && != j=4 = false
          loop 8: i=7 !< && != j=3 = false
          loop 9: i=8 !< && != j=2 = false
          loop 10: i=9 !< && != j=1 = false
          loop 11: i=10 !< && != j=0 = false
          */

            System.out.println("-----------------------------------");
          for (int i=5; i>0; i--) {
            System.out.println(i);
          }
          /*
           * 1. 5 > 0 = true
           * 2. 4 > 0 = true
           * 3. 3 > 0 = true
           * 4. 2 > 0 = true
           * 5. 1 > 0 = true
           * 6. 0 > 0 = false
           */

            System.out.println("-----------------------------------");
           for (int i=1; i<10; i*=2) {
            System.out.println(i);
           }
            


    }

}