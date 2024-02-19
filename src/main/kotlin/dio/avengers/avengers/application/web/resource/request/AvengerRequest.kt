package dio.avengers.avengers.application.web.resource


import dio.avengers.avengers.domain.avenger.Avenger
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class AvengerRequest(
    @field:NotNull(message = "Nick value requerid")
    @field:NotBlank
    @field:NotEmpty
    val nick: String,
    @field:NotNull(message = "Person value requerid")
    @field:NotBlank
    @field:NotEmpty
    val person: String,
    val description: String? = null,
    val history: String? = null
){
    fun toAvenger(): Avenger = Avenger(
        nick = this.nick,
        person = this.person,
        description = this.description,
        history = this.history
    )
    companion object{
        fun to(id: Long?, request: AvengerRequest) = Avenger(
            id = id,
            nick = request.nick,
            person = request.person,
            description = request.description,
            history = request.history
        )
    }

}
