package br.com.valemobi.sptechexemplo.controller

import br.com.valemobi.sptechexemplo.entity.MessageEntity
import br.com.valemobi.sptechexemplo.repository.MessageRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
class MessageController {

    @Autowired
    private val messageRepository: MessageRepository? = null

    @GetMapping("/message")
    fun getAllMessages(): List<MessageEntity> {
        return messageRepository!!.findAll().toList()
    }

    @PostMapping("/message")
    fun insertMessage(@RequestBody message: MessageEntity): MessageEntity {
        return messageRepository!!.save(message)
    }

    @GetMapping("/message/{id}")
    fun getMessage(@PathVariable id: Long): MessageEntity {
        return messageRepository!!.findById(id).get()
    }

    @PutMapping("/message")
    fun updateMessage(@RequestBody message: MessageEntity): MessageEntity {
        return messageRepository!!.save(message)
    }

    @DeleteMapping("/message/{id}")
    fun deleteMessage(@PathVariable id: Long) {
        return messageRepository!!.deleteById(id)
    }
}
