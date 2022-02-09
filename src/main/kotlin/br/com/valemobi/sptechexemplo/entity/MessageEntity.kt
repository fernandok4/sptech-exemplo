package br.com.valemobi.sptechexemplo.entity

import javax.persistence.*

@Entity
@Table(name = "tb_message")
class MessageEntity(
    @Column @Id @GeneratedValue var id: Long,
    @Column var message: String
)