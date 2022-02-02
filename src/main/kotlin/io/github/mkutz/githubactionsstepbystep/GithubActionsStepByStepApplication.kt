package io.github.mkutz.githubactionsstepbystep

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GithubActionsStepByStepApplication

fun main(args: Array<String>) {
    runApplication<GithubActionsStepByStepApplication>(*args)
}
