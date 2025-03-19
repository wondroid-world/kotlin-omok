package gomoku.model.player

import gomoku.model.Board
import gomoku.model.Position
import gomoku.model.state.BlackStonePlayerState
import gomoku.model.state.FinishedPlayerState
import gomoku.model.state.PlayerState

class BlackPlayer(
    override val playerState: PlayerState = BlackStonePlayerState(),
) : Player {
    override fun put(
        position: Position,
        board: Board,
    ): Player {
        val newState = playerState.put(position, board)

        return when (newState) {
            is FinishedPlayerState -> finishedPlayer()
            else -> this
        }
    }

    override fun finishedPlayer(): Player {
        if (playerState is FinishedPlayerState) {
            return BlackPlayer()
        }
        throw IllegalStateException("흑돌 플레이어 게임은 끝나지 않았습니다.")
    }
}
