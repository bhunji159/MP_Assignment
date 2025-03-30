package com.example.newapp.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newapp.model.TodoItemFactory
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val todoList = remember { TodoItemFactory.makeTodoList() }
    var showAll by remember { mutableStateOf(true) }

    Column(modifier = modifier.padding(10.dp)) {

        TodoListTitle()
        StatusSwitch(isChecked = showAll) {showAll = !showAll }
        Spacer(modifier=Modifier.height(8.dp))
        TodoList(modifier = Modifier.weight(1f), todoList = todoList, showAll = showAll)
        Spacer(modifier = Modifier.height(8.dp))
        TodoItemInput(modifier = Modifier, todoList = todoList)

    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}