package com.example.newapp.uicomponents

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newapp.model.Item
import com.example.newapp.model.TodoItemFactory
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter


@Composable
fun TodoItemInput(todoList: MutableList<Item>, modifier: Modifier = Modifier) {
    var (textValue, setText) = remember { mutableStateOf("") }
    val onTextChange = { text: String -> setText(text) }
    fun getNow(): String =
        LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM-dd HH:mm"))
    Row {
        TextField(value = textValue,
            onValueChange = onTextChange,
            placeholder = { Text("할 일을 입력하세요") },
            modifier=Modifier.height(50.dp)
        )
        Button(onClick = {
            todoList.add(Item(content = textValue, time = getNow()))
            println(textValue)
        },modifier=Modifier.height(50.dp).padding(5.dp)) {
            Text("추가")
        }
    }
}

@Preview
@Composable
private fun TodoItemInputPreview() {
    val todoList = TodoItemFactory.makeTodoList();
    TodoItemInput(todoList)
}