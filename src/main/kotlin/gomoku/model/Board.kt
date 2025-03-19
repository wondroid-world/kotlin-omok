package gomoku.model

import gomoku.model.rule.Rule

class Board(
    private val rule: Rule,
) {
    private val board: MutableMap<Position, Stone> = mutableMapOf()

    init {
        for (x in 1..15) {
            for (y in 1..15) {
                board[Position(Row(x), Row(y))] = Stone.NONE
            }
        }
    }

    private fun isPlace(position: Position): Boolean {
        if (board[position] == Stone.NONE) return true
        throw IllegalArgumentException("이 위치에는 이미 돌이 위치해있습니다.")
    }

    fun stone(position: Position): Stone = requireNotNull(board[position]) { "잘못된 위치: $position" }

    fun put(
        position: Position,
        stone: Stone,
    ) {
        if (isPlace(position)) {
            board[position] = stone
        }
    }

    fun rule(
        position: Position,
        stone: Stone,
        board: Board,
    ): Boolean = rule.fiveInARow(position, stone, board)
}
