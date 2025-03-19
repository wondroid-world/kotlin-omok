package gomoku.model.state

import gomoku.model.Board
import gomoku.model.Position
import gomoku.model.Stone

class FinishedPlayerState : PlayerState {
    override val count: Int
        get() = throw IllegalStateException()
    override val stone: Stone
        get() = throw IllegalStateException()

    override fun put(
        position: Position,
        board: Board,
    ): PlayerState = throw IllegalStateException()
}
