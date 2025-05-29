package esoBuildManager.esoBuildManager.Database.Item;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
public class ItemSubtype {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer item_subtype_id;

    @ManyToOne
    @JoinColumn(name = "item_category_id", nullable = false)
    private ItemCategory category;

    @ManyToOne
    @JoinColumn(name = "item_type_id")
    private ItemType type;

    @Column(nullable = false)
    private String item_subtype_name;
}
