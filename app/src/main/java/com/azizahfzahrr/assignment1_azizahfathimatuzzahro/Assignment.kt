package com.azizahfzahrr.assignment1_azizahfathimatuzzahro

fun main(){
    val transaksi = Transaksi()
    while (true){
        println("Personal Finance Manager Application")
        println("1. Input Pemasukan dan Pengeluaran")
        println("2. Perhitungan Saldo")
        println("3. Riwayat Transaksi")
        println("4. Analisis Total")
        println("5. Keluar")
        println("Masukkan menu yang diinginkan: ")
        val menu = readln().trim().toIntOrNull()
        when(menu){
            1 -> transaksi.pemasukanPengeluaran()
            2 -> println("Saldo yang anda miliki sebanyak ${transaksi.getSaldo()}")
            3 -> transaksi.riwayatTransaksi()
            4 -> transaksi.analisisTotal()
            5 -> {
                println("Anda keluar dari aplikasi Finance Manager Application")
                break
            }
            else -> println("Menu yang anda inginkan tidak valid")
        }
    }
}