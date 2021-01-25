package ms.safi.haxstats.model

import org.springframework.data.jpa.domain.AbstractPersistable
import java.math.BigDecimal
import javax.persistence.Entity

@Entity
class PlayerStat(
    val playerAuth: String,
    val possession: BigDecimal,
    val shotsOnGoal: Short,
    val goals: Short,
    val assists: Short,
    val ownGoals: Short,
    val win: Short,
    val loss: Short
) : AbstractPersistable<Long>()
