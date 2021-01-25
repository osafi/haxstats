package ms.safi.haxstats.model

import org.springframework.data.jpa.domain.AbstractPersistable
import javax.persistence.Entity

@Entity
class Goal(
    val scoringTeam: String,
    val scorerAuth: String,
    val assisterAuth: String,
    val ownGoal: Boolean
) : AbstractPersistable<Long>()
