package com.example.prakpam2

import android.text.style.BackgroundColorSpan
import androidx.compose.animation.expandVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Shapes
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
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

    Column (modifier = Modifier.padding(top = 50.dp)
        .fillMaxWidth(),
        verticalArrangement = Arrangement.Center

    ){
        Box(modifier = Modifier
            .fillMaxWidth()
            .background(color = Color.Cyan)
            .padding(top = 70.dp)
        ) {
            Text(text = stringResource(id= R.string.pendaftaran),
                fontSize = 35.sp,
                fontWeight = FontWeight.Bold,
            )

        }
        Spacer(modifier= Modifier.height(height = 1.dp))
        Card (modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxWidth(fraction = 1f)
            .fillMaxSize(fraction = 1f)
            .padding(all = 20.dp),

            colors = CardDefaults.cardColors(
                containerColor = Color.White))
        {
            Spacer(modifier= Modifier.height(height = 20.dp))
            Text(text = stringResource(id = R.string.Nama),
                fontSize = 20.sp,
                fontFamily = FontFamily.Serif,
                fontWeight = FontWeight.Bold,
                color = Color.DarkGray,
                modifier = Modifier.padding(top = 10.dp)
                    .padding(horizontal = 20.dp))
            Spacer(modifier= Modifier.height(height = 15.dp))
            OutlinedTextField(
                value = textNama,
                singleLine = true,
                modifier = Modifier.width(width = 400.dp)
                    .padding(horizontal = 20.dp),
                leadingIcon = {Text(text = "Isi Nama Lengkap",
                    modifier = Modifier.padding(start = 5.dp))},
                onValueChange = {
                    textNama = it
                })
        }


    }

}