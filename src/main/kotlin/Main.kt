fun main(args: Array<String>) {

    println ("Здравствуйте, чтобы пройти в торговый центр вам нужно указать свои контактные данные:")

    print("Имя:")
    val name = readLine()

    print("Фамилия:")
    val surname = readLine()

    print ("Возраст:")
    val age = readLine()
    val a = age!!.toInt()

    if (a>=18) {
        println("$name $surname можете пройти в торговый центр")
    }else{ if(a<14){
        println("$name $surname вы должны пройти с полицией")
    } else println("$name $surname мы вынуждены не впускать вас")

    }

}