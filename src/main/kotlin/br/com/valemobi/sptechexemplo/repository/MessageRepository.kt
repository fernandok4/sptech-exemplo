package br.com.valemobi.sptechexemplo.repository

import br.com.valemobi.sptechexemplo.entity.MessageEntity
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository: CrudRepository<MessageEntity, Long>