# Virtual Salesman
The purpose of the project is to develop a system that takes as input videos of various hand movements, extracts landmark information from them and defines the type of gesture made with this information. Furhat Robot(Virtual Agent) reacts according to the gesture provided in the input video.

# Objective
* To be able to extract landmarks
* To be able to recognise gestures with the help of extracted landmarks
* To be able to make the virtual agent(virtual salesman) react differently to each gesture

# Requirements
 It requires Furhat SDK(JDK-8), IntelliJ IDEA, Kotlin programming language  as a domain-specific-language (DSL) and some default libraries. 


## Responsive behavior of the Furhat Robot

Our virtual robot acts as a virtual salesman and provides all the information about the Zapple mobile phone based on the detected gesture. Every gesture has a unique response from the robot.

|Hand Gesture | Meaning |Speech |  Expression |
| ------------- |-------------| -----| -----|
|Open_Palm   | Introduction | Hi, I am Rose, your vir- tual salesman. Let me tell you all about the new phone Zapple_X10. | Nod |
|Open_Dorsal  | Stop | Thank you for your patience. | Blink	and Smile |
|Fist_Palm   | Product	Description | Zapple_X10 uses GSM technology with octa core, 16GB memory. Price range is 100000kr. Combined charging and audio jack | Big Smile |
|Fist_Dorsal  | Product	Variants with comparison | Zapple_X10 comes as a 512G and 1TB. 512G is 4G only,while 1TB sup- ports 5G technology.| Thoughtful |
|Three Finger_Palm  |Three features | It is world’s first foldable phone, Comes in color metal black, baby pink and gold. Has camera feature dual-lens camera system.  It   includes an f/1.8 6-element 12- megapixel wide-angle lens (26mm focal length) and an f/2.4 5-element 12-megapixel ultra wide-angle lens.| Brow Raise |
|Three Finger_Dorsal  | Offers | Discount on Exchange of Model X9 and X8 upto 5000kr. Mega Offer on payment with paypal upto 1000kr. Terms and Conditions applied.| Surprise|



