package ms.safi.haxstats.model

import java.math.BigDecimal
import javax.persistence.Entity

@Entity
class PlayerStat(
    val playerAuth: String,
    val team: String,
    val possession: BigDecimal,
    val shotsOnGoal: Short,
    val goals: Short,
    val assists: Short,
    val ownGoals: Short,
    val win: Short,
    val loss: Short
) : AbstractEntity<Long>()
