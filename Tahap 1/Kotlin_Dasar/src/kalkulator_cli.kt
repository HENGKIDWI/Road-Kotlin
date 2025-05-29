//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    angka 1
    print("Masukan angka pertama : ")
    var angka1 = readln().toDouble()

//    operasi
    println("""
        Masukan Operasi :
        1. penjumlahan
        2. pengurangan
        3. perkalian
        4. pembagian
    """.trimIndent())
    print("Masukan operasi :")
    var operasi = readln().toInt()

//    angka2
    print("Masukan angka kedua : ")
    var angka2 = readln().toDouble()

//    logika penghitungan
    if (operasi == 1){
        val total = angka1 + angka2
        println("Hasil : $total")
    }else if (operasi == 2){
        val total = angka1 - angka2
        println("Hasil : $total")
    }else if (operasi == 3){
        val total = angka1 * angka2
        println("Hasil : $total")
    }else if (operasi == 4){
        val total = angka1 / angka2
        println("Hasil : $total")
    }
}