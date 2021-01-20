package furhatos.app.iisembodiment.flow

import cc.mallet.util.CommandOption
import furhatos.nlu.common.*
import furhatos.flow.kotlin.*

import furhatos.gestures.Gestures
import java.io.File

val Start : State = state(Greetings) {

    onEntry {
        furhat.say("Welcome to virtual mobile store")
        delay(500)

        val content = File("C:/dev-repo/Feature-Recognition-and-AI-Bot-Interaction/label.txt")
        //println("$content")
        var label:String = content.readText()
        println(content)
        println(label)
        delay(500)

        if(label=="open_palm") {
            furhat.gesture(Gestures.Nod(duration=2.0, strength = 1.0))
            furhat.say(" Hi, I am Rose, your virtual salesman. " )
            delay(300)
            furhat.say(" Let me tell you all about the new phone Zapple.")
        }

        if(label=="open_dorsal"){
            furhat.gesture(Gestures.Smile(duration=2.0, strength = 1.0))
            furhat.say(" Thank you for your patience..")
            furhat.gesture(Gestures.Blink(duration=2.0, strength = 1.0))

        }

        if(label=="fist_palm") {
            furhat.gesture(Gestures.BigSmile(duration=2.0, strength = 1.0))
            furhat.say(" Zapple-X10 uses GSM technology  with  octa-core, 16GB  memory.")
            delay(300)
            furhat.say(" Price range is 100000 krona.")
            delay(300)
            furhat.say("Combined charging and audio jack.")
        }

        if(label=="fist_dorsal"){
            furhat.gesture(Gestures.Thoughtful(duration=2.0, strength = 1.0))
            furhat.say(" Zapple_X10 comes as a 512G and 1TB.")
            delay(300)
            furhat.say(" 512G is 4G only,while 1TB sup-ports 5G technology.")
        }

        if(label=="three_finger_palm"){
            furhat.gesture(Gestures.BrowRaise(duration=2.0, strength = 1.0))
            furhat.say(" It is world's first foldable phone, Comes in color metal black, baby pink and gold. " )
            delay(300)
            furhat.say("Has camera feature dual-lens camera system.")
            delay(300)
            furhat.say("It includes an f/1.8 6-element 12-megapixel wide-angle lens (26mm focal length) ")
            delay(300)
            furhat.say("and an f/2.4 5-element 12-megapixel ultra wide-angle lens.")
        }

        if (label == "three_fingers_dorsal") {
            furhat.gesture(Gestures.Surprise(duration=2.0, strength = 1.0))
            furhat.say(" Discount on Exchange of Model X9 and X8 upto 5000kr. " )
            delay(300)
            furhat.say("Mega Offer on payment with paypal upto 1000kr." )
            delay(300)
            furhat.say("Terms and Conditions applied.")
        }


    }



}
