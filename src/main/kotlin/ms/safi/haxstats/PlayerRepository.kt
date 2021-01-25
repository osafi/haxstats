package ms.safi.haxstats

import ms.safi.haxstats.model.Player
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface PlayerRepository : JpaRepository<Player, String>
