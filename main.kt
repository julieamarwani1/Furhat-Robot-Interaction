package furhatos.app.iisembodiment

import furhatos.app.iisembodiment.flow.*
import furhatos.skills.Skill
import furhatos.flow.kotlin.*
import java.io.File


class IisembodimentSkill : Skill() {
    override fun start() {
        Flow().run(Start)

    }
}

fun main(args: Array<String>) {
    Skill.main(args)

}