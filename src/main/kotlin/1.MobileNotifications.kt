// https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems#1

fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    val message = when {
        numberOfMessages <= 99 -> "You have $numberOfMessages notifications."
        else -> "Your phone is blowing up! You have 99+ notifications."
    }
    println(message)
}