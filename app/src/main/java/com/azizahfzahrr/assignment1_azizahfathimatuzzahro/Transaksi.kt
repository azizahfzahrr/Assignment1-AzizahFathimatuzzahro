package com.azizahfzahrr.assignment1_azizahfathimatuzzahro

import com.azizahfzahrr.assignment1_azizahfathimatuzzahro.TransaksiModel.listPemasukan
import com.azizahfzahrr.assignment1_azizahfathimatuzzahro.TransaksiModel.pemasukan
import com.azizahfzahrr.assignment1_azizahfathimatuzzahro.TransaksiModel.saldo
import com.azizahfzahrr.assignment1_azizahfathimatuzzahro.TransaksiModel.totalPemasukan
import com.azizahfzahrr.assignment1_azizahfathimatuzzahro.TransaksiModel.listPengeluaran
import com.azizahfzahrr.assignment1_azizahfathimatuzzahro.TransaksiModel.pengeluaran
import com.azizahfzahrr.assignment1_azizahfathimatuzzahro.TransaksiModel.totalPengeluaran

class Transaksi {

    fun pemasukanPengeluaran() {
        println("1. Pemasukan")
        println("2. Pengeluaran")
        println("Pilih menu yang diinginkan: ")
        val menu = readln().trim().toIntOrNull()
        when (menu) {
            1 -> {
                println("Masukkan nominal pemasukan: ")
                pemasukan = readln().trim().toInt()
                saldo += pemasukan
                listPemasukan.add(pemasukan)
                totalPemasukan = listPemasukan.sum()
                println("Total pemasukkan anda adalah $totalPemasukan")
            }

            2 -> {
                println("Masukkan nominal pengeluaran: ")
                pengeluaran = readln().trim().toInt()
                saldo -= pengeluaran
                listPengeluaran.add(pengeluaran)
                totalPengeluaran = listPengeluaran.sum()
            } else -> println("Menu yang anda inginkan tidak valid")
        }
        println("Saldo anda adalah $saldo")
    }
    fun getSaldo () = 0

    fun riwayatTransaksi(){
        if (listPemasukan.isEmpty() || listPengeluaran.isEmpty()){
            println("Riwayat transaksi tidak ditemukan")
        } else {
            println("Riwayat Pemasukan")
            listPemasukan.forEach {
                if (it > 0){
                    println(it)
                }
            }
            println("Riwayat Pengeluaran")
            listPengeluaran.forEach {
                if (it > 0){
                    println(it)
                }
            }
        }
    }
    fun analisisTotal(){
        println("Jumlah pemasukan sebanyak $totalPemasukan \nJumlah pengeluaran sebanyak $totalPengeluaran \nTotal Saldo anda adalah ${getSaldo()}")
    }
}