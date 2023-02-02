package com.maximvs.jetpackcomposetest.ui

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.outlined.Delete
import androidx.compose.material.icons.outlined.Edit
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Test() {
    Scaffold( //  в параметры Scaffold передаю topBar - он будет создан
        topBar = {
            TopAppBar( // Composable-функция
                title = {  // тоже // Composable-функция
                    Text(text = "TopAppBar")
                },
                navigationIcon = { // чтобы установить иконку обращаеюсь к этому параметру
                    IconButton(onClick = {}) {  // иконка с функцией нажатия
                        Icon(Icons.Filled.Menu, contentDescription = null)
                    }
                }
            )
        },
        drawerContent = {
            Text(text = "text1")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "text2")
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "text3")
        },
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Filled.Favorite, contentDescription = null)
                    },
                    label = {
                        Text(text = "Favour")
                    }
                )
                BottomNavigationItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Outlined.Edit, contentDescription = null)
                    },
                    label = {
                        Text(text = "Edit")
                    }
                )
                BottomNavigationItem(
                    selected = true,
                    onClick = {},
                    icon = {
                        Icon(Icons.Outlined.Delete, contentDescription = null)
                    },
                    label = {
                        Text(text = "Del")
                    }
                )
            }
        }
    ) {
        Text(
            modifier = Modifier.padding(it), // it - паддинг, пришедший в качестве параметра Scaffold
            text = "Scaffold content"
        )
    }

}