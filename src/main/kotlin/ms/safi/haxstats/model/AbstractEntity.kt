package ms.safi.haxstats.model

import com.fasterxml.jackson.annotation.JsonIgnore
import org.springframework.data.jpa.domain.AbstractPersistable
import java.io.Serializable
import javax.persistence.MappedSuperclass

@MappedSuperclass
abstract class AbstractEntity<PK : Serializable> : AbstractPersistable<PK>() {
    @JsonIgnore
    override fun isNew(): Boolean {
        return super.isNew()
    }
}