//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    print("Masukan angka pertama :")
    var angka1 = readln().toDouble()
    print("Masukan angka kedua :")
    var angka2 = readln().toDouble()
    println("""
        Masukan Operasi :
        1. penjumlahan
        2. pengurangan
        3. perkalian
        4. pembagian
    """.trimIndent())
    print("Masukan operasi :")
    var operasi = readln().toInt()
    if (operasi == 1){
        val total = angka1 + angka2
        println("{$total}")
    }else if (operasi == 2){
        val total = angka1 - angka2
        println("{$total}")
    }else if (operasi == 3){
        val total = angka1 * angka2
        println("{$total}")
    }else if (operasi == 4){
        val total = angka1 / angka2
        println("{$total}")
    }
}