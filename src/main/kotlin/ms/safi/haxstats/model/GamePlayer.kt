package ms.safi.haxstats.model

import org.springframework.data.jpa.domain.AbstractPersistable
import javax.persistence.Entity

@Entity
class GamePlayer(
    val playerAuth: String,
    val team: String
) : AbstractPersistable<Long>()
