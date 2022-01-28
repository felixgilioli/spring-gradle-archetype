package ${package}.${artifactName}

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TemplateSpringApplication

fun main(args: Array<String>) {
	runApplication<TemplateSpringApplication>(*args)
}
