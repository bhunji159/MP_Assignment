package com.example.newapp.uicomponents

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.newapp.model.TodoItemFactory

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    val todoList = remember { TodoItemFactory.makeTodoList() }
    Column(modifier = modifier.padding(10.dp)) {
        Row {
            TodoListTitle()
            //todo switch
        }
        Spacer(modifier=Modifier.height(8.dp))
        TodoList(modifier = Modifier.weight(1f), todoList = todoList)
        Spacer(modifier = Modifier.height(8.dp))
        TodoItemInput(modifier = Modifier, todoList = todoList)

    }
}

@Preview
@Composable
private fun MainScreenPreview() {
    MainScreen()
}