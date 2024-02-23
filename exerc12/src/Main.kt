package fundamentos
fun main(args: Array<String>){
    val nota = 9
    if (nota in 9 .. 10){
        println("Fantastico")
    }else if(nota in 7 .. 8){
        println("Parabens")
    } else if (nota in 4 .. 6){
        println("Te como recuperar")
    }else if (nota in 0 .. 3){
        println("Te vejo no próximo ano :(")
    }else{
        println("Nota inválida")
    }
}