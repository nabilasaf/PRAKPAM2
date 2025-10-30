package com.example.prakpam2

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormPendaftaran (modifier: Modifier){
    var textNama by remember { mutableStateOf(value = " ") }
    var textAlamat by remember { mutableStateOf(value = " ") }
    var textJK by remember { mutableStateOf(value = " ") }
    var textSP by remember {mutableStateOf(value = " ")  }

    var nama by remember { mutableStateOf(value = " ") }
    var alamat by remember { mutableStateOf(value = " ") }
    var jenis by remember { mutableStateOf(value = " ") }
    var StatusPerkawinan by remember { mutableStateOf(value = " ") }

    val gender:List<String> = listOf("Laki-laki","Perempuan")
    val status: List<String> = listOf("Janda","Lajang","Duda","Menikah")
}