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
        val menu = readln().toIntOrNull()
        when(menu){
            1 -> transaksi.pemasukanPengeluaran()
            2 -> println("Saldo yang anda miliki sebanyak ${transaksi.getSaldo()}")
            3 -> transaksi.riwayatTransaksi()
            4 -> transaksi.analisisTotal()
            5 -> {
                println("Keluar")
                break
            }
            else -> println("Menu yang anda inginkan tidak valid")
        }
    }
}

class Transaksi {
    private var saldo = 0
    private var totalPemasukan = 0
    private var totalPengeluaran = 0
    var pemasukan = 0
    var pengeluaran = 0
    val listPemasukan = mutableListOf(pemasukan)
    val listPengeluaran = mutableListOf(pengeluaran)

    fun pemasukanPengeluaran() {
        println("1. Pemasukan")
        println("2. Pengeluaran")
        println("Pilih menu yang diinginkan: ")
        val menu = readln().toIntOrNull()
        when (menu) {
            1 -> {
                println("Masukkan nominal pemasukan: ")
                pemasukan = readln().toInt()
                saldo += pemasukan
                listPemasukan.add(pemasukan)
                totalPemasukan = listPemasukan.sum()
                println("Total pemasukkan anda adalah $totalPemasukan")
            }

            2 -> {
                println("Masukkan nominal pengeluaran: ")
                pengeluaran = readln().toInt()
                saldo -= pengeluaran
                listPengeluaran.add(pengeluaran)
                totalPengeluaran = listPengeluaran.sum()
            }
        }
        println("Saldo anda adalah $saldo")
    }
    fun getSaldo () : Int{
        return saldo
    }
    fun riwayatTransaksi(){
        if (listPemasukan.isEmpty() || listPengeluaran.isEmpty()){
            println("Riwayat transaksi tidak ditemukan")
        } else {
            println("Riwayat Pemasukan")
            listPemasukan.forEach {
                println("$it")
            }
            println("Riwayat Pengeluaran")
            listPengeluaran.forEach {
                println("$it")
            }
        }
    }
    fun analisisTotal(){
        println("Jumlah pemasukan sebanyak $totalPemasukan \nJumlah pengeluaran sebanyak $totalPengeluaran \nTotal Saldo anda adalah ${getSaldo()}")
    }
}