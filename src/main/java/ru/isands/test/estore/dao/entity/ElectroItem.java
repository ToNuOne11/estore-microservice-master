package ru.isands.test.estore.dao.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "store_electro_item")
public class ElectroItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "electro_item_counter")
    @TableGenerator(name = "electro_item_counter", pkColumnName = "name", pkColumnValue = "ru.isands.test.estore.dao.entity.ElectroItem", table = "counter", valueColumnName = "currentid", allocationSize = 1)
    @Column(name = "id_", unique = true, nullable = false)
    Long id;

    @Column(name = "name", nullable = false, length = 150)
    String name;

    @Column(name = "electroTypeId", nullable = false)
    Long electroTypeId;

    @Column(name = "price", nullable = false)
    Long price;

    @Column(name = "quantity", nullable = false)
    Long quantity;

    @Column(name = "isArchive", nullable = false)
    boolean isArchive;

    @Column(name = "description", nullable = false, columnDefinition = "text")
    String description;
}
