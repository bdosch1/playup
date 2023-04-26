package com.plcoding.ktroandroid.domain.model

data class Message(
  val text: String,
  val formattedTime: String,
  val username: String
  ){
  fun toMessage(): Message {
    val date =  Date(timestamp) //gets date using android and formats it default android set up
    val formattedDate = Date.format.getDateInstance()
             .getDateInstance(DateFormat.Default)
             .format(Date)
    getDate
    return Message(
        text = text
        formattedTime =
