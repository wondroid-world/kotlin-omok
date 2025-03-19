package gomoku.model.state

import gomoku.model.Board
import gomoku.model.Position
import gomoku.model.Stone

interface PlayerState {
    val count: Int
    val stone: Stone

    fun put(
        position: Position,
        board: Board,
    ): PlayerState
}
