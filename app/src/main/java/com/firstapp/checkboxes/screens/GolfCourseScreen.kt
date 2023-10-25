package com.firstapp.checkboxes.screens


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

data class CourseHole(
    val hole: Int,
    val par: Int,
    val handcap: Int
)

data class GolfCourseInfo(
    val id: Int,
    val name: String,
    val holes: Array<CourseHole?> = arrayOfNulls<CourseHole>(18)
)

@Composable
fun DisplayCourse() {
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(.5f)
        ) {
            Text("column 1")
        }
        Column(
            modifier = Modifier
                .padding(5.dp)
                .fillMaxWidth(.5f)
        ) {
            Text("column 2")
        }
    }
}

@Composable
fun ListItem(GolfHole: CourseHole) {
    Surface(
        color = MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp,horizontal = 8.dp)
    ) {

    }
}