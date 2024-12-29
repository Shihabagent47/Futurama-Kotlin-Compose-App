package com.example.futurama.view

import android.provider.SyncStateContract.Columns
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.futurama.model.data.CharactersDataResponse
import com.example.futurama.model.data.Item
import com.example.futurama.viewmodel.CharactersViewModel

@Preview
@Composable
fun CharacterCardPreview(){
    CharacterItemCard(Item("", "Male",1,   "https://futuramaapi.com/static/img/human/marianne.webp", "Shihab Hossain","",  "",))
}
@Composable
fun CharacterItemCard(item: Item) {

    Card(
        onClick = { /*TODO*/ },
        modifier = Modifier
            .fillMaxWidth() // Make card take full width
            .padding(8.dp) // Add padding to the card
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically, // Vertically alignitems
            modifier = Modifier
                .padding(8.dp) // Add padding inside the card
        ) {
            Image(
                painter = rememberAsyncImagePainter(item.image),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .border(2.dp, androidx.compose.ui.graphics.Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp)) // Add space between image and text
            Column {Text(text = item.name, fontWeight = FontWeight.Bold, fontSize = 18.sp)
                Text(text = item.species)
            }
        }
    }

}

@Composable
fun CharacterComposable(viewModel: CharactersViewModel) {
    val characters by viewModel.characters.observeAsState()

    LaunchedEffect(Unit) {

        viewModel.getCharacters()

    }

    Column(

        modifier = Modifier.fillMaxSize().padding(vertical = 25.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
     if (characters?.items.isNullOrEmpty())
     {

         CustomCircularProgressBar()
     }
        else
        {
            var charList= characters?.items as List<Item>

            charList.let {
                LazyColumn {
                    items(it.size) { index ->
                        CharacterItemCard(charList[index])
                }
            }
     }


}}
}

@Composable
fun CustomCircularProgressBar() {
    ElevatedCard(
        onClick = { /*TODO*/ },
        modifier = Modifier.size(100.dp),
        shape = RoundedCornerShape(8.dp),

    ) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center) {
            CircularProgressIndicator(
                modifier = Modifier.size(50.dp),
                color = androidx.compose.ui.graphics.Color.White,
                strokeWidth = 5.dp
            )
        }
    }
}
