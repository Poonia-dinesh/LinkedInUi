package com.poonia.linkedinui.Home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Close
import androidx.compose.material.icons.rounded.MoreVert
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.poonia.linkedinui.Data.Postdata
import com.poonia.linkedinui.R


@Composable
fun PostUi (postdata: Postdata){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(6.dp)){
         Row(modifier = Modifier
             .fillMaxWidth(),
             horizontalArrangement = Arrangement.SpaceEvenly) {
             Image(
                 painter = painterResource(id = postdata.userProfile), contentDescription = null,
                 modifier = Modifier
                     .size(48.dp)
                     .clip(CircleShape)
             )

             Column(modifier = Modifier
                 .fillMaxWidth(0.7f)
                 .padding(start = 6.dp)) {
                 Row {
                     Text(text = "${postdata.userName} • ",
                         fontWeight = FontWeight.Bold,
                         style = typography.bodyMedium)
                     
                     Text(text = "Following",
                         fontWeight = FontWeight.Light,
                         style = typography.bodyMedium)
                 }

                 Text(text = postdata.userDescripttion,
                     fontWeight = FontWeight.Light,
                     style = typography.bodySmall,
                     overflow = TextOverflow.Ellipsis,
                     maxLines = 1)
                 Row(verticalAlignment = Alignment.CenterVertically,
                     horizontalArrangement = Arrangement.spacedBy(2.dp)) {
                     Text(text = "51m",
                         fontWeight = FontWeight.Light,
                         style = typography.bodySmall)
                     Text(text = "•")
                     Icon(painter = painterResource(id = R.drawable.global), contentDescription =null,
                         modifier = Modifier.size(11.dp))
                 }
             }
           Row(
               verticalAlignment = Alignment.Top
           ) {
               IconButton(onClick = { /*TODO*/ }) {
                   Icon(
                       imageVector = Icons.Rounded.MoreVert,contentDescription = null
                   )
               }

               IconButton(onClick = { /*TODO*/ }) {
                   Icon(
                       imageVector = Icons.Rounded.Close,
                       contentDescription = null
                   )
               }
           }
         }

 Spacer(modifier = Modifier.height(10.dp))

        Text(text= postdata.postDescription
                , style = typography.bodyMedium,
            overflow = TextOverflow.Ellipsis,
            maxLines = 3)

        Spacer(modifier = Modifier.height(5.dp))

        Image(painter = painterResource(id = postdata.postImage), contentDescription =null,
            modifier = Modifier
                .fillMaxHeight(0.7f)
                .fillMaxWidth()
                )

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp)
        ){
            Row(verticalAlignment = Alignment.CenterVertically) {
                Box(
                    modifier = Modifier
                        .size(18.dp)
                        .border(
                            color = Color.White,
                            width = 1.dp,
                            shape = CircleShape
                        )
                        .background(
                            color = Color(0xFF2596be),
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                      painter = painterResource(id = R.drawable.thumb_up),
                        contentDescription = null,
                        modifier = Modifier
                            .size(16.dp),
                        tint = Color.White
                    )
                }
                Box(
                    modifier = Modifier
                        .size(18.dp)
                        .border(
                            color = Color.White,
                            width = 1.dp,
                            shape = CircleShape
                        )
                        .background(
                            color = Color(0xFF3CF836),
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.clap),
                        contentDescription = null,
                        modifier = Modifier
                            .size(16.dp),
                    )
                }
                Text(text = " 281")
            }
            Text(text = "4 comments • 11 reposts")
        }


        Divider(thickness = 1.dp, color = Color.LightGray)
       Row(horizontalArrangement = Arrangement.SpaceBetween,
           modifier = Modifier
               .fillMaxWidth()){
           IconButton(modifier = Modifier.width(88.dp),onClick = { /*TODO*/ }) {
               Column( horizontalAlignment = Alignment.CenterHorizontally) {
                   Icon(
                       painter = painterResource(id = R.drawable.thumb_up),
                       contentDescription = null,
                       modifier = Modifier.size(18.dp),
                       tint = Color.DarkGray
                   )
                   Text(
                       text = "Like",
                       // textAlign = TextAlign.Start,
                   )
               }
           }
           IconButton(modifier = Modifier.width(88.dp),onClick = { /*TODO*/ }) {
           Column( horizontalAlignment = Alignment.CenterHorizontally) {
                       Icon(
                           painter = painterResource(id = R.drawable.comment),
                           contentDescription = null,
                           modifier = Modifier.size(18.dp),
                           tint = Color.DarkGray
                       )
                       Text(
                           text = "Comment",
                          // textAlign = TextAlign.Start,
                       )
               }
           }
           IconButton(modifier = Modifier.width(88.dp),onClick = { /*TODO*/ }) {
               Column(horizontalAlignment = Alignment.CenterHorizontally)
               {
                   Icon(
                       painter = painterResource(id = R.drawable.reposticon),
                       contentDescription = null,
                       modifier = Modifier.size(18.dp) ,
                       tint = Color.DarkGray
                   )
                   Text(text = "Repost")
               }
           }
           IconButton(modifier = Modifier.width(88.dp),onClick = { /*TODO*/ }) {
               Column( horizontalAlignment = Alignment.CenterHorizontally) {
                   Icon(
                       painter = painterResource(id = R.drawable.send),
                       contentDescription = null,
                       modifier = Modifier.size(18.dp),
                       tint = Color.DarkGray
                   )
                   Text(
                       text = "Send",
                   )
               }
           }
       }

    }
}
@Preview(showBackground = true)
@Composable
fun prevPost(){
    PostUi(Postdata("Dinesh Puniya","Android | Accenture | Ex- Acty System India | Amity University",R.drawable.profile,
        "Hi everyone! I'm excited to announce that I am currently seeking new opportunities as a Java or Android Developer and" +
                " I'm available to join immediately! Experienced Java Developer proficient in crafting scalable solutions",
        R.drawable.linkedin))
}


























