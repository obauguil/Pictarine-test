package com.pictarine.picflix.ui.home

import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp

private const val COLUMN_COUNT = 2
private val GRID_SPACING = 8.dp

private val span: (LazyGridItemSpanScope) -> GridItemSpan = { GridItemSpan(COLUMN_COUNT) }

@Composable
fun ListMoviesGrid() {
}