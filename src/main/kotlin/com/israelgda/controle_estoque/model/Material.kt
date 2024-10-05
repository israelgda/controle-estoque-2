package com.israelgda.controle_estoque.model

import jakarta.persistence.*

@Entity
@Table(name = "material")
class Material(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var nome: String,

    var observacao: String,

    @Column(nullable = false)
    var comprimento: Double,

    @Column(nullable = false)
    var largura: Double,

    @Column(name = "preco_por_unidade", nullable = false)
    var precoPorUnidade: Double,

    @Column(name = "unidade_medida", nullable = false)
    var unidadeMedida: Double,

    @ManyToMany
    @JoinTable(
        name = "tb_categoria_material",
        joinColumns = [JoinColumn(name = "id_produto")],
        inverseJoinColumns = [JoinColumn(name = "id_categoria")]
    )
    var categorias: Set<Categoria>
) {

    constructor(): this(
        0L,
        "",
        "",
        0.0,
        0.0,
        0.0,
        0.0,
        setOf()
    )

}