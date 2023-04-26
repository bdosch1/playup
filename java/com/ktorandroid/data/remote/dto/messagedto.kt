import kotlinx.serialization.Serializable

@Serializable
data class MessageDto //message setup TEXT/ TIMESTAMP/ USERNAME / ID
 val text String,
 val timestamp: long,
 val username: String,
 val id: String
