package gomoku.model.state

import gomoku.model.Board
import gomoku.model.Position
import gomoku.model.Stone

class BlackStonePlayerState(
    override val count: Int = 1,
) : PlayerState {
    override val stone: Stone
        get() = Stone.BLACK

    override fun put(
        position: Position,
        board: Board,
    ): PlayerState {
        board.put(position, stone)
        if (count >= 5 && board.rule(position, stone, board)) return FinishedPlayerState()
        return WhiteStonePlayerState(count + 1)
    }
}
