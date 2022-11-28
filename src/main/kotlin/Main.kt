sealed class User(open val id: String, open val password: String){
fun getInfo(): String{
    return "ID: $id, Password: $password"
}
}


data class Email(override val id: String, override val password: String): User(id, password) {

}
data class Facebook(override val id: String, override val password: String): User(id, password){

}
data class Google(override val id: String, override val password: String): User(id, password){

}
fun log(user: User) = when(user){
    is Email -> println("User: $user")
    is Google -> println("User: $user")
    is Facebook -> println("User: $user")
    else -> println("user does not exist")

}

fun main(args: Array<String>) {
    val email = Email("au134hd", "Gg123456")
    val google =Google("sgq93f4","Aa123456")
    val facebook =Facebook("dh245r4", "Rr123456")

    log(email)
    log(facebook)
    log(google)
}