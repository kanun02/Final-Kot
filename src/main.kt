 fun main()  {
     var myAnimal=Animal()
     myAnimal .eat()
     myAnimal .roam()
     myAnimal .makeNoise()
     myAnimal .sleep()
     var myHippo = Hippo()
     myHippo.eat()
     myHippo.roam()
     myHippo.makeNoise()
     myHippo.sleep()

     var myFeline = Feline()
     myFeline.roam()

     var myLion = Lion()
     myLion.eat()
     myLion.roam()
     myLion.makeNoise()
     myLion.sleep()

     var myCheetah = Cheetah()
     myCheetah.makeNoise()
     myAnimal.eat()

     var myLynx = Lynx()
     myLynx.makeNoise()
     myLynx.eat()

     var myCanine = Canine()
     myCanine.roam()

     var myWolf = Wolf()
     myWolf.makeNoise()
     myWolf.eat()

     var myFox = Fox()
     myFox.makeNoise()
     myFox.eat()

     var myVet = Vet()
     myVet.giveShot(myHippo)
     myVet.giveShot(myLion)
     myVet.giveShot(myCheetah)
     myVet.giveShot(myLynx)
     myVet.giveShot(myWolf)
     myVet.giveShot(myFox)

 }
 open class Animal{
     open val image = ""
     open val food = ""
     open val habitat = ""
     val hunger = 10

     open fun makeNoise(){
         println("The Animal is making a noise")
     }
     open fun eat (){
         println("The Animal is eating")
     }
     open fun roam(){
         println("The Animal is sleeping")
     }
     open fun sleep(){
         println("The Animal is sleep")
     }
 }
 class Hippo : Animal (){
     override val image = "hippo.jpg"
     override val food = "grass"
     override val habitat = "water"

     override fun makeNoise() {
         println("The Hippo is making a noise Hip! Hip!")
     }

     override fun eat() {
         println("The Hippo is eating $food")
     }
 }
 open class Feline : Animal (){
     override fun roam(){
         println("คลาส Felion กำลังเดินและปีนต้นไม้ไม่ได้")
     }
 }
 class Lion : Feline () {
     override val image = "lion.jpg"
     override val food = "เนื้อสัตว์"
     override val habitat = "น้ำ"

     override fun makeNoise() {
         println("ร้องคำรามแบบสิงโต")
     }

     override fun eat() {
         println("สิงโตกิน $food")
     }
 }
 class Cheetah : Feline () {
     override val image = "cheetah.jpg"
     override val food = "เนื้อสัตว์"
     override val habitat = "ถ้ำ"

     override fun makeNoise() {
         println("เสือชีต้าร้องคำรามแบบเสือ")
     }

     override fun eat() {
         println("เสือชีต้ากิน $food")
     }
 }
 class Lynx : Feline () {
     override val image = "lynx.jpg"
     override val food = "เนื้อสัตว์ เช่น แมว"
     override val habitat = "ถ้ำ"

     override fun makeNoise() {
         println("แมวป่ารองคำรามแบบแมวป่า")
     }

     override fun eat() {
         println("แมวป่ากิน $food")
     }
 }
 open class Canine : Animal(){
     override fun roam(){
         println("คลาส canine เดินบนพื้นได้เท่านั้น")
     }
 }
 class Wolf : Canine () {
     override val image = "wolf.jpg"
     override val food = "เพดดีกรี"
     override val habitat = "ถ้ำ"

     override fun makeNoise() {
         println("หมาป่าร้องร้องคำรามแบบสุนัข")
     }

     override fun eat() {
         println("หมาป่ากิน $food")
     }
 }
 class Fox : Canine() {
     override val image = "Fox.jpg"
     override val food = "เนื้อสัตว์"
     override val habitat = "บนบก"

     override fun makeNoise() {
         println("หมาป่าร้องร้องคำรามแบบสุนัข")
     }

     override fun eat() {
         println("หมาป่ากิน $food")
     }
 }
 class Vet{
     fun giveShot(animal: Animal){
         animal.makeNoise()
     }
 }
 fun main(arg : Array<String>){
     val animal =  arrayListOf(Hippo(),Lion(),Cheetah(),Lynx(),Wolf(),Fox())
     for (item in animal ){
         item.roam()
         item.eat()
     }
     val vet = Vet()
     val hippo = Hippo()
     val lion = Lion()
     val cheetah = Cheetah()
     val lynx = Lynx()
     val wolf = Wolf()
     val fox = Fox()
     vet.giveShot(hippo)
     vet.giveShot(lion)
     vet.giveShot(cheetah)
     vet.giveShot(lynx)
     vet.giveShot(wolf)
     vet.giveShot(fox)
 }


