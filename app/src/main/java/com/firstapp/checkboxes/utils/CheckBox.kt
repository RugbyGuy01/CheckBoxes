package com.firstapp.checkboxes.utils


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class ParToggleableInfo(
    val isChecked: Boolean,
    val text: String
)

@Composable
fun SelectPar() {
    val selectPar = remember {
        mutableStateListOf(
            ParToggleableInfo(
                isChecked = false,
                text = "Par 3"
            ),
            ParToggleableInfo(
                isChecked = true,
                text = "Par 4"
            ),
            ParToggleableInfo(
                isChecked = false,
                text = "Par 5"
            )
        )
    }
    Column(modifier = Modifier.fillMaxSize()) {

        selectPar.forEachIndexed { index, info ->
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    //.fillMaxWidth()
                    .height(50.dp)
                    .padding(start = 10.dp)
                    .clickable {
                        selectPar.replaceAll {
                            it.copy(
                                isChecked = it.text == info.text // all other case change it to false
                            )
                        }
                    }
                    .padding(end = 16.dp)
            )
            {
                RadioButton(
                    selected = info.isChecked,
                    onClick = {
                        selectPar.replaceAll {
                            it.copy(
                                isChecked = it.text == info.text // all other case change it to false
                            )
                        }
                    }
                )
                Text(
                    info.text,
                    modifier = Modifier
                        .padding(start = 16.dp),
                    fontSize = 20.sp
                )
            }
        }
    }
}