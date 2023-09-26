package com.fuadhev.movieappjetpack.presentation.movies.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberImagePainter
import com.fuadhev.movieappjetpack.domain.model.MovieUiModel
import com.fuadhev.movieappjetpack.R


@Composable
fun MovieListRow(
    movie: MovieUiModel,
    onItemClick: (MovieUiModel) -> Unit
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onItemClick(movie) }
            .padding(10.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
//        val defaultDrawableResId = R.drawable.ic_launcher_background // Drawable kaynağının ID'si
//        val painter = painterResource(id = defaultDrawableResId)
        Image(
            painter = rememberImagePainter(data = movie.Poster),
            contentDescription = movie.Title,
            modifier = Modifier
                .padding(16.dp)
                .size(200.dp, 200.dp)
                .clip(RectangleShape)
        )

        Column(
            modifier = Modifier.align(CenterVertically),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                movie.Title,
                style = androidx.compose.material.MaterialTheme.typography.h5,
                overflow = TextOverflow.Ellipsis,
                color = White,
                textAlign = TextAlign.Center
            )

            Text(
                movie.Year,
                style = androidx.compose.material.MaterialTheme.typography.h6,
                overflow = TextOverflow.Ellipsis,
                color = White,
                textAlign = TextAlign.Center
            )


        }


    }
}

@Composable
@Preview
fun MovieListRowPreview() {

    val movie =
        MovieUiModel("@drawable/ic_launcher_background.xml",
            "Batman","2015","")
    MovieListRow(movie = movie, onItemClick = { /* onItemClick işlevi */ })
}