package com.example.prakpam2

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

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

    Column (modifier = Modifier.padding(top = 100.dp)
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center
    ){
        Text(text = stringResource(id= R.string.pendaftaran),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold)
        Spacer(modifier= Modifier.height(height = 25.dp))
        Card {  }
    }

}