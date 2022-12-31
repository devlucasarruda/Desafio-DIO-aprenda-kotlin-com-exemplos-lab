// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { INICIANTE, INTERMEDIARIO, AVANCADO }

data class Usuario (val nome: String, val id: Int, var email: String)

data class ConteudoEducacional(val nome: String, var duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("O aluno ${usuario.nome} foi matriculado na formação de $nome.")
    }
    
    fun conferirAlunosMatriculados(){
        println("Os alunos matriculados na Formação de $nome são: ")
        for(aluno in inscritos){  
        	println(aluno.nome)  
    	}  
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val logicPro = ConteudoEducacional("Lógica de Programação")
    val introKotlin = ConteudoEducacional("Introdução ao Kotlin", 45)
    
    val listConteudosKotlin = listOf(logicPro, introKotlin)
    
    val Kotlin = Formacao("Kotlin", listConteudosKotlin)
    
    val Lucas = Usuario("Lucas", 123, "lucas@email.com")
    val Falvo = Usuario("Falvo", 456, "falvo@algumemail.com")

    
    Kotlin.matricular(Lucas)
    Kotlin.matricular(Falvo)
    
    Kotlin.conferirAlunosMatriculados()
}
