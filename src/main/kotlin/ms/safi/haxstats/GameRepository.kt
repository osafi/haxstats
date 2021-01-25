package ms.safi.haxstats

import ms.safi.haxstats.model.Game
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource
interface GameRepository : JpaRepository<Game, Long>
