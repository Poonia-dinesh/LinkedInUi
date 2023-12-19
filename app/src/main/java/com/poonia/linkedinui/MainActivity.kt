package com.poonia.linkedinui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poonia.linkedinui.Data.PostList
import com.poonia.linkedinui.Data.Postdata
import com.poonia.linkedinui.Home.BottomBarr
import com.poonia.linkedinui.Home.PostUi
import com.poonia.linkedinui.Home.TopBarr
import com.poonia.linkedinui.ui.theme.LinkedInUiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LinkedInUiTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LinkedInUI(posts = PostList.postList)
                }
            }
        }
    }
}
@Composable
fun LinkedInUI(posts : List<Postdata>){
    Scaffold(
        topBar = {
            TopBarr()
        },
        bottomBar = {
            BottomBarr()
        }
    ) {padding->
        LazyColumn(contentPadding = padding,
            verticalArrangement = Arrangement.spacedBy(6.dp)){
           items(posts){ post -> PostUi(postdata = post)
        }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LinkedInUiTheme {
        LinkedInUI(posts = PostList.postList)
    }
}