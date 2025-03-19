package gomoku.model.player

import gomoku.model.state.FinishedPlayerState
import gomoku.model.state.PlayerState

class WhitePlayer : Player {
    override val playerState: PlayerState
        get() = TODO("Not yet implemented")

    override fun finishedPlayer(): Player {
        if (playerState is FinishedPlayerState) {
            return WhitePlayer()
        }
        throw IllegalStateException("백돌 플레이어 게임은 끝나지 않았습니다.")
    }
}
