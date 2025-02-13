package com.example.myapplication.ui.theme.ui

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun PrimaryButton(modifier: Modifier = Modifier) {
    Button(
        onClick = {},
    ) {
        Text("MyButton")
    }
}


@Preview
@Composable
private fun PreviewPrimaryButton() {


    PrimaryButton()
}