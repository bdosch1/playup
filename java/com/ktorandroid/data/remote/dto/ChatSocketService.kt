package com.plcoding.ktorandroid.data.remote
//sends and recieves messages through UI
interface ChatSocketService {
  suspend fun_initSession(
  username: String
  ): Resource<Unit>
  
  suspend fun sendmessage(message: String)
  
  fun ObserveMessages(): Flow<Message>
  
  suspend fun closeSession(); //closes application 
}
