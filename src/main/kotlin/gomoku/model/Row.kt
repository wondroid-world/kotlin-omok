package gomoku.model

@JvmInline
value class Row(
    val value: Int,
) {
    operator fun rangeTo(row: Row): IntRange = 1..15

    init {
        require(value in 1..15)
    }
}
