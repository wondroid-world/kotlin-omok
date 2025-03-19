package gomoku.model.rule

import gomoku.model.Board
import gomoku.model.Position
import gomoku.model.Stone

interface Rule {
    fun fiveInARow(
        position: Position,
        stone: Stone,
        board: Board,
    ): Boolean
}
