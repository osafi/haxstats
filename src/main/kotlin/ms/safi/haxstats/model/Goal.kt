package ms.safi.haxstats.model

import javax.persistence.Entity

@Entity
class Goal(
    val scoringTeam: String,
    val scorerAuth: String,
    val assisterAuth: String,
    val ownGoal: Boolean
) : AbstractEntity<Long>()
