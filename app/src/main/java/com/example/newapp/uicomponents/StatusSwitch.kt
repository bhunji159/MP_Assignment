package com.example.newapp.uicomponents

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun StatusSwitch(isChecked : Boolean,modifier: Modifier = Modifier,onCheckedChange: (Boolean) -> Unit) {
    Row(modifier= Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.CenterVertically

    ) {
        Text("미완료 항목만 보기")
        Switch(checked=isChecked, onCheckedChange = onCheckedChange)
    }
}