// https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems#4

/*
Imagine that you need to create a music-player app.

Create a class that can represent the structure of a song. The Song class must include these code elements:

    Properties for the title, artist, year published, and play count
    A property that indicates whether the song is popular. If the play count is less than 1,000, consider it unpopular.
    A method that prints a song description in this format:

"[Title], performed by [artist], was released in [year published]."
 */


class Song {
    lateinit var title: String
    lateinit var artist: String
    var yearPublished: Int = 0
    var playCount: Int = 0
    var isPopular: Boolean

    init {
        this.isPopular = (playCount >= 1000)
    }

    fun songDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}