package gomoku.model.player

import gomoku.model.Board
import gomoku.model.Position
import gomoku.model.state.PlayerState

interface Player {
    val playerState: PlayerState

    fun put(
        position: Position,
        board: Board,
    ): Player

    fun finishedPlayer(): Player
}
