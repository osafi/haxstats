package ms.safi.haxstats.model

import java.math.BigDecimal
import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.JoinColumn
import javax.persistence.OneToMany

@Entity
class Game(
    val redScore: Short,
    val blueScore: Short,
    val redPossession: BigDecimal,
    val bluePossession: BigDecimal,
    val winningTeam: String,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "game_id", nullable = false)
    val goals: List<Goal>,

    @OneToMany(cascade = [CascadeType.ALL])
    @JoinColumn(name = "game_id", nullable = false)
    val playerStats: List<PlayerStat>
) : AbstractEntity<Long>()
