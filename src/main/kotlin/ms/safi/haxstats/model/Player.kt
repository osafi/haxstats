package ms.safi.haxstats.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
class Player(
    @Id
    val auth: String,
    val name: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Player

        if (auth != other.auth) return false

        return true
    }

    override fun hashCode(): Int {
        return auth.hashCode()
    }

    override fun toString(): String {
        return "Player(auth='$auth', name='$name')"
    }

}
