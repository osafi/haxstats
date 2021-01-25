package ms.safi.haxstats

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HaxstatsApplication

fun main(args: Array<String>) {
	runApplication<HaxstatsApplication>(*args)
}
